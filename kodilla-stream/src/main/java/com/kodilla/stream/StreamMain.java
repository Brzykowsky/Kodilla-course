package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(5,10,((a, b) -> a + b));
        expressionExecutor.executeExpression(5,10,((a, b) -> a - b));
        expressionExecutor.executeExpression(5,10,((a, b) -> a / b));
        expressionExecutor.executeExpression(5,10,((a, b) -> a * b));

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("word",(word -> "ABC" + word + "ABC" ));
        poemBeautifier.beautify("word",(word -> word.toUpperCase()));
        poemBeautifier.beautify("word",(word -> word + word + word));
        poemBeautifier.beautify("word",(word -> word + "\'" + word));
    }
}
