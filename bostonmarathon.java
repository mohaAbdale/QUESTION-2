/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.course_work;

/**
 *
 * @author 
 */
public class bostonmarathon {  
    public static void main(String[] args) {
        //Arrange the data into arraysa
        //String array
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
            "Matt", "Alex", "Emma", "John", "James",
            "Daniel", "Emily", "Neda", "Aaron", "Kate"
        };
//integer array
        int[] times = {
            341, 273, 278, 329, 442,
            405, 388, 275, 243, 312,
            393, 299, 343, 317, 265
        };
// calling the max_value method to determine the one with the least time who is the fastestrunner 
        int shortTime = Integer.MAX_VALUE;
        String fastestRunner = "";
        for (int i = 0; i < times.length; i++) {
            if (times[i] < shortTime) {
                shortTime = times[i];
                fastestRunner = names[i];
            }
        }

        // Find the second fastest runner
        int secondFastestTime = Integer.MAX_VALUE;
        String secondFastestRunner = "";
        for (int i = 0; i < times.length; i++) {
            if (times[i] < secondFastestTime && !names[i].equals(fastestRunner)) {
                secondFastestTime = times[i];
                secondFastestRunner = names[i];
            }
        }
        

        System.out.println("Fastest runner: " + fastestRunner + " (" + shortTime + " minutes)");
        System.out.println("Second fastest runner: " + secondFastestRunner + " (" + secondFastestTime + " minutes)");
    }


    
}
