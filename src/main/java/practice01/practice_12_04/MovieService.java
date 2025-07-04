package practice01.practice_12_04;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/*Управление рейтингами:
Хранение оценок в Map<Movie, List<Rating>>.
Метод для добавления оценки к фильму. Метод должен быть потокобезопасным и валидировать оценку на допустимость
(например, оценка должна быть в пределах от 1 до 10).
Возможность расчета средней оценки для каждого фильма.

Обработка данных:
Использование Stream API для подсчёта средней оценки.
Использование Stream API и лямбда-выражений для сортировки фильмов по средней оценке.*/
public class MovieService {
    private final ConcurrentHashMap<Movie, List<Rating>> movieRaitingList = new ConcurrentHashMap<>();



    public synchronized void addRating(Movie movie, Rating raiting) {
        if (raiting.getRating().doubleValue() < 1 || raiting.getRating().doubleValue() > 10) {
            throw new IllegalArgumentException("Оценка фильма должна быть от 1 до 10");
        }

        movieRaitingList.computeIfAbsent(movie, r -> new ArrayList<>()).add(raiting);

    }

    public OptionalDouble averageMovieRaitind(Movie movie) {
        List<Rating> ratings = movieRaitingList.get(movie);

         return ratings.stream()
                .mapToInt(r -> r.getRating().intValue())
                 .average();

    }

    public List<Movie> getAverageMovieSorted() {
       return movieRaitingList.keySet().stream()
                .sorted(
                        Comparator.comparingDouble(
                                (Movie m) -> averageMovieRaitind(m).getAsDouble()
                        ).reversed()
                )
                .collect(Collectors.toList());
    }

    public boolean containsRaiting(Movie movie, Rating raiting) {
        return movieRaitingList.get(movie).contains(raiting);
    }

    public static void main(String[] args) {
        MovieService movieService = new MovieService();

        Movie movie = new Movie("Monster Inc");
        Movie movie2 = new Movie("SomeMovie");

        movieService.addRating(movie, new Rating<>(1.0));
        movieService.addRating(movie, new Rating<>(5.0));
        movieService.addRating(movie, new Rating<>(10.0));
        movieService.addRating(movie, new Rating<>(8.0));
        movieService.addRating(movie2, new Rating<>(5.0));

        System.out.println(movieService.averageMovieRaitind(movie));
        System.out.println(movieService.averageMovieRaitind(movie2));

        movieService.getAverageMovieSorted().forEach(
                (s) -> System.out.println(s.getName())
        );

        movieService.addRating(movie, new Rating<>(-1.0));
    }
}
