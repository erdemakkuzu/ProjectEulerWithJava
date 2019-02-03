public class Problem6 {

    public static void main(String [] args){

        long sumsquares = 0;
        long squaresofthesumsquares=0;

        for(int i=1 ;i<=100;i++){

            sumsquares+=i*i;
            squaresofthesumsquares+=i;


        }

        squaresofthesumsquares*=squaresofthesumsquares;


        System.out.println("some of the squares =" + sumsquares);
        System.out.println("some of the sum of the squares =" + squaresofthesumsquares);

        System.out.println("Difference is "+ (squaresofthesumsquares-sumsquares));


    }

}
