package com.regexanalyzer;

public class Main {
    public static void main(String[] args) {
        String[] testRegexes = {
            "a+b+c+",
            "a{2,4}b{3,}c{5}",
            "(x+x+)+y",
            "\\d{3}-\\d{2}-\\d{4}"
        };

        for (String regex : testRegexes) {
            RegexAnalyzer.analyzeRegex(regex);
            System.out.println();
        }
    }
}