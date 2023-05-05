package org.example.Question4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Question4Test {
    @Test
    void testCheckHighestValuedGroupWithAnEmptyList() {
        // Arrange
        Question4 question4 = new Question4();

        // Act and Assert
        assertEquals(0, question4.checkHighestValuedGroup(new ArrayList<>()));
    }


    @Test
    void testCheckHighestValuedGroupWithJustOneIntegerValueString() {
        // Arrange
        Question4 question4 = new Question4();

        ArrayList<String> numberList = new ArrayList<>();
        numberList.add("42");

        // Act and Assert
        assertEquals(0, question4.checkHighestValuedGroup(numberList));
    }


    @Test
    void testCheckHighestValuedGroupWithANullValue() {
        // Arrange
        Question4 question4 = new Question4();

        ArrayList<String> numberList = new ArrayList<>();
        numberList.add("");

        // Act and Assert
        assertEquals(0, question4.checkHighestValuedGroup(numberList));
    }


    @Test
    void testCheckHighestValuedGroup(){
        Question4 question4 = new Question4();

        ArrayList<String> numberList = new ArrayList<>();
        numberList.add("1");
        numberList.add("2");
        numberList.add("");
        numberList.add("40");
        numberList.add("2");
        numberList.add("");
        numberList.add("4");
        assertEquals(42 , question4.checkHighestValuedGroup(numberList));

    }




}

