package List;

public class DrderedDynamicList<T> {
	No<T> primeiro; 
	No<T> ultimo; 
	int cont = 0; 
	
	public DrderedDynamicList() {
		primeiro = null; 
		ultimo = null; 
	}
	
	public void add(T value) {
		 No<T> novo = new No(value);
		if (primeiro == null) {
			primeiro = novo; 
			ultimo = novo; 
		} else if (((String)value).length() < ((String)primeiro.dado).length()) {
			novo.proximo = primeiro;
            primeiro = novo;
		} else if (((String)value).length() >= ((String)ultimo.dado).length()) {
			ultimo.proximo = novo;
			ultimo = novo;
		} else {
			No<T> aux = primeiro; 
			No<T> antes = null;
			while(aux != null) {
				if(((String)aux.dado).length() <= ((String)value).length()) {
					antes = aux;
				}
				aux = aux.proximo;
			}
			novo.proximo = antes.proximo;
            antes.proximo = novo;
		}
		cont++;
	}
	
	public T get(int pos) {
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
		return atual.dado;
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
	
	public boolean constains(String valor) {
		No<T> aux = primeiro;
		while(aux != null) {
			if(aux.dado.equals(valor)) {
				return true; 
			}
			aux = aux.proximo;
		}
		return false; 
	}
	
	public int indexOf(String valor) {
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
