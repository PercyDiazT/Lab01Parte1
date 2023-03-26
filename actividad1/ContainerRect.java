package actividad1;

import java.util.Arrays;

public class ContainerRect {
	private Rectangulo arrRect[] ;
	private double arrDist [] ;
	private double arrAreas[];
	private int n;
	private int numRec;
	
	public ContainerRect(int n) {
		this.n = n;
		this.arrRect = new Rectangulo[n];
	    this.arrDist = new double[n];
	    this.arrAreas = new double[n];

	}
	
	public void addRectangulo(Rectangulo r1) {
		if (numRec < n) {
			arrRect[numRec] = r1;
			arrDist[numRec] = Coordenada.distancia(r1.getEsquina1(), r1.getEsquina2());
			arrAreas[numRec] = r1.getArea();
			numRec++;
		}
		else {
			System.out.println("Esta lleno el contenedor");
		}
	}

	@Override
	public String toString() {
		String s = "Rectangulo\t Coordenadas\t\t Distancia\t\t Area \n";
		for (int i= 0; i < numRec; i++) {
			s += i +"\t\t"+ " "+arrRect[i].getEsquina1()+","+arrRect[i].getEsquina2()+" \t"+arrDist[i]+"\t"+arrAreas[i]+"\n";
		}
		return s;
	}
	


}
