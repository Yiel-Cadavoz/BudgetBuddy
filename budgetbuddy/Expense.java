package budgetbuddy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Expense {
     private String category;
    private String notes; // optional
    private double amount;
    private LocalDate date;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Expense(String category, String notes, double amount, LocalDate date) {
        this.category = category;
        this.notes = notes == null ? "" : notes;
        this.amount = amount;
        this.date = date;
    }

    // convenience constructor from date parts
    public Expense(String category, String notes, double amount, int year, int month, int day) {
        this(category, notes, amount, LocalDate.of(year, month, day));
    }

    public String getCategory() {
        return category;
    }

    public String getNotes() {
        return notes;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDateString() {
        return date.format(formatter);
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "category='" + category + '\'' +
                ", notes='" + notes + '\'' +
                ", amount=" + amount +
                ", date=" + getDateString() +
                '}';
    }

    // equals and hashCode in case Sets/Maps need uniqueness
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Expense)) return false;
        Expense expense = (Expense) o;
        return Double.compare(expense.amount, amount) == 0 &&
                Objects.equals(category, expense.category) &&
                Objects.equals(notes, expense.notes) &&
                Objects.equals(date, expense.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, notes, amount, date);
    }
}
