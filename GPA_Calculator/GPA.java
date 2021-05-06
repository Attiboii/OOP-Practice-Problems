

import java.util.Scanner;
import java.util.Arrays;

public class GPA{

    public static void main(String[] args){

        //input grade
        
        System.out.println("How many grades will you enter? ");
        java.util.Scanner numOfGrades = new java.util.Scanner(System.in);
        int n = numOfGrades.nextInt();
        int[] gradearray = new int[n];
        int[] weightarray = new int[n];
        int x = 0;
        int y = 0;

      
        
        for(int i= 0; i<n;i++){
            System.out.println("Please enter grade: ");
            java.util.Scanner scan = new java.util.Scanner(System.in);
            int grade = scan.nextInt();
            gradearray[i] = grade;
        }
            
        
        
        for(int i= 0; i<n;i++){
            System.out.println("Enter Weight of assignment: ");
            java.util.Scanner scanweight = new java.util.Scanner(System.in);
            int weight = scanweight.nextInt();
            weightarray[i] = weight;
        }
        
        for(int i= 0; i<n; i++){

            y = Integer.sum(weightarray[i],y);

            x = Integer.sum(gradearray[i]*weightarray[i],x);
            
        }
        
        System.out.println(x/y);
        

        

        numOfGrades.close();
            
        
}



}

