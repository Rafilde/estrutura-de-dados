package DynamicPriorityQueue;

public class Main {

	public static void main(String[] args) {
		DynamicPriorityQueue teste = new DynamicPriorityQueue();
		teste.enqueue("vei", 0);
		teste.enqueue("veia", 0);
		teste.enqueue("adulto", 1);
		teste.enqueue("criança", 2);
		teste.enqueue("bebe", 3);
		System.out.println(teste);
		teste.enqueue("criançaDois", 4);
		System.out.println(teste);
	}

}
