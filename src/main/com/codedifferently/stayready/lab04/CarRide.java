package com.codedifferently.stayready.lab04;

import java.util.Scanner;

public class CarRide {
    public String areWeThereYet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are we There Yet?");
        String response = sc.next();

        while (!evalString(response)) {
            System.out.println("Are we There Yet?");
            response = sc.next();
        }
        return "Good!";
    }
    public boolean evalString (String response) {
        boolean output =false;
        if (response.equalsIgnoreCase("Yes")){
            output=true;
        }
        return output;
    }
}
