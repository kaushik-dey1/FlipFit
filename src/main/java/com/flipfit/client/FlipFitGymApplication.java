package com.flipfit.client;
import java.util.Scanner;

public class FlipFitGymApplication{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-----------------------Welcome to FlipFit Application--------------------");

        System.out.println("Press 1 for Login");
        System.out.println("Press 2 for Registration for Customer");
        System.out.println("Press 3 for Registration for GymOwner");
        System.out.println("Press 4 for Update Password");
        System.out.println("Press 5 for Exit");
        int optionSelected = scanner.nextInt();

        switch (optionSelected) {
            case 1:
                System.out.println("------------Login Page--------------");
                System.out.println("Select your role:");
                System.out.println("Press 1 for admin");
                System.out.println("Press 2 for gym owner");
                System.out.println("Press 3 for gym customer");
                int role = Integer.parseInt(scanner.nextLine());

                switch(role){
                    case 1:
                        System.out.println("------------Admin Login Page--------------");

                    case 2:
                        System.out.println("------------Gym OwnerLogin Page--------------");

                    case 3 :
                        System.out.println("------------Gym Customer Login Page--------------");
                }

            case 2:
                System.out.println("------------Customer Registration Page--------------");

            case 3:
                System.out.println("------------Gym Owner Registration Page--------------");

            case 4:
                System.out.println("------------Password Updation Page--------------");

            case 5:
                System.out.println("------------Exit--------------");

            default: System.out.println("------------Wrong Option selected--------------");
        }

    }
}
