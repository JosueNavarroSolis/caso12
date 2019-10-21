package grafo;

import java.util.Vector;

public class Grafo<T> {
	private Vector<Nodo<T>> listaNodos;

	
	public Grafo() {
		listaNodos = new Vector<Nodo<T>>();
	}
	
	public Nodo<T> agregar_Nodo(T pValue){
		Nodo<T> nuevo=new Nodo<T>(pValue);
		listaNodos.add(nuevo);
		return nuevo;
	}	
	
	public void agregar_Arco(Nodo<T> origen,Nodo<T> destino,int peso) {
		
		Arc<T> arco = new Arc<T>(origen, destino, peso);
		origen.getArcos().add(arco);
		
		arco = new Arc<T>(destino, origen, peso);
		destino.getArcos().add(arco);
		
	}

	public Vector<Nodo<T>> getListaNodos() {
		return listaNodos;
	}
	
	
	
}
