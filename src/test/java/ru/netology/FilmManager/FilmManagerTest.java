package ru.netology.FilmManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void testEmptySet() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.showMeAllFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddOneFilms() {
        FilmManager manager = new FilmManager();

        manager.add("Пила");

        String[] expected = {"Пила"};
        String[] actual = manager.showMeAllFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddAllFilms() {
        FilmManager manager = new FilmManager();

        manager.add("Бдадшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-неведимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");
        manager.add("Пила");
        manager.add("Пила 2");
        manager.add("Пила 3");
        manager.add("Пила 4");
        manager.add("Пила 5");
        manager.add("Пила 6");
        manager.add("Пила 7");

        String[] expected = {"Бдадшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-неведимка", "Тролли.Мировой тур", "Номер один", "Пила", "Пила 2" ,"Пила 3", "Пила 4", "Пила 5", "Пила 6", "Пила 7"};
        String[] actual = manager.showMeAllFilms();
        Assertions.assertArrayEquals(expected, actual);
        }

    @Test
    public void testShowMeLast10Films() {
        FilmManager manager = new FilmManager();

        manager.add("Человек-неведимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");
        manager.add("Пила");
        manager.add("Пила 2");
        manager.add("Пила 3");
        manager.add("Пила 4");
        manager.add("Пила 5");
        manager.add("Пила 6");
        manager.add("Пила 7");

        String[] expected = {"Пила 7", "Пила 6", "Пила 5", "Пила 4", "Пила 3", "Пила 2", "Пила", "Номер один" ,"Тролли.Мировой тур", "Человек-неведимка"};
        String[] actual = manager.showMeLastFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowMeLast5Films() {
        FilmManager manager = new FilmManager();

        manager.add("Пила 3");
        manager.add("Пила 4");
        manager.add("Пила 5");
        manager.add("Пила 6");
        manager.add("Пила 7");

        String[] expected = {"Пила 7", "Пила 6", "Пила 5", "Пила 4", "Пила 3"};
        String[] actual = manager.showMeLastFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowMeLastOneFilms() {
        FilmManager manager = new FilmManager();

        manager.add("Пила 7");

        String[] expected = {"Пила 7"};
        String[] actual = manager.showMeLastFilms();
        Assertions.assertArrayEquals(expected, actual);
    }
}
