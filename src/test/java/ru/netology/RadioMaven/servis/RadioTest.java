package ru.netology.RadioMaven.servis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    RadioMaven radio = new RadioMaven();

    @Test
    void test1RadioNext() {


        radio.setRadio(0);
        radio.nextRadio();
        int actual = radio.getRadio();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2RadioNext() {


        radio.setRadio(9);
        radio.nextRadio();
        int actual = radio.getRadio();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3RadioNext() {

        radio.setRadio(-5);
        radio.nextRadio();
        int actual = radio.getRadio();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test4RadioNext() {

        radio.setRadio(10);
        radio.nextRadio();
        int actual = radio.getRadio();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test1RadioPrev() {

        radio.setRadio(5);
        radio.prevRadio();

        int actual = radio.getRadio();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2RadioPrev() {

        radio.setRadio(11);
        radio.prevRadio();

        int actual = radio.getRadio();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3RadioPrev() {

        radio.setRadio(0);
        radio.prevRadio();

        int actual = radio.getRadio();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void test4RadioPrev() {

        radio.setRadio(10);
        radio.prevRadio();

        int actual = radio.getRadio();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void Test1VolumeUp() {

        radio.setVolume(5);
        radio.volumeUp();

        int actual = radio.getVolume();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Test2VolumeUp() {

        radio.setVolume(12);
        radio.volumeUp();

        int actual = radio.getVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void Test1VolumeDown() {

        radio.setVolume(3);
        radio.volumeDown();

        int actual = radio.getVolume();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Test2VolumeDown() {

        radio.setVolume(-5);
        radio.volumeDown();

        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}

