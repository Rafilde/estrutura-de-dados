package SimpleStaticQueue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		StaticQueue<Integer> queue = new StaticQueue(); 
		
		int n = sc.nextInt(); 
		for(int i = 0; i < n; i++) {
			int people = sc.nextInt();
			if(!queue.contains(people)) {
				queue.enqueue(people);
			}
		}
		int m = sc.nextInt(); 
		boolean[] remover = new boolean[100001];

		for(int j = 0; j < m; j++) {
			int exit = sc.nextInt(); 
			remover[exit] = true;
		}
	
		int size = queue.size();
		for(int i = 0; i < size; i++) {
			int element = queue.dequeue();
			if(!remover[element]) {
				queue.enqueue(element);
			}
		}
		
		System.out.println(queue);
	}

}
