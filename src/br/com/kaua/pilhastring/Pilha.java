package br.com.kaua.pilhastring;


public class Pilha {

	No topo;
	
	public Pilha() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push(String valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = null;
		if (isEmpty()) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}

	public String pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha Vazia !!!!");
		} 
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public String top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pìlha Vazia !!!!");
		}
		String valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
}





