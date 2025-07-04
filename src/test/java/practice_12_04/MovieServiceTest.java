package practice_12_04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice01.practice_12_04.Movie;
import practice01.practice_12_04.MovieService;
import practice01.practice_12_04.Rating;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    static MovieService movieService;
    Movie movie;
    Movie movie2;

    @BeforeEach
    void setUp() {
        movieService = new MovieService();
        movie = new Movie("Monster Inc");
        movie2 = new Movie("SomeMovie");
    }

    @Test
    void addRating() {
        Rating<Integer> rating = new Rating<>(1);
        movieService.addRating(movie, rating);
        assertTrue(movieService.containsRaiting(movie, rating));
    }

    @Test
    void addBadRating() {
        assertThrows(IllegalArgumentException.class,
                () -> movieService.addRating(movie, new Rating<>(0)));
    }

    @Test
    void averageMovieRaitind() {
        movieService.addRating(movie2, new Rating(5));
        movieService.addRating(movie2, new Rating(8));
        movieService.addRating(movie2, new Rating(3));
        assertEquals(5,Math.round(movieService.averageMovieRaitind(movie2).getAsDouble()));

    }


}