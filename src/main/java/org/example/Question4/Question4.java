package org.example.Question4;

import java.util.List;

/**
 * Given a list of Strings containing groups of numbers separated by empty Strings,
 * Find the value of the highest Valued String
 * eg: {"1","2","" , "40","2","","4"}
 * These have three groups with values 3,42 and 4. The highest Value is 42
 * **/

public class Question4 {

    public int checkHighestValuedGroup(List<String> numberList){
        int sum = 0;
        int maxValue = 0;

        for(String stringNumber : numberList){
            if(stringNumber.isEmpty()){

                maxValue = Math.max(sum, maxValue);
                sum = 0;
                continue;
            }
            sum += Integer.parseInt(stringNumber);

        }
        return maxValue;
    }
}
