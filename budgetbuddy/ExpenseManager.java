package budgetbuddy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ExpenseManager {

    private final ArrayList<Expense> expenses;
    private final LinkedList<Expense> history; // chronological history (oldest -> newest)
    private final Stack<Expense> undoStack;
    private final Set<String> categories;

    // Singleton pattern optional; you can also instantiate normally
    private static ExpenseManager instance;

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private ExpenseManager() {
        this.expenses = new ArrayList<>();
        this.history = new LinkedList<>();
        this.undoStack = new Stack<>();
        this.categories = new TreeSet<>(); // alphabetical order
        // default categories (12) - you can change or add more at runtime
        String[] defaultCats = {
            "Food & Drinks", "Transport", "Utilities", "Groceries",
            "Entertainment", "Health", "Education", "Shopping",
            "Bills", "Travel", "Gifts", "Others"
        };
        categories.addAll(Arrays.asList(defaultCats));
    }

    public static ExpenseManager getInstance() {
        if (instance == null) {
            instance = new ExpenseManager();
        }
        return instance;
    }

    // Add an expense to all relevant structures
    public void addExpense(Expense e) {
        if (e == null) {
            return;
        }
        expenses.add(e);
        history.add(e); // newest added at tail
        undoStack.push(e);
        categories.add(e.getCategory());
    }

    // Undo last add (example usage)
    public Expense undoLastAdd() {
        if (undoStack.isEmpty()) {
            return null;
        }
        Expense last = undoStack.pop();
        // remove one occurrence from expenses and history (first matching instance)
        expenses.remove(last);
        history.removeLastOccurrence(last); // keeps other same-value items if any
        return last;
    }

    public List<Expense> getAllExpenses() {
        // return a shallow copy to prevent accidental external modifications
        return new ArrayList<>(expenses);
    }

    public List<Expense> getHistoryChronological() {
        return new ArrayList<>(history);
    }

    public Set<String> getCategories() {
        return new TreeSet<>(categories);
    }

    /*
     * Linear search methods (requirement): O(n) scans
     */
    // Search by category (exact match, case-insensitive)
    public List<Expense> linearSearchByCategory(String category) {
        List<Expense> result = new ArrayList<>();
        if (category == null) {
            return result;
        }
        String q = category.trim().toLowerCase();
        for (Expense e : expenses) {
            if (e.getCategory() != null && e.getCategory().toLowerCase().equals(q)) {
                result.add(e);
            }
        }
        return result;
    }

    // Search by notes (substring, case-insensitive)
    public List<Expense> linearSearchByNotes(String query) {
        List<Expense> result = new ArrayList<>();
        if (query == null) {
            return result;
        }
        String q = query.trim().toLowerCase();
        for (Expense e : expenses) {
            if (e.getNotes() != null && e.getNotes().toLowerCase().contains(q)) {
                result.add(e);
            }
        }
        return result;
    }

    // Search by exact LocalDate
    public List<Expense> linearSearchByDate(LocalDate date) {
        List<Expense> result = new ArrayList<>();
        if (date == null) {
            return result;
        }
        for (Expense e : expenses) {
            if (date.equals(e.getDate())) {
                result.add(e);
            }
        }
        return result;
    }

    // Generic search: tries category exact, notes substring, or date string equal (yyyy-MM-dd)
    public List<Expense> linearSearch(String query) {
        List<Expense> result = new ArrayList<>();
        if (query == null || query.trim().isEmpty()) {
            return result;
        }
        String q = query.trim().toLowerCase();

        // try parse date
        try {
            LocalDate d = LocalDate.parse(q, dateFormatter);
            return linearSearchByDate(d);
        } catch (Exception ignored) {
        }

        // category exact
        for (Expense e : expenses) {
            if (e.getCategory() != null && e.getCategory().toLowerCase().equals(q)) {
                result.add(e);
            }
        }
        // notes substring
        for (Expense e : expenses) {
            if (e.getNotes() != null && e.getNotes().toLowerCase().contains(q)) {
                if (!result.contains(e)) {
                    result.add(e);
                }
            }
        }

        return result;
    }

    /*
     * Sorting (bubble sort) - requirement: use bubble sort
     * We'll implement an in-place bubble sort on the ArrayList expenses.
     * mode: "date" (most recent to oldest), "category" (alphabetical A->Z), "amount" (highest->lowest)
     */
    public void bubbleSortBy(String mode) {
        if (mode == null || expenses.size() <= 1) {
            return;
        }
        int n = expenses.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                Expense a = expenses.get(j);
                Expense b = expenses.get(j + 1);
                boolean shouldSwap = false;

                switch (mode.toLowerCase()) {
                    case "date" -> {
                        // sort by date descending: most recent should come first
                        if (a.getDate().isBefore(b.getDate())) {
                            shouldSwap = true;
                        }
                    }
                    case "category" -> {
                        // alphabetical ascending (A -> Z)
                        if (a.getCategory().compareToIgnoreCase(b.getCategory()) > 0) {
                            shouldSwap = true;
                        }
                    }
                    case "amount" -> {
                        // amount descending (largest -> smallest)
                        if (a.getAmount() < b.getAmount()) {
                            shouldSwap = true;
                        }
                    }
                    default -> {
                    }
                }
                // unknown mode: do nothing

                if (shouldSwap) {
                    expenses.set(j, b);
                    expenses.set(j + 1, a);
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // array already sorted
            }
        }
    }

    /*
     * Summaries
     */
    // Returns map from month index (1..12) -> total amount
    public Map<Integer, Double> getMonthlyTotals() {
        Map<Integer, Double> totals = new LinkedHashMap<>();
        // init months 1..12
        for (int m = 1; m <= 12; m++) {
            totals.put(m, 0.0);
        }

        for (Expense e : expenses) {
            int m = e.getDate().getMonthValue();
            totals.put(m, totals.getOrDefault(m, 0.0) + e.getAmount());
        }
        return totals;
    }

    // Returns map from category -> total amount (only categories seen)
    public Map<String, Double> getCategoryTotals() {
        Map<String, Double> totals = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (String c : categories) {
            totals.put(c, 0.0); // include all known categories
        }
        for (Expense e : expenses) {
            String c = e.getCategory();
            totals.put(c, totals.getOrDefault(c, 0.0) + e.getAmount());
        }
        return totals;
    }

    // Convenience: returns 12-row table-friendly list of month names and totals
    public List<MonthTotal> getMonthlyTotalsList() {
        Map<Integer, Double> map = getMonthlyTotals();
        List<MonthTotal> list = new ArrayList<>();
        for (int m = 1; m <= 12; m++) {
            list.add(new MonthTotal(m, map.getOrDefault(m, 0.0)));
        }
        return list;
    }

    // Convenience: returns list of CategoryTotal for table
    public List<CategoryTotal> getCategoryTotalsList() {
        Map<String, Double> map = getCategoryTotals();
        List<CategoryTotal> list = new ArrayList<>();
        // If you want exactly 12 category rows, ensure categories set has 12 entries (see constructor)
        for (String cat : map.keySet()) {
            list.add(new CategoryTotal(cat, map.get(cat)));
        }
        return list;
    }

    // small helper DTOs
    public static class MonthTotal {

        public final int month; // 1..12
        public final double total;

        public MonthTotal(int month, double total) {
            this.month = month;
            this.total = total;
        }

        public String monthName() {
            return java.time.Month.of(month).name(); // returns UPPERCASE; format in UI if needed
        }
    }

    public static class CategoryTotal {

        public final String category;
        public final double total;

        public CategoryTotal(String category, double total) {
            this.category = category;
            this.total = total;
        }
    }

    /*
     * Utility: parse a YYYY-MM-DD string to LocalDate; returns null if fails
     */
    public static LocalDate parseDate(String s) {
        if (s == null) {
            return null;
        }
        try {
            return LocalDate.parse(s.trim(), dateFormatter);
        } catch (Exception e) {
            return null;
        }
    }
}
