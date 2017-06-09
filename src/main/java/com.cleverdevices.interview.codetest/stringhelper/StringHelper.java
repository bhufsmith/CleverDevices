package com.cleverdevices.interview.codetest.stringhelper;

import java.util.HashSet;

/**
 * A class created as a convenient organizational unit for methods that support
 * needed string processes.
 */
public class StringHelper {

    /**
     * Given a String of words separated by spaces, reveres their order.
     * @param sentence A string of words separated by spaces.)
     * @return The sentence with the word order reversed.
     * @throws IllegalArgumentException If a null value is passed.
     */
    public static String reverseWordOrder(String sentence){

        if(sentence == null )  throw new IllegalArgumentException("A null value was passed to reverseWordOrder");

        //Break the words by spaces.
        String[] splitScentence = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        //Append the last word to the beginning to get the spacing correct in the loop.
        reversedSentence.append(splitScentence[ splitScentence.length - 1]);

        //Append the words in reverse order, starting with the second to last word.
        for (int i =  splitScentence.length - 2; i >= 0; i-- ){
            reversedSentence.append(" ");
            reversedSentence.append( splitScentence[i] );
        }

        return reversedSentence.toString();
    }


    /**
     * Given two strings, return a string containing the characters that appear at least once
     * in both strings. (e.g. passing (apple, people) returns "ple"
     * @param s1 The first string to be compared
     * @param s2 The second string to be compared
     * @return A String containing the characters the strings have in common.
     */
    public static String commonCharacters(String s1, String s2){
        StringBuilder result = new StringBuilder();
        HashSet<Character> chars = new HashSet<>();

        //Add all the chars from s1 to a hash set for fast lookup.
        for(int i=0; i<s1.length(); i++){
            chars.add(s1.charAt(i));
        }

        //For each char in s2, append it to the result if that char was in s1
        for( int i=0; i<s2.length(); i++){
            char currChar = s2.charAt(i);
            if(chars.contains(currChar))
                result.append(currChar);
        }
        return result.toString();
    }


    /**
     * Given two strings, return a string containing all the characters the strings have in common by both
     * character instance and position. The resulting string may contain duplicate characters
     * (e.g. passing (apple, people) returns the string "le")
     * @param s1 The first string to be compared.
     * @param s2 The second string to be compared
     * @return The common characters in the order of their found positions within the strings. 
     */
    public static String commonCharactersByPosition(String s1, String s2){

        int count = (s1.length() <= s2.length())? s1.length() : s2.length();

        StringBuilder resultString = new StringBuilder();

        for(int i=0; i<count; i++){
            if(s1.charAt(i) == s2.charAt(i))
                resultString.append(s1.charAt(i));
        }
        return resultString.toString();
    }

}
