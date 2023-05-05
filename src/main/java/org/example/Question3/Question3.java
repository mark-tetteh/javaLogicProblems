package org.example.Question3;

/**
 * Write a method that can determine whether a string is made up of unique
 * characters.
 * **/
public class Question3 {

    public boolean isCharacterUnique(String word){
    String caseInsensitiveWord = word.toLowerCase();
    for(int i = 0 ; i < caseInsensitiveWord.length() ; i++ ){
        if(i == caseInsensitiveWord.length()-1)
            break;
        for(int j = i+1 ; j < caseInsensitiveWord.length() ; j++){
            if(caseInsensitiveWord.charAt(i) == caseInsensitiveWord.charAt(j)){
                return false;
            }
        }
    }
    return true;
}
}
