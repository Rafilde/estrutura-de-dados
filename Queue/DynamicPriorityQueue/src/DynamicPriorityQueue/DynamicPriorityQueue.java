package DynamicPriorityQueue;

import java.util.NoSuchElementException;

public class DynamicPriorityQueue<T>{
	No<T> first; 
	No<T> last; 
	int cont; 
	
	public DynamicPriorityQueue() {
		cont = 0; 
		first = null; 
		last = null;
	}
	
	public void clear() {
        first = null;
        last = null;
        cont = 0;
	}
	
	public boolean contains(T value){
        No<T> aux = first;
        while(aux != null) {
        	 if (aux.dado.equals(value)){
                 return true;
             }
        	aux = aux.proximo;
        }
        return false;
    }
	
	public T dequeue() {
		  if (isEmpty()) {
	            throw new NoSuchElementException("A pilha está vazia");
	        }
		T aux = first.dado;
		first = first.proximo; 
		cont--; 
		return (T) aux;
	}
	
	public void enqueue(T value, int priority) {
		 No<T> novo = new No(value, priority);
			if (first == null) {
				first = novo; 
				last = novo; 
			} else if (novo.priority < first.priority) {
				novo.proximo = first;
				first = novo;
			} else if (novo.priority >= last.priority) {
				last.proximo = novo;
				last = novo;
			} else {
				No<T> aux = first; 
				No<T> antes = null;
				while(aux != null) {
					if(novo.priority >= aux.priority) {
						antes = aux;
					}
					aux = aux.proximo;
				}
				novo.proximo = antes.proximo;
	            antes.proximo = novo;
			}
			cont++;
	}
	
	public T front() {
        return (T) first.dado;
  }
	
	public boolean isEmpty() {
		return cont == 0;
	}
	
	public int indexOf(T value) {
		No<T> aux = first;
		for(int i = 0; i < cont; i++) {
			if(aux.dado.equals(value)) {
				return i;
			}
			aux = aux.proximo;
		}
		return -1;
	}
	
	public int size() {
		return cont; 
	}
	
	public String toString() {
		No<T> aux = first; 
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
