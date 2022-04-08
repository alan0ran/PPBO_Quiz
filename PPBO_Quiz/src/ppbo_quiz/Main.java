/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ppbo_quiz;
import Division.Android;
import Division.Web;
import java.util.Scanner;

/**
 *
 * @author Radiv
 */
public class Main {
    public static void main(String[] args) {
        String nim, name;
        int mainMenu, subMenu;
        double writeScore, codeScore, interviewScore;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("REGISTRATION FORM PT.JUAN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Choose Form Type : ");
        mainMenu = input.nextInt();
        
        System.out.println();
        System.out.print("REGISTRATION FORM\n");
        System.out.print("Input Student Number : ");
        nim = input.next();
        System.out.print("Input Name : ");
        name = input.next();
        System.out.print("Input Writing Exam Score : ");
        writeScore = input.nextInt();
        System.out.print("Input Coding Test Score : ");
        codeScore = input.nextInt();
        System.out.print("Input Interview Test Score : ");
        interviewScore = input.nextInt();
        
        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Edit");
            System.out.println("2. Output");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            subMenu = input.nextInt();

            if (subMenu == 1) {
                System.out.println();
                System.out.println("EDIT FORM");
                System.out.print("Input Writing Exam Score : ");
                writeScore = input.nextInt();
                System.out.print("Input Coding Test Score : ");
                codeScore = input.nextInt();
                System.out.print("Input Interview Test Score : ");
                interviewScore = input.nextInt();
            }

            if (subMenu == 2) {
                Android android = new Android(writeScore, codeScore, interviewScore);
                Web web = new Web(writeScore, codeScore, interviewScore);
                   
                System.out.println();
                System.out.print("Final Score : ");
                if (mainMenu == 1) {
                    System.out.println(android.result());
                }
                
                else if(mainMenu == 2) {
                    System.out.println(web.result());
                }
                
                System.out.print("INFORMATION : ");
                if (mainMenu == 1) {
                    System.out.println(android.information(android.result()));
                    if (android.result() >= 85) {
                        System.out.println("Congratulation " + name + ", you are accepted as Android Developer");
                    }
                    else {
                        System.out.println("Sorry " + name + ", you are not accepted as Android Developer");
                    }
                }
                
                else if(mainMenu == 2) {
                    System.out.println(web.information(web.result()));
                    if (web.result() >= 85){
                        System.out.println("Congratulation " + name + ", you are accepted as Web Developer");
                    }
                    
                    else {
                        System.out.println("Sorry " + name + ", you are not accepted as Web Developer");
                    }
                }
            }
        } while(subMenu != 3);
    } 
}
