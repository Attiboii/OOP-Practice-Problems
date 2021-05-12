




public class Temp{

    public static int sum = 0;
    public static void main(String[] args){


        int digit = 12345; //find the sum of each digit in this case 1+2+3+4+5

        int s = digSum(digit);
        System.out.println(s);

    }

    public static int digSum(int x){ //method for recursion

        

        if (x==0)
            return 0;
        return (x % 10 + digSum(x / 10)); //recursivly add given int digit


    }



}
