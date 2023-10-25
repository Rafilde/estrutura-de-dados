package StaticQueue;

import java.util.NoSuchElementException;

public class StaticQueue<T> {
	Object[] v; 
	int n = 10; 
	int fim; 
	int inicio; 
	int count;
	
	public StaticQueue() {
		v = new Object[n]; 
		fim = -1; 
		inicio = 0; 
		count = 0;
	}
	
	public void clear() {
		v = new Object[n];
		fim = -1; 
		inicio = 0;
		count = 0;
	}
	
	public boolean contains(T value){
		for (int i = 0; i < size(); i++) {
	        if (v[i].equals(value)) {
	            return true; 
	        }
	    }
        return false;
    }
	
	public T dequeue() {
		if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia");
        } else {
        	inicio++;
        	count--;
        	return (T) v[inicio - 1];
        }
	}
	
	public void enqueue(T value) {
		fim++;
		if (fim == v.length) {
			if(inicio == 0) {
				Object[] z = new Object[v.length + (v.length/2)];
				for (int i = inicio; i < fim; i++) {
		            z[i] = v[i];
		        }
				v = z;
				inicio = 0;
				v[fim] = value;
			} else {
				fim = 0; 
			}
		} else if(inicio > 0 && fim == inicio) {
			 
			 Object[] z = new Object[v.length + (v.length/2)];
	            for (int i = 0; i < v.length - inicio; i++){
	            	z[i] = v[inicio + i];
	            }
	            for(int j = 0; j < fim; j++) {
					z[v.length - inicio + j] = v[j];
				}
	            inicio = 0;
	            fim = v.length;
	            z[fim] = value;
	            v = z;
		}
			v[fim] = value;
			count++;
	}
	
	public T front() {
		if(isEmpty()) {
			throw new IllegalStateException("A fila está vazia.");
		}
		return (T) v[inicio];
	}
	
	public int indexOf(T value) {
		if (isEmpty()) {
	        return -1; 
	    }    
	    for (int i = 0; i < size(); i++) {
	        int index = (inicio + i) % v.length; 
	        if (v[index].equals(value)) {
	            return i; 
	        }
	    }
	    return -1; 
	}
	
	public boolean isEmpty() {
		return size() == 0; 
		// ou final == -1;
	}
	
	public int size() {
		return count;
		//return fim - inicio + 1;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder(); 
		if(fim >= inicio) {
			for (int i = inicio; i <= fim; i++) {
	            str.append(v[i]).append(" ");       
	        }
		} else if(fim == -1) {
			return "[]";
		} else {
			for (int i = inicio; i < v.length; i++) {
	        	str.append(v[i]).append(" ");
	        }
			 for (int i = 0; i <= fim; i++) {
				 str.append(v[i]).append(" ");	          
		        }
		}
		return str.toString();
	}
	
}
