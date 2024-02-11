package org.example;


import java.util.Scanner;

import lombok.val;

public class Main {


    public static void main(String[] args) {
        {
            val beginning = "abc";
            VerifyService verifyService = new VerifyServiceImpl(beginning);
            // Using Scanner for Getting Input from User
            System.out.println("Enter something:");

            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {
                String s = in.next();
                if (verifyService.isValidBeginning(s)) {
                    System.out.println("You entered: " + s);
                } else {
                    System.out.println("Your input is invalid. It has to start with: " + beginning);
                }
            }
        }
    }
}