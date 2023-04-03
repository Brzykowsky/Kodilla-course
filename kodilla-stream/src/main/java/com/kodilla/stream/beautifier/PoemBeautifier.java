package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String wordToBeautifier, PoemDecorator poemDecorator){

        String result = poemDecorator.decorate(wordToBeautifier);
        System.out.println("Word before beautifier: " + wordToBeautifier);
        System.out.println("Word after beautifier: " + result);

    }
}
