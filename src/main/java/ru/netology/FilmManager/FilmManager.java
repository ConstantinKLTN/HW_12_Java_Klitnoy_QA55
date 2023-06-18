package ru.netology.FilmManager;

public class FilmManager {
    private String[] films = new String[0];
    public int amountMovies;

    public FilmManager(int amountMovies) {
        this.amountMovies = amountMovies;
    }

    public FilmManager() {
        this.amountMovies = 10;
    }


    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] showMeAllFilms() {
        return films;
    }

    public String[] showMeLastFilms() {
        int resultLength;
        if (films.length < amountMovies) {
            resultLength = films.length;
        } else {
            resultLength = amountMovies;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];

        }
        return result;

    }
}
