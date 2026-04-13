package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //gather user info
        System.out.print("Enter your name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter you Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Enter your Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter your suffix: ");
        String suffix = scanner.nextLine().trim();

        //full name logic
        String fullName = firstName;

        if (!middleName.isBlank()){
            fullName += " " + middleName;

        }
        fullName += " " + lastName;

        if (!suffix.isBlank()){
            fullName += " ," + suffix;

        }

        System.out.println("\nFull name: " + fullName);



        //capitalize first letter

    }
}