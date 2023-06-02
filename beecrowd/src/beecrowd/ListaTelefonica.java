package beecrowd;

import java.util.Scanner;

public class ListaTelefonica {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int cont = 0;
            int n = sc.nextInt();
            String[] entrada = new String[n];
            for(int i = 0; i < n; i++) {
            	entrada[i] = sc.next();
            	//System.out.println(entrada[i]);
            }
            for(int i = 1; i < n; i++) {
            	for(int j = 0; j < entrada[0].length(); j++) {
            		if(entrada[0].charAt(j) == entrada[i].charAt(j)) {
            			cont++;
            		}
            		else {
            			j = entrada[0].length();
            		}
            	}
            }
            System.out.println(cont);
        }
        sc.close();
    }
}
