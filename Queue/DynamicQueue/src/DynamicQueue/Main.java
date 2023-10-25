package DynamicQueue;

public class Main {

	public static void main(String[] args) {
		DinamicQueue q = new DinamicQueue(); 
		System.out.println(q.isEmpty());
		//System.out.println(q.front());
		q.enqueue("oi");
		q.enqueue("ola");
		q.enqueue("eae");
		q.enqueue("iai");
		q.enqueue("oiii");
		q.enqueue("fala");
		System.out.println(q);
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q.contains("oi"));
		System.out.println(q.indexOf("oiii"));
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println(q);
		System.out.println(q.size());
		q.dequeue();
		System.out.println(q);
		System.out.println(q.size());
		q.dequeue();
		q.dequeue();
		System.out.println(q);
		System.out.println(q.size());
		q.clear();
		System.out.println(q.isEmpty());
		System.out.println(q);
		System.out.println(q.contains("eae"));
		System.out.println(q.indexOf(4));
		//q.dequeue();
		q.enqueue("oi");
		q.enqueue("ola");
		q.enqueue("eae");
		q.enqueue("iai");
		q.enqueue("oiii");
		q.enqueue("fala");
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println(q);
		System.out.println(q.front());
		System.out.println(q.isEmpty());
		System.out.println(q);
		System.out.println(q.contains("eae"));
		System.out.println(q.indexOf(4));
	}

}
