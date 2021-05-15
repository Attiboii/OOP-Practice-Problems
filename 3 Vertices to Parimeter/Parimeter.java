

// take in 3 vertices
//calculate distance between them


public class Parimeter{


    public static void main(String[] args){
                                    // x, y
        double arr1[] = new double[] {15, 7};
        double arr2[] = new double[] {5,22};
        double arr3[] = new double[] {11,1};

        System.out.print(calc(arr1, arr2, arr3));


    }

    public static double calc(double[] arr1,double[] arr2,double[] arr3){

// x2-x1 y2-y1

        double distA = Math.sqrt(Math.pow(arr2[0]-arr1[0],2) +  Math.pow(arr2[1]-arr1[1],2));

        double distB = Math.sqrt(Math.pow(arr3[0]-arr1[0],2) +  Math.pow(arr3[1]-arr1[1],2));
        

        double distC = Math.sqrt(Math.pow(arr3[0]-arr2[0],2) +  Math.pow(arr3[1]-arr2[1],2));
        


        double total = distA + distB + distC;

        return total;

    }



}