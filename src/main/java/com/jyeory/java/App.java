package com.jyeory.java;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        String pattern = "abcde";
        System.out.println(Pyramid.watchPyramidFromTheSide(pattern));
        System.out.println(Pyramid.watchPyramidFromAbove(pattern));
        System.out.println(Pyramid.countVisibleCharactersOfThePyramid(pattern));
        System.out.println(Pyramid.countAllCharactersOfThePyramid(pattern));
    }
}
