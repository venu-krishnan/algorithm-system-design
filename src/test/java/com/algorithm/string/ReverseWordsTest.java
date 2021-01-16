package com.algorithm.string;

import com.algorithm.string.ReverseWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {

    @Test
    public void testReverseWords() {

        assertEquals("blue", ReverseWords.reverseWords("blue"));
        assertEquals("green is blue", ReverseWords.reverseWords("blue is green"));
        assertEquals("green is blue", ReverseWords.reverseWords("  blue is green  "));
        assertEquals("green is blue 3 2 1", ReverseWords.reverseWords("  1 2 3 blue is green"));
        assertEquals("green is blue 3 2 1", ReverseWords.reverseWords("  1 2 3 blue is green  "));

        assertEquals("blue", ReverseWords.reverseWordsFromBackwards("blue"));
        assertEquals("green is blue", ReverseWords.reverseWordsFromBackwards("blue is green"));
        assertEquals("green is blue", ReverseWords.reverseWordsFromBackwards("  blue is green  "));
        assertEquals("green is blue 3 2 1", ReverseWords.reverseWordsFromBackwards("  1 2 3 blue is green"));
        assertEquals("green is blue 3 2 1", ReverseWords.reverseWordsFromBackwards("  1 2 3 blue is green  "));

    }

}
