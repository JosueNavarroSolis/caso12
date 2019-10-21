package grafo;

public class Arc<T>
{
	private Nodo<T> origen;
	private Nodo<T> destino;
	private int peso;
	
	public Arc(Nodo<T> origen, Nodo<T> destino, int peso) {
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
	}
	
	public Nodo<T> getOrigen() {
		return origen;
	}
	
	public void setOrigen(Nodo<T> origen) {
		this.origen = origen;
	}
	
	public Nodo<T> getDestino() {
		return destino;
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setDestino(Nodo<T> destino) {
		this.destino = destino;
	}
}
