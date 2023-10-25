package dynamicstack;

import java.util.NoSuchElementException;

public class DynamicStack<T> {
	No<T> topo; 
	No<T> ultimo; 
	int cont; 
	
	public DynamicStack() {
		topo = null; 
		ultimo = null; 
		cont = 0;
	}
	
	public void clear() {
		cont = 0;
		topo = null; 
		ultimo = null;
	}
	
	public T peek() {
		if (isEmpty()) {
	            throw new IllegalStateException("A pilha está vazia.");
	    }
		return (T) topo.dado;
	}
	
	public T pop() {
		 if (topo == null) {
			 throw new NoSuchElementException("A lista está vazia");
		    }

		    No<T> aux = ultimo;
		    No<T> top = null;

		    while (aux != topo) {
		        top = aux;
		        aux = aux.proximo;
		    }

		    if (top == null) {
		        ultimo = null; 
		    } else {
		        top.proximo = null; 
		    }

		    T valor = topo.dado;
		    topo = top; 
		    cont--;
			return (T) valor;
	}
	
	public void push(T value) {
		No<T> novo = new No(value);
		if(topo == null) {
			topo = novo; 
			ultimo = novo; 
		} else {
			topo.proximo = novo;
			topo = novo;
		}
		cont++; 
	}
	
	public int indexOf(T value) {
		No<T> aux = ultimo;
		int i = 0; 
		while(aux != null) {
			if (aux.dado.equals(value)) {
				return i;
			}
			aux = aux.proximo;
			i++;
		}
		return -1;
	}
	
	public int search(T value) {
		No<T> aux = ultimo;
		int i = size(); 
		while(aux != null) {
			if (aux.dado.equals(value)) {
				return i;
			}
			aux = aux.proximo;
			i--;
		}
		return -1;
	}
	
	public int size() {
		return cont; 
	}
	
	public boolean isEmpty() { 
		return cont == 0;
	}
	
	public boolean contains(T value) {
		No<T> aux = ultimo;
		while(aux != null) {
			if (aux.dado.equals(value)) {
				return true;
			}
			aux = aux.proximo;
		}
		return false;
	}
	
	public String toString() {
		No<T> aux = ultimo; 
		StringBuilder str = new StringBuilder(); 
		int i = 0; 
		while(aux != null) {
			str.append(aux.dado); 
			if(i < cont - 1) {
				str.append(", "); 
			}
			aux = aux.proximo;
			i++;
		}
		return "["+str.toString()+"]";
	}
}
