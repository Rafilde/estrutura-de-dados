package Stack;

public class StaticStack<T> {
	Object[] v; 
	int n = 10;
	int cont;

	public StaticStack() {
		v = new Object[n]; 
		cont = 0;
	}

	public void clear() {
		cont = 0;
		v = new Object[10];
	}

	public T peek() {
		return (T) v[cont - 1];
	}

	public T pop() {
		Object aux = v[cont - 1];
		cont--;
		return (T) aux;
	}
	
	public void push(T value) {
		if (cont >= v.length) {
			Object[] z = new Object[v.length + (v.length/2)];
			for (int i = 0; i < v.length; i++) {
	            z[i] = v[i];
	        }
			v = z;
		}
		v[cont] = value;
		cont++;
	}
	
	public int indexOf(T elemento) {
		for(int i = 0; i < cont; i++) {
			if(v[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public int search(T elemento) {
		int aux = 0;
		for(int i = cont - 1; i >= 0; i--) {
			aux++;
			if(v[i].equals(elemento)) {
				return aux;
			}
		}
		return -1;
	}
	
	public int size() {
		return cont;
	}

	/*public T get(int pos) {
		if(pos >= cont) {
			  throw new ArrayIndexOutOfBoundsException(pos);
		} 
		return (T) v[pos];
	}

	public void set(int pos, T elemento) {
		if(pos >= cont) {
			throw new ArrayIndexOutOfBoundsException(pos);
		}
		v[pos] = elemento;
	}*/

	public boolean isEmpty() { 
		return cont == 0;
	}

	public boolean contains(T elemento) {
		for(int i = 0; i < cont; i++) {
			if(v[i].equals(elemento)) {
				return true;
			}
		}
		return false; 
	}

	public String toString() {
		StringBuilder str = new StringBuilder(); 
		for(int i = 0; i < cont; i++) {
			str.append(v[i]);
			if (i < cont - 1) {
				str.append(", ");
			}
		}
		return "[" + str + "]";
	}
	
}
