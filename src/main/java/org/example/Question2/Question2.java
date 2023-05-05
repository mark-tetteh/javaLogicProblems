package org.example.Question2;


/**
 Write a method that returns true if a string is a palindrome
 (a word,phrase or sequence that reads the same backwards as forwards)
 **/

public class Question2 {

    public boolean isPalindrome(String Phrase)throws EmptyStringException{
        String cleanPhrase = Phrase.replaceAll(" " , "").toLowerCase();
        int phraseLength = cleanPhrase.length();
        if(phraseLength < 1){
            throw new EmptyStringException("Invalid String Length");
        }
        for(int i = 0 ; i < phraseLength ; i++){
            if(cleanPhrase.charAt(i) != cleanPhrase.charAt(phraseLength-1-i)){
                return false;
            }
        }
        return true ;
    }

}
