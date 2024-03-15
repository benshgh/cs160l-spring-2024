package edu.sdsu.cs160l.datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParenthesisTest {
    private final Map<String, Boolean> answerSet = new HashMap<>();
    private Parenthesis parenthesis;

    @BeforeEach
    void setUp() {
        parenthesis = new Parenthesis();
        answerSet.clear();
        answerSet.put("", true); // no brackets is balanced
        answerSet.put("()", true);
        answerSet.put("(", false);
        answerSet.put(")", false);
        answerSet.put(")(", false);
        answerSet.put("(()", false);
        answerSet.put("(())", true);
        answerSet.put("(()())", true);
        answerSet.put("((())())()", true);
        answerSet.put("(((((((((((((((((((((((((((((((((((((", false);
    }

    @Test
    void balancedParentheses() {
        answerSet
                .forEach((parenthesise, expected) ->
                        assertEquals(parenthesis.isBalanced(parenthesise), expected));
    }
}