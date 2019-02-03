import java.util.ArrayList;

public class Problem2 {

    public static void main(String[] args){

        ArrayList<Long> numbers = new ArrayList<Long>();
        ArrayList<Long> evenNumbers = new ArrayList<Long>();

        numbers.add(1L);
        numbers.add(2L);

        evenNumbers.add(2L);

        for(int i=2;  ;i++){

            long newNumber = numbers.get(i-1)+numbers.get(i-2);

            if(!(newNumber>=4000000) ){
                numbers.add(newNumber);

                if(newNumber%2==0){
                    evenNumbers.add(newNumber);
                }

            }

            else
                break;


        }

        long sum=0;

        for(int i=0;i<evenNumbers.size();i++){

            sum+=evenNumbers.get(i);

        }


        System.out.println(sum);



    }



}
