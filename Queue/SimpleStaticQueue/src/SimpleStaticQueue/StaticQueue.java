package SimpleStaticQueue;

public class StaticQueue<T> {
	
	Object[] vetor;
     int inicio = 0;
     int fim = -1;
     int capacidade = 10;

    public StaticQueue() {
    	vetor = new Object [capacidade];
    }

    public void clear() {
        vetor = (T[]) new Object[capacidade];
        inicio = 0;
        fim = -1;
    }
    
    public boolean contains(T value){
		for (int i = 0; i < size(); i++) {
	        if (vetor[i] == value) {
	            return true; 
	        }
	    }
        return false;
    }

    public void enqueue(T elemento) {
        if (size() == capacidade - 1) {
            int novaCapacidade = capacidade * 2;
            T[] novoVetor = (T[]) new Object[novaCapacidade];
            int count = size();
            int index = inicio;
            for (int i = 0; i < count; i++) {
                novoVetor[i] = (T) vetor[index];
                index = (index + 1) % capacidade;
            }
            capacidade = novaCapacidade;
            inicio = 0;
            fim = count - 1;
            vetor = novoVetor;
        }
        fim = (fim + 1) % capacidade;
        vetor[fim] = elemento;
    }

    public T dequeue() {
        T elemento = (T) vetor[inicio];
        inicio = (inicio + 1) % capacidade;
        return elemento;
    }

    public T front() {
        return (T) vetor[inicio];
    }

    public boolean isEmpty() {
        return (fim + 1) % capacidade == inicio;
    }

    public int size() {
        if (fim >= inicio) {
            return fim - inicio + 1;
        } else {
            return capacidade - inicio + fim + 1;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        int count = size();
        int index = inicio;

        for (int i = 0; i < count; i++) {
            sb.append(vetor[index]);
            if (i < count - 1) {
                sb.append(" ");
            }
            index = (index + 1) % capacidade;
        }

        //sb.append("");
        return sb.toString();
    }

}