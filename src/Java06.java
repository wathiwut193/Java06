import java.util.Scanner;

/**
 * Created by user on 02/25/17.
 */
public class Java06 {
    static String[][] month={{"Jan","Feb","Mar","Apr","May","Jun","Aug","Sep","Oct","Nov","Dec","Not found"},{"January","February","March","April","May","June"
            ,"July","August","September","October","November","December","Not Found gak"}};

     public static String short2Full(String m){
         int i;
               for( i=0; i<12; i++){
                   if(m.toLowerCase().equals(month[0][i].toLowerCase())){
                       break;
                   }

               }
         return  month[1][i];
    }

    public static String full2Short(String m){
         int i;
         for(i=0;i<12;i++){
             if(m.toLowerCase().equals(month[1][i].toLowerCase())){
                 break;
             }

         }
         return month[0][i];

    }

    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.println("--Short to full--");
        System.out.print("Enter short name of month = ");
        String mn =inp.next();
        System.out.printf("Full name of %s is %s",mn,short2Full(mn));
        mn = inp.next();
        System.out.printf("Full name of %s is %s",mn,full2Short(mn));


    }
}
