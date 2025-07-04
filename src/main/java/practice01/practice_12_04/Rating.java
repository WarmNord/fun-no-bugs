package practice01.practice_12_04;

/*Rating<T extends Number>: Класс для хранения рейтинга фильма. T может быть Integer, Double и т.д.
 */
public class Rating<T extends Number> {
    private T rating;

    public Rating(T rating) {
        this.rating = rating;
    }

    T getRating() {
        return this.rating;
    }

    void setRating(T rating) {
        this.rating = rating;
    }
}
