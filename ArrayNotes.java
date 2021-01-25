import java.util.GregorianCalendar;

/**
 * Write a description of class Notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayNotes
{
    public static void main11(String args[]){
        /**
         * Number inside [] is how big the array is
        */
        int[] evens = new int[10];

        for(int i = 0; i < evens.length;i++){
            evens[i] = (i+1)*2;
        }

        System.out.println(evens);
    }

    public static void main(String args[]){
        int[] odds = new int[] {1,3,5,7,9,11,13,15,17,19};

        for(int i = 0; i <= odds.length;i++){
//            System.oust.println(i + ":" + odds[i]);

        }
         for(int odd : odds){
             odd +=1;
         }
    }

    public static void createArrayOfEvens(){
        /*
        Create an array of 12 calenders with each from the start of the month

         */
        GregorianCalendar[] calendars = new GregorianCalendar[12];

        for( GregorianCalendar calendar : calendars){
            System.out.println(calendar);
        }


    }


}
