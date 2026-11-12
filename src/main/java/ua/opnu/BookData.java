package ua.opnu;

public class BookData implements Comparable<BookData> {
    private String title;
    private String author;
    private int reviews;
    private double total;

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    public double getRating() {
        if (reviews == 0) return 0.0;
        return total / reviews;
    }

    @Override
    public int compareTo(BookData other) {
        double thisRating = this.getRating();
        double otherRating = other.getRating();

        // Книга з більшим рейтингом є "меншою" (іде першою при сортуванні)
        int ratingComparison = Double.compare(otherRating, thisRating);
        if (ratingComparison != 0) {
            return ratingComparison;
        }

        // При рівності рейтингів порівнюємо за назвою
        return this.title.compareTo(other.title);
    }
}