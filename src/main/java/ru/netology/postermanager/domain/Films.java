package ru.netology.postermanager.domain;

public class Films {

    private String[] films = new String[0];
    private int limit;

    public Films() {
        this.limit = 10;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {

        int resultlength;
        if (films.length < limit) {
            resultlength = films.length;
        } else {
            resultlength = limit;
        }
        String[] result = new String[resultlength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

}
