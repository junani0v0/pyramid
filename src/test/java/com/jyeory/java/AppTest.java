package com.jyeory.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    public void nullEmptyTests() {
        assertEquals(null, Pyramid.watchPyramidFromTheSide(null));
        assertEquals(null, Pyramid.watchPyramidFromAbove(null));
        assertEquals(-1, Pyramid.countVisibleCharactersOfThePyramid(null));
        assertEquals(-1, Pyramid.countAllCharactersOfThePyramid(null));
        assertEquals("", Pyramid.watchPyramidFromTheSide(""));
        assertEquals("", Pyramid.watchPyramidFromAbove(""));
        assertEquals(-1, Pyramid.countVisibleCharactersOfThePyramid(""));
        assertEquals(-1, Pyramid.countAllCharactersOfThePyramid(""));
    }
	
	@Test
    public void pyramidTest1() {
		System.out.println("***************** pyramidTest1 *****************");
        String characters = "*#";
        String expectedWatchFromSide = 
        " # \n" +
        "***";    
        String expectedWatchFromAbove = 
        "***\n" + 
        "*#*\n" + 
        "***";
        String actualWatchFromSide = Pyramid.watchPyramidFromTheSide(characters);
        String actualWatchFromAbove = Pyramid.watchPyramidFromAbove(characters);
        visualisation(expectedWatchFromSide, expectedWatchFromAbove, actualWatchFromSide, actualWatchFromAbove);
        assertEquals(9, Pyramid.countVisibleCharactersOfThePyramid(characters));
        assertEquals(10, Pyramid.countAllCharactersOfThePyramid(characters));        
    }
    
    @Test
    public void pyramidTest2() {
    	System.out.println("***************** pyramidTest2 *****************");
        String characters = "abc";
        String expectedWatchFromSide = 
        "  c  \n" +
        " bbb \n" +
        "aaaaa";
        String expectedWatchFromAbove = 
        "aaaaa\n" +
        "abbba\n" + 
        "abcba\n" + 
        "abbba\n" + 
        "aaaaa";
        String actualWatchFromSide = Pyramid.watchPyramidFromTheSide(characters);
        String actualWatchFromAbove = Pyramid.watchPyramidFromAbove(characters);
        visualisation(expectedWatchFromSide, expectedWatchFromAbove, actualWatchFromSide, actualWatchFromAbove);
        assertEquals(25, Pyramid.countVisibleCharactersOfThePyramid(characters));
        assertEquals(35, Pyramid.countAllCharactersOfThePyramid(characters));
    }
    
    @Test
    public void pyramidTest3() {
    	System.out.println("***************** pyramidTest3 *****************");
        String characters = "abcde";
        String expectedWatchFromSide = 
        "    e    \n" +
        "   ddd   \n" +  
        "  ccccc  \n" +
        " bbbbbbb \n" +
        "aaaaaaaaa";    
        String expectedWatchFromAbove = 
         "aaaaaaaaa\n"
       + "abbbbbbba\n"
       + "abcccccba\n"
       + "abcdddcba\n"
       + "abcdedcba\n"
       + "abcdddcba\n"
       + "abcccccba\n"
       + "abbbbbbba\n"
       + "aaaaaaaaa";
        String actualWatchFromSide = Pyramid.watchPyramidFromTheSide(characters);
        String actualWatchFromAbove = Pyramid.watchPyramidFromAbove(characters);
        visualisation(expectedWatchFromSide, expectedWatchFromAbove, actualWatchFromSide, actualWatchFromAbove);
        assertEquals(81, Pyramid.countVisibleCharactersOfThePyramid(characters));
        assertEquals(165, Pyramid.countAllCharactersOfThePyramid(characters));        
    }
    
    @Test
    public void basicTest5DescendingOrderedCharacters() {
    	System.out.println("***************** basicTest5DescendingOrderedCharacters *****************");
        String characters = "54321";
        String expectedWatchFromSide = 
        "    1    \n" +
        "   222   \n" +
        "  33333  \n" +
        " 4444444 \n" +
        "555555555";
        String expectedWatchFromAbove = 
        "555555555\n" +
        "544444445\n" +
        "543333345\n" +
        "543222345\n" +
        "543212345\n" +
        "543222345\n" +
        "543333345\n" +
        "544444445\n" +
        "555555555";
        String actualWatchFromSide = Pyramid.watchPyramidFromTheSide(characters);
        String actualWatchFromAbove = Pyramid.watchPyramidFromAbove(characters);
        visualisation(expectedWatchFromSide, expectedWatchFromAbove, actualWatchFromSide, actualWatchFromAbove);
        assertEquals(81, Pyramid.countVisibleCharactersOfThePyramid(characters));
        assertEquals(165, Pyramid.countAllCharactersOfThePyramid(characters));
    }
    
    private void visualisation(String expectedWatchFromSide, String expectedWatchFromAbove, String actualWatchFromSide, String actualWatchFromAbove) {
    	System.out.println("From side correct:\n" + expectedWatchFromSide);
        System.out.println("From side yours:\n" + actualWatchFromSide);
        System.out.println("-------------------------------------------------");
        System.out.println("From above correct:\n" + expectedWatchFromAbove);
        System.out.println("From above yours:\n" + actualWatchFromAbove);
        assertEquals(expectedWatchFromSide, actualWatchFromSide);
        assertEquals(expectedWatchFromAbove, actualWatchFromAbove);
    }
}
