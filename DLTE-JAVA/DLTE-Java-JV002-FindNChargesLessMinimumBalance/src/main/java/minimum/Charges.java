package minimum;
import java.util.Arrays;

public class Charges {


            Double[] charge(Double[] array){
                for(int i=0;i<array.length;i++){
                    if(array[i]>1000 && array[i]<5000 ){
                        array[i] -= array[i] * 0.03;
                    }
                    else if(array[i]>=5000 && array[i]<10000){
                        array[i] -= array[i] * 0.05;
                    }
                }
                return array;
            }
            public static void main(String[] args) {
                Double[] balances = {2300.0,100000.0,6000.0,2000.0,13000.0,8000.0,2000.0,9000.0,90000.0,2000.0,45000.0,6600.0,9900.0,20000.0,9000.0,7000.0,17000.0,9700.0,6000.0,13000.0};
                Charges ch = new Charges(); //Creating a object
                System.out.println(Arrays.toString(ch.charge(balances))); //Printing the array
            }


}
