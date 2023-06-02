package beecrowd;

import java.util.Scanner;

class evergreen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome1, nome2, resultado = "";
        int casos;

        casos = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < casos; i++){
            nome1 = sc.nextLine();
            nome2 = sc.nextLine();
            //System.out.println(nome1);
            //System.out.println(nome2);
 
            //System.out.println(nome1.length()+nome2.length());

            //System.out.println(nome2.length());
            //System.out.println(nome2.charAt(7));

            
            for(int j = 0; j < nome2.length(); j += 2){
                resultado += nome1.charAt(j);
                resultado += nome1.charAt(j+1);
                resultado += nome2.charAt(j);
                resultado += nome2.charAt(j+1);

                System.out.println(resultado);
            }  

            System.out.println(resultado);
        }

        sc.close();
    }
}