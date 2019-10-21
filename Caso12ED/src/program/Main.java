package program;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import Globals.Globals;
import ventana.Ventana;

public class Main extends JFrame implements Observer {
	public static void main(String[] Args) {
		Main v1 =new Main();
		v1.setSize(Globals.width,Globals.height);
		v1.setVisible(true);
		Ventana p=new Ventana("/Imagen/ciudad.png");
		v1.add(p)
;	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
