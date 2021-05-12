

/*

inputs will be 2 seperate inputs for 2 players into a method
inputs will be "rock", "paper", or "scissors" as a string

winner will be returned as a string
rock beats scissors, scissors beats paper and paper beats rock
players can tie

******************************************************************************

method takesin two strings
check for String
paper beats rock 
But which player said which?


*/
public class Roshambo{


    public static void main(String[] args){

        fight("Rock", "Paper");

    }


    public static void fight(String P1,String P2){

        
        if(P1 == "Scissors" && P2 == "Paper" || P1 =="Paper" && P2 =="Rock" || P1 =="Rock" && P2 =="Scissors"){

            System.out.println("Player 1 wins");
            

        } //p1 wins loop
        if(P2 == "Scissors" && P1 == "Paper" || P2 =="Paper" && P1 =="Rock" || P2 =="Rock" && P1 =="Scissors"){

            System.out.println("Player 2 wins");
            

        } //p2 wins loop
        else{

            System.out.println("Tie");

        }


        
    }


}

//Note: This does not take into account for misspellings or lower case inputs, if either are the case then 
//the function would print tie. code is broken easily

