package List;

public class DrderedDynamicList<T extends Comparable<T>> {
	No<T> primeiro; 
	No<T> ultimo; 
	int cont = 0; 
	
	public DrderedDynamicList() {
		primeiro = null; 
		ultimo = null; 
	}
	
	public void add(T value) {
		 No<T> novo = new No<>(value);
		if (primeiro == null) {
			primeiro = novo; 
			ultimo = novo; 
		} else if (novo.dado.compareTo(primeiro.dado) < 0) {
			novo.proximo = primeiro;
            primeiro = novo;
		} else if (novo.dado.compareTo(ultimo.dado) >= 0) {
			ultimo.proximo = novo;
			ultimo = novo;
		} else {
			No<T> aux = primeiro; 
			No<T> antes = null;
			while(aux != null) {
				if(aux.dado.compareTo(novo.dado) <= 0) {
					antes = aux;
				}
				aux = aux.proximo;
			}
			novo.proximo = antes.proximo;
            antes.proximo = novo;
		}
		cont++;
	}
	
	public Object get(int pos) {
		if(!posicaoExiste(pos)) {
			throw new ArrayIndexOutOfBoundsException(pos);
		}
		No<T> atual = primeiro; 
		for (int i = 0; i <= size(); i++) {
			if(i == pos) {
				break;
			}
			atual = atual.proximo;
		}
		return (T) atual.dado;
	}
	private boolean posicaoExiste(int pos) {
		if(pos < 0 || pos >= cont) {
			return false; 
		}
		return true;
	}
	
	public void removerInicio() {
		if (primeiro != null) {
			if (primeiro == ultimo) {
				primeiro = null; 
				ultimo = null;
			} else {
				primeiro = primeiro.proximo;
			}
			cont--;
		}
	}
	
	public void removerFinal() {
		if (ultimo != null) {
			if (ultimo == primeiro) {
				primeiro = null; 
				ultimo = null;
			} else {
				No<T> aux = primeiro;
				while(aux.proximo != ultimo) {
					aux = aux.proximo;
				}
				ultimo = aux; 
				ultimo.proximo = null;
			}
			cont--;
		}
	}
	
	public void removerPosicao(int pos) {
		if (pos == 0) {
			removerInicio();
			return;
		} else if (pos == (size()-1)) {
			removerFinal();
			return;
		} else {
			if(!posicaoExiste(pos)) {
				throw new ArrayIndexOutOfBoundsException(pos);
			}
			No<T> atual = primeiro; 
			
			for (int i = 0; i < pos - 1; i++) {
				atual = atual.proximo;
			}
			atual.proximo = atual.proximo.proximo;
			cont--;
		}
	}
	
	public boolean constains(T valor) {
		No<T> aux = primeiro;
		while(aux != null) {
			if(aux.dado.equals(valor)) {
				return true; 
			}
			aux = aux.proximo;
		}
		return false; 
	}
	
	public int indexOf(T valor) {
		No<T> aux = primeiro;
		for(int i = 0; i < cont; i++) {
			if(aux.dado.equals(valor)) {
				return i;
			}
			aux = aux.proximo;
		}
		return -1;
	}
	
	public boolean isEmpty() {
		return cont == 0;
	}
	
	public void clear() {
		cont = 0; 
		primeiro = null; 
		ultimo = null;
	}
	
	public int size() {
		return cont;
	}
	
	public String toString() {
		No<T> aux = primeiro; 
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
