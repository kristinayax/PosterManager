package ru.netology.postermanager.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class FilmsTest {

    @Test
    public void shouldAddNewMovie() {
        Films films = new Films();

        films.addFilm("Movie1");

        String[] expected = {"Movie1"};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNoneMovie() {
        Films films = new Films();

        String[] expected = {};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovies() {
        Films films = new Films();

        films.addFilm("Movie1");
        films.addFilm("Movie2");
        films.addFilm("Movie3");
        films.addFilm("Movie4");
        films.addFilm("Movie5");
        films.addFilm("Movie6");
        films.addFilm("Movie7");
        films.addFilm("Movie8");
        films.addFilm("Movie9");
        films.addFilm("Movie10");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6", "Movie7", "Movie8", "Movie9", "Movie10"};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllNull() {
        Films films = new Films();

        String[] expected = {};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovie() {
        Films films = new Films();

        films.addFilm("Movie10");

        String[] expected = {"Movie10"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieIfOverTheLimit() {
        Films films = new Films();

        films.addFilm("Movie1");
        films.addFilm("Movie2");
        films.addFilm("Movie3");
        films.addFilm("Movie4");
        films.addFilm("Movie5");
        films.addFilm("Movie6");
        films.addFilm("Movie7");
        films.addFilm("Movie8");
        films.addFilm("Movie9");
        films.addFilm("Movie10");
        films.addFilm("Movie11");

        String[] expected = {"Movie11", "Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieIfBelowTheLimit() {
        Films films = new Films();

        films.addFilm("Movie1");
        films.addFilm("Movie2");
        films.addFilm("Movie3");
        films.addFilm("Movie4");
        films.addFilm("Movie5");
        films.addFilm("Movie6");
        films.addFilm("Movie7");

        String[] expected = {"Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNoneMovie() {
        Films films = new Films();

        String[] expected = {};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
