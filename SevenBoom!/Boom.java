 
 
 
 public class Boom{

    public static void main(String[] args){

        int[] array = {1, 2, 3, 4, 5, 6, 92};

        int size = array.length;
        boolean boom = false;

        for(int i = 0; i < size;i++){

            if(array[i] % 10 == 7){

                boom = true;

            }
            if(i == size-1){

                if(boom != true){

                    System.out.println("Array has no 7s");

                }
                else{
                    System.out.println("Boom!");
                }

            }

        }



    }



}