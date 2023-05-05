package org.example.Question3;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Question3Test {
    @Test
    void testIsCharacterUniqueReturnsTrue() {
        // Arrange, Act and Assert
        assertTrue((new Question3()).isCharacterUnique("Word"));
    }

    @Test
    void testIsCharacterUniqueReturnsFalse() {
        // Arrange, Act and Assert
        assertFalse((new Question3()).isCharacterUnique("foo"));
    }


    @Test
    void testIsCharacterUniqueReturnsTrueForAnEmptyString() {
        // Arrange, Act and Assert
        assertTrue((new Question3()).isCharacterUnique(""));
    }

    @Test
    void testIsCharacterUniqueReturnsFalseForDoubleEmptyString() {
        // Arrange, Act and Assert
        assertFalse((new Question3()).isCharacterUnique("    "));
    }


}

