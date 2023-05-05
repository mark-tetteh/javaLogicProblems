package org.example.Question2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {
    @Test
    void testIsPalindromeReturnsFalse() throws EmptyStringException {
        // Arrange, Act and Assert
        assertFalse((new Question2()).isPalindrome("Phrase"));
    }

    @Test
    void testIsPalindromeReturnsTrue() throws EmptyStringException {
        // Arrange, Act and Assert
        assertTrue((new Question2()).isPalindrome("racecar"));
    }

    @Test
    void testIsPalindromeThrowsEmptyStringException() {
        assertThrows(EmptyStringException.class,
                () -> (new Question2()).isPalindrome(""));
    }
    @Test
    void testIsPalindromeStripsOffEmptySpaces() throws EmptyStringException {
        Question2 question2 = new Question2();
        String Phrase = "nurses run";
        assertTrue(question2.isPalindrome(Phrase));




    }


}

