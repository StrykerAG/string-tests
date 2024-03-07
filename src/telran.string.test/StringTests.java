package telran.string.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTests {

    static final String hello = "Hello";

    @Test
    @DisplayName("test of the method String class - concat")
        // this method return new string with concatenation two strings: which used, and which is passed to the parameters
    void concatTest() {
        assertEquals("Hello World", hello.concat(" World"));
        assertEquals(hello, hello.concat(""));
        assertEquals(hello, "".concat(hello));
    }

    @Test
    @DisplayName("test of the method String class - contains")
        // this method return true if part or all string compare with string in parameter otherwise return false
    void containsTest() {
        assertTrue(hello.contains("ell"));
        assertFalse(hello.contains("!"));
        assertFalse(hello.contains("he"));
    }

    @Test
    @DisplayName("test of the method String class - compareTo")
        //  comparing step by step all chars in same position if number of this char is not compare subtracts UNICODE
        //  number char from first word from second word and return result. If string is matches return 0
    void compareToTest() {
        assertEquals(-10, hello.compareTo("Holla"));
        assertEquals(0, hello.compareTo("Hello"));
        assertEquals(1, hello.compareTo("G"));
    }

    @Test
    @DisplayName("test of the method String class - compareToIgnoreCase")
        //  this method is the same as previous, but ignoring uppercase and lowercase. If letter is different, subtraction
        //  occurs in the register in which the letter is indicated
    void compareToIgnoreCaseTest() {
        assertEquals(0, hello.compareToIgnoreCase("Hello"));
        assertEquals(0, hello.compareToIgnoreCase("heLlO"));
        assertEquals(6, hello.compareToIgnoreCase("building"));
    }

    @Test
    @DisplayName("test of the method String class - startWith")
        // this method return true if start position of the word compare with string in parameter otherwise return false
    void startsWithTest() {
        assertTrue(hello.startsWith("Hel"));
        assertFalse(hello.startsWith("kni"));
        assertTrue(hello.startsWith(""));
    }

    @Test
    @DisplayName("test of the method String class - endWith")
        // this method return true if end of the word compare with string in parameter otherwise return false
    void endsWithTest() {
        assertTrue(hello.endsWith("lo"));
        assertFalse(hello.endsWith("kni"));
    }

    @Test
    @DisplayName("test of the method String class - equalsIgnoreCase")
        //
    void equalsIgnoreCaseTest() {
        assertTrue(hello.equalsIgnoreCase("HeLlO"));
        assertTrue("hello".equalsIgnoreCase(hello));
        assertFalse("".equalsIgnoreCase(hello));
        assertFalse(hello.equalsIgnoreCase(""));
    }

    @Test
    @DisplayName("test of the method String class - indexOf")
        //This method should display the position in the sentence where the word or letter first occurs
        // if it does not occur, it returns -1.
    void indexOfTest() {
        String sentence = "English grammar has four sentence structures: simple, compound, complex and compound-complex.";
        assertEquals(8, sentence.indexOf("grammar"));
        assertEquals(-1, sentence.indexOf("grammr"));
    }

    @Test
    @DisplayName("test of the method String class - lastIndexOf")
        //This method must display position in sentence where first time meet word or letter if it's not happened - return -1
    void lastIndexOfTest() {
        String sentence = "English grammar has four sentence structures: simple, compound, complex and compound-complex.";
        assertEquals(90, sentence.lastIndexOf('e'));
        assertEquals(-1, sentence.lastIndexOf('^'));
    }


}