import java.util.Arrays;

public class Gap{

    public static void main(String[] args){

        int[] numArray = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        int lenArr = numArray.length;
        System.out.println(Arrays.toString(Sort(numArray)));
        System.out.print("Largest gap is : " + LGap(numArray, lenArr));

    }


    public static int[] Sort(int arr[]){
        //bubble sort the array
        int len = arr.length;
        for (int i = 0; i < len-1; i++){
            for(int j=0; j < len - i -1; j++){
                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
       
        return arr;

        

    }
    public static int LGap(int arr[],int m){
        //bubble sort the array
        int min1 = arr[0];
        int max1 = arr[0];
     
        // finding maximum and minimum
        // of an array
        for (int i = 0; i < m; i++)
        {
            if (arr[i] > max1)
                max1 = arr[i];
            if (arr[i] < min1)
                min1 = arr[i];
        }
         
        return Math.abs(min1 - max1);


    }
}