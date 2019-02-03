import java.util.ArrayList;

public class Problem4 {

    public static void main(String[] args) {

        ArrayList<Long> thereeDigitProducts = new ArrayList<Long>();
        long largestNumber = 0;

        for (int i = 100 * 100; i <= 999 * 999; i++) {

            long longNumber = Long.valueOf(i);

            thereeDigitProducts.add(longNumber);

        }


        for (int i = 0; i < thereeDigitProducts.size() - 1; i++) {

            if (isPalidrome(thereeDigitProducts.get(i))) {

                largestNumber = thereeDigitProducts.get(i);

            }

        }

        System.out.println(largestNumber);


    }


    public static boolean isPalidrome(long n) {

        String number = String.valueOf(n);

        int divideMark = number.length() / 2 - 1;

        String fromLeft = "";
        String fromRight = "";

        if (number.length() % 2 == 0) {

            for (int i = 0; i <= divideMark; i++) {

                fromLeft += number.charAt(i);

            }

            for (int i = number.length() - 1; i > divideMark; i--) {

                fromRight += number.charAt(i);

            }

        } else {

            divideMark++;

            for (int i = 0; i < divideMark; i++) {

                fromLeft += number.charAt(i);


            }

            for (int i = number.length() - 1; i > divideMark; i--) {

                fromRight += number.charAt(i);

            }


        }


        if (fromLeft.equals(fromRight)) {


            return true;

        } else {


            return false;
        }


    }

}
