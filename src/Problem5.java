public class Problem5 {


    public static void main(String[] args) {

        long startNumber = 2520;

        while (!isEvenlyDivisible(startNumber)) {

            startNumber++;

        }

        System.out.println(startNumber);


    }


    public static boolean isEvenlyDivisible(long n) {

        for (int i = 10; i <= 20; i++) {

            if (!(n % i == 0)) {
                return false;
            }


        }

        return true;

    }

}


