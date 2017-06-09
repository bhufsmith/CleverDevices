package com.cleverdevices.interview.codetest.stringhelper;

import org.junit.Test;

/**
 * Created by Brian on 6/8/2017.
 */
public class CommonCharsTest {

    @Test
    public void testEmptyString(){
        String commonChars = StringHelper.commonCharacters("", "");
        assert (commonChars.equals(""));

        commonChars = StringHelper.commonCharacters("AAB", "");
        assert (commonChars.equals(""));

        commonChars = StringHelper.commonCharacters("", "BBDSA");
        assert (commonChars.equals(""));
    }

    @Test
    public void testAllCommonLetters(){
        String commonChars = StringHelper.commonCharacters("ABCDE", "ABCDE");
        assert (commonChars.length() == 5);
        assert (commonChars.contains("A"));
        assert (commonChars.contains("B"));
        assert (commonChars.contains("C"));
        assert (commonChars.contains("D"));
        assert (commonChars.contains("E"));
    }

    @Test
    public void testUnequalLength(){
        String commonChars = StringHelper.commonCharacters("AABBC", "AEWBLSIE");
        assert (commonChars.length() == 2);
        assert (commonChars.contains("A"));
        assert (commonChars.contains("B"));
    }

    @Test
    public void testNoCommonLetters(){
        String commonChars = StringHelper.commonCharacters("ZWXY", "ABCD");
        assert (commonChars.equals(""));
    }

    @Test
    public void testEmptyStringByPosition(){
        String commonChars = StringHelper.commonCharactersByPosition("", "");
        assert (commonChars.equals(""));

        commonChars = StringHelper.commonCharactersByPosition("AAB", "");
        assert (commonChars.equals(""));

        commonChars = StringHelper.commonCharactersByPosition("", "BBDSA");
        assert (commonChars.equals(""));
    }

    @Test
    public void testAllCommonLettersByPosition(){
        String commonChars = StringHelper.commonCharactersByPosition("Abcd", "Abcd");
        assert (commonChars.equals("Abcd"));
    }

    @Test
    public void testUnequalLengthByPosition(){
        String commonChars = StringHelper.commonCharactersByPosition("Abcddefg", "Abcdd");
        assert (commonChars.equals("Abcdd"));
    }

    @Test
    public void testNoCommonLettersByPosition(){
        String commonChars = StringHelper.commonCharactersByPosition("zwxy!", "Abcdd");
        assert (commonChars.equals(""));
    }
}
