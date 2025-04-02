package com.regexanalyzer;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexAnalyzer {
    
    public static boolean hasCounters(String regex) {
        // This pattern looks for {m,n}, {m,}, or {m} where m and n are numbers
        Pattern counterPattern = Pattern.compile("\\{\\d+,?\\d*\\}");
        Matcher matcher = counterPattern.matcher(regex);
        return matcher.find();
    }

    public static void analyzeRegex(String regex) {
        System.out.println("Analyzing regex: " + regex);
        if (hasCounters(regex)) {
            System.out.println("This regex contains counters and may be vulnerable to ReDoS attacks.");
        } else {
            System.out.println("This regex does not contain counters.");
        }
    
    }
}