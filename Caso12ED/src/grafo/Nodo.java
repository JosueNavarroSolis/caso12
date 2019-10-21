package grafo;

import java.util.ArrayList;

public class Nodo<T> {
	private T value;
	private boolean marcado;
	private boolean visitado;
	private ArrayList<Arc<T>> arcos;
	private Nodo<T> anterior;
	
	public Nodo() {
		arcos = new ArrayList<Arc<T>>();
		anterior = null;
	}
	
	public Nodo(T pValue) {
		this.value=pValue;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}

	public boolean isMarcado() {
		return marcado;
	}
	
	public void setMarcado(boolean marcado) {
		this.marcado = marcado;
	}

	public ArrayList<Arc<T>> getArcos() {
		return arcos;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	public Nodo<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo<T> anterior) {
		this.anterior = anterior;
	}
	
	
	
}
