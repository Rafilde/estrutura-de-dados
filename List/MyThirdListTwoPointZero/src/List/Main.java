package List;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DrderedDynamicList teste = new DrderedDynamicList(); 
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			teste.add(sc.next());
		}
		System.out.println(teste);
	}
}
