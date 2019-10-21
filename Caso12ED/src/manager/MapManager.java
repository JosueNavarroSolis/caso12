package manager;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Vector;

import grafo.Arc;
import grafo.Grafo;
import grafo.Nodo;

public class MapManager<T> extends Observable {
	private Grafo<Point> grafo;
	private Vector<Nodo<Point>> origen;

	public MapManager() {
		grafo = new Grafo<Point>();
	}

	
	public void agregar_punto(Nodo<Point> nodoDestino) {
		for (int index=0;origen.get(index).equals(nodoDestino);index++) {
			grafo.agregar_Arco(origen.get(index), nodoDestino , 0);
			}
	}
	
	public void agregar_punto(int x, int y) {
		Point punto =new Point(x,y);
		
		if(grafo.getListaNodos().firstElement()==null) {
			grafo.agregar_Nodo(punto);
		}else {
			origen.add(grafo.getListaNodos().lastElement());
			//Nodo<Point> origen=grafo.getListaNodos().lastElement();//corregir hay que guardar el ultimo apuntado
			grafo.agregar_Nodo(punto);
			grafo.agregar_Arco(origen.lastElement(),grafo.getListaNodos().lastElement() , 0);
		}
		
	}
	public void recorridoEnAnchura(Nodo<Point> objetivo) {
		ArrayDeque<Nodo<Point>> cola=new ArrayDeque<Nodo<Point>>();
		cola.add(grafo.getListaNodos().get(0));
		cola.getFirst().setMarcado(true);
		
		while(!cola.isEmpty()) {
			Nodo<Point> actual = cola.poll();
			
			for(Arc<Point> arco : actual.getArcos() ) {
				if (!arco.getDestino().isMarcado()) {
					
					Nodo<Point> destino = arco.getDestino();
					cola.add(destino);
					destino.setMarcado(true);
					destino.setAnterior(actual);
					
					// if destion es mi objetivo
					// ya puedo parar y construyo la respuesta
				}
			}
		}
		
	}
	public void notifyObservers() {
		
	}
	public void SetChange() {
		
	}
	public void addObserver() {
		
	}
}
