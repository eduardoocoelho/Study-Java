package beecrowd;

import java.util.Scanner;

public class TabelasHash{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int c = sc.nextInt();
			int[] entrada = new int[c];
			String[] resp = new String[m];
			for(int j = 0; j < m; j++) {
				resp[j] = j + " -> ";
			}
			for(int j = 0; j < c; j++) {
				entrada[j] = sc.nextInt();
			}
			for(int x = 0; x < m; x++) {
				for(int j = 0; j < c; j++) {
					if(entrada[j] % m == x) {
						resp[x] += entrada[j] + " -> ";  
					}
				}
				resp[x] += "\\ ";
				System.out.println(resp[x]);
			}
		}
		
		sc.close();
	}
}