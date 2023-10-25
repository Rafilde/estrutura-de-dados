package dynamicstack;

public class No<T> {
	T dado; 
	No<T> proximo;  
	
	public No(T dado) {
		this.dado = dado; 
		proximo = null; 
	}
}
