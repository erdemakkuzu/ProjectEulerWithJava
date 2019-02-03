
//Multiples of 3 and 5

public class Problem1 {

    public static void main(String[] args){

        int result =0;

        int [] array = new int[999];

        for(int i=0;i<array.length;i++){

            array[i]=i+1;

        }

        result=sum(array);

        System.out.println(result);

    }

    public static int sum(int[] a){

        int sum=0;

        for(int i=0;i<a.length;i++){

            if(a[i]%3==0 || a[i]%5==0){

                sum+=a[i];

            }

        }

        return sum;
    }

}
