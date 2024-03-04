package telran.string.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTests {

    @Test
    @DisplayName("test of the method concat")
    void concatTest(){
        String hello = "Hello";
        assertEquals("Hello World", hello.concat(" World"));
    }

    @Test
    void containsTest(){
        String hello = "Hello";
        assertTrue(hello.contains("ell"));
        assertFalse(hello.contains("!"));
    }
}
