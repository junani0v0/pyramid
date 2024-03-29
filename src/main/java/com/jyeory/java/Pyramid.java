package com.jyeory.java;

public class Pyramid {
    public static String watchPyramidFromTheSide(String characters) {
        for (int i = 0; i < characters.length(); i++) {
            for (int j = 0; j < (characters.length() - 1) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print(characters.charAt(characters.length() - 1 - i));
                //문자열에서 특정 위치 문자 가져오기 charAt
            }
            System.out.println();
        }
        return "";
    }

    public static String watchPyramidFromAbove(String characters) {
        //위쪽
        for (int i = characters.length(); i > 0; i--) {
            //위에 왼쪽 문자
            for (int j = 0; j < characters.length() - i; j++) {
                System.out.print(characters.charAt(j));
            }
            //위에 가운데 문자
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print(characters.charAt(characters.length() - i));
            }
            //위에 왼쪽 문자
            for (int j = characters.length() - i - 1; j >= 0; j--) {
                System.out.print(characters.charAt(j));
            }
            System.out.println();
        }

        //아래쪽
        for (int i = 1; i < characters.length(); i++) {
            //아래 오른쪽 문자
            for (int j = 0; j < characters.length() - i; j++) {
                System.out.print(characters.charAt(j));
            }
            //아래 가운데 문자
            for (int j = 0; j < (i * 2) ; j++) {
                System.out.print(characters.charAt(characters.length() - 1 - i));
            }
            //아래 오른쪽 문자
            for (int j = characters.length() - i - 2; j >= 0; j--) {
                System.out.print(characters.charAt(j));
            }
            System.out.println();
        }
        return "";
    }

    public static int countVisibleCharactersOfThePyramid(String characters) {
        return (int) Math.pow(characters.length() * 2 - 1, 2);
    }

    public static int countAllCharactersOfThePyramid(String characters) {
        int pyramidLength = characters.length() * 2 - 1;
        int result = 0;
        for (int i = 0; i < characters.length(); i++) {
            result += (int) Math.pow(pyramidLength, 2);
            pyramidLength = pyramidLength - 2;
        }
        return result;
    }
}
