package DynamicPriorityQueue;

public class No<T> {
	T dado; 
	int priority; 
	No<T> proximo; 
	
	
	public No(T dado) {
		this.dado = dado; 
		proximo = null;
	}
	
	public No(T dado, int priority) {
		this.dado = dado; 
		this.priority = priority;
		proximo = null;
	}
}
