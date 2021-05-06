



// There's a great war between the even and odd numbers. Many numbers already lost their life in this war and it's your task to end this. 
// You have to determine which group sums larger: the even, or the odd. The larger group wins.

// Create a function that takes an array of integers, sums the even and odd numbers separately, 
// then returns the difference between sum of even and odd numbers.



public class War_Of_Numbers{


    public static void main(String[] args){

        int[] array = new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        int size = array.length;
        int even = 0;
        int odd = 0;
        int evenSum=0;
        int oddSum = 0;
        //k and m are counters for the even and odd arrays.
        int k =0;
        int m=0;

        //how many odd and even numbers are in the array
        for(int i=0; i<size;i++){
            if(array[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }

        }

        // allcoate enough size for each array
        int[] evenArr = new int[even]; 
        int[] oddArr = new int[odd];
        int evenSize = evenArr.length;
        int oddSize = oddArr.length;

        //allocate the even and odd numbers to the respective arrays
        for(int j=0; j < size;j++){ //size is of length 12 but you cant access length 12 in the smaller arrays

            if(array[j] % 2 == 0){
                evenArr[k] = array[j];
                k++;
            }
            else{
                oddArr[m] = array[j];
                m++;
            }
        }
        
        //for loop to calculate sum of each element of each array seperatly
        for(int i = 0;i<evenSize;i++){
             evenSum = evenSum + evenArr[i];
        }

        for(int i = 0;i<oddSize;i++){
            oddSum = oddSum + oddArr[i];
       }


        int totalDif = Math.abs(evenSum - oddSum);
        // System.out.println(evenSum);
        // System.out.println(oddSum);
        System.out.println(totalDif);
       


        //subtract the results of each int returned


    }




}
