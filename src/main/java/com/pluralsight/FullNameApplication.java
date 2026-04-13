package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //gather user info
        System.out.print("Enter your name: ");
        String firstName = capitalizeFirstLetter(scanner.nextLine().trim());

        System.out.print("Enter you Middle name: ");
        String middleName = capitalizeFirstLetter(scanner.nextLine().trim());

        System.out.print("Enter your Last name: ");
        String lastName = capitalizeFirstLetter(scanner.nextLine().trim());

        System.out.print("Enter your suffix: ");
        String suffix = capitalizeFirstLetter(scanner.nextLine().trim());

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
    //capitalize first letter
    public static String capitalizeFirstLetter(String name){
        if (name.isBlank()) return name;

        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}