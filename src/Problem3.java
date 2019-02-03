public class Problem3 {

    public static void main(String [] args){

        long largestPrimeFactor =2L;

        long number =600851475143L;

        for(int i=2;i<=number;i++){

            if(number%i==0) {

                while (number % i == 0L) {

                    number = number / i;


                }

                largestPrimeFactor = i;



            }

            else{

            }

        }

        System.out.println(largestPrimeFactor);


    }
}
