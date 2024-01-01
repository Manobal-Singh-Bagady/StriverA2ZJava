package com.msb.Step1LearningTheBasics.Step1_1ThingsToKnowInJava;

import java.util.Scanner;

public class _1UserInputOrOutput {
    public static void main(String[] args) {
        char a;
        byte result;
        Scanner scanner = new Scanner(System.in);
        a = scanner.next().charAt(0);
        scanner.close();
        if (Character.isUpperCase(a)) {
            result = 1;
        } else if (Character.isLowerCase(a)) {
            result = 0;
        } else {
            result = -1;
        }
        System.out.println(result);
    }
}