package telran.string.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTests {

    @Test
    @DisplayName("test of the method String class - concat")
        // this method return new string with concatenation two strings: which used, and which is passed to the parameters
    void concatTest() {
        String hello = "Hello";
        assertEquals("Hello World", hello.concat(" World"));
    }

    @Test
    @DisplayName("test of the method String class - contains")
        // this method return true if part or all string compare with string in parameter otherwise return false
    void containsTest() {
        String hello = "Hello";
        assertTrue(hello.contains("ell"));
        assertFalse(hello.contains("!"));
    }

    @Test
    @DisplayName("test of the method String class - compareTo")
        //  comparing step by step all chars in same position if number of this char is not compare subtracts UNICODE
        //  number char from first word from second word and return result. If string is matches return 0
    void compareToTest() {
        String hello = "hello";
        assertEquals(-10, hello.compareTo("holla"));
        assertEquals(0, hello.compareTo("hello"));
        assertEquals(33, hello.compareTo("G"));
    }

    @Test
    @DisplayName("test of the method String class - compareToIgnoreCase")
        //  this method is the same as previous, but ignoring uppercase and lowercase. If letter is different, subtraction
        //  occurs in the register in which the letter is indicated
    void compareToIgnoreCaseTest() {
        String name = "John";
        assertEquals(0, name.compareToIgnoreCase("John"));
        assertEquals(0, name.compareToIgnoreCase("joHn"));
        assertEquals(8, name.compareToIgnoreCase("building"));
    }

    @Test
    @DisplayName("test of the method String class - startWith")
        // this method return true if start position of the word compare with string in parameter otherwise return false
    void startsWithTest() {
        String word = "education";
        assertTrue(word.startsWith("edu"));
        assertFalse(word.startsWith("kni"));
    }

    @Test
    @DisplayName("test of the method String class - endWith")
        // this method return true if end of the word compare with string in parameter otherwise return false
    void endsWithTest() {
        String word = "education";
        assertTrue(word.endsWith("ion"));
        assertFalse(word.startsWith("kni"));
    }

    @Test
    @DisplayName("test of the method String class - indexOf")
        //This method should display the position in the sentence where the word or letter first occurs
        // if it does not occur, it returns -1.
    void indexOfWithStringTest() {
        String sentence = "English grammar has four sentence structures: simple, compound, complex and compound-complex.";
        assertEquals(8, sentence.indexOf("grammar"));
        assertEquals(-1, sentence.indexOf("grammr"));
    }

    @Test
    @DisplayName("test of the method String class - indexOf")
        //This method must display position in sentence where first time meet word or letter if it's not happened - return -1
    void indexOfWithCharTest() {
        String sentence = "English grammar has four sentence structures: simple, compound, complex and compound-complex.";
        assertEquals(2, sentence.indexOf('g'));
        assertEquals(-1, sentence.indexOf('^'));
    }


}