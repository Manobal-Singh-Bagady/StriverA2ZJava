package com.msb.Step1LearningTheBasics.Step1_1ThingsToKnowInJava;

public class _3IfElseStatements {
    public static void main(String[] args) {
        System.out.println(compareIfElse(1, 2));
    }

    public static String compareIfElse(int a, int b) {
        if (a > b) {
            return "greater";
        } else if (a < b) {
            return "smaller";
        } else {
            return "equal";
        }
    }
}
