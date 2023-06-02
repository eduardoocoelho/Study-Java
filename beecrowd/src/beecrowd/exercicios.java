package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class exercicios {
	   public static void main(String[] args){
		   int x1, x2, x3, x4;
		   x1 = 4;
		   x2 = 6;
		   x3 = 9;
		   x4 = 0;
		   
		   if ( ! ( x1 >= 4) ) System.out.println("V");
		   if ( ( x1 < 5 && x3 != 10) || ( ( x2 % 2) == 0) )  System.out.println("V");
		   if ( ! (( x3 > 6 && x4 == 0 ) && (x2 <= 6 && x3 != 9))) System.out.println("V");
		   if ((x3 < 8 || x4 != 0 )  || ( x1 != 2 || x2 > 5 )) System.out.println("V");
		   if (!(( x3 % 3) == 0)) System.out.println("V");
	   }
}
