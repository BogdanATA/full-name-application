package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //gather user info
        System.out.println("Enter your name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Enter you Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.println("Enter your Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Enter your suffix: ");
        String suffix = scanner.nextLine().trim();

        //full name logic
        String fullName = firstName;

        if (!middleName.isBlank()){
            fullName += " " + middleName;

        }
        fullName += " " + lastName;

        if (!suffix.isBlank()){
            fullName += " " + suffix;

        }

        System.out.println("Full name: " + fullName);

    }
}