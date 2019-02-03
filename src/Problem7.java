import java.util.ArrayList;

public class Problem7 {

    public static void main(String [] args){

        ArrayList<Long> primeNumbers = new ArrayList<Long>();
        primeNumbers.add(2L);


        for(int i=3; ; i++){
            if(primeNumbers.size()!=10001){

                for(int j=0;i<primeNumbers.size();i++){

                    if(i%primeNumbers.get(j)==0){


                    }

                    else{
                        break;
                    }

                    long newPrimeNumber =Long.valueOf(i);
                    primeNumbers.add(newPrimeNumber);
                }

            }

            else{

                System.out.println(i);
                break;

            }



        }





    }

}
