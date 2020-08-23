/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example4;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 real numbers: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        
        double avg = (a + b + c) / 3;
        
        System.out.println("The average of three numbers is: " + avg);
        
    }
    
}
