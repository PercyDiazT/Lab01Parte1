package actividad1;
import java.util.ArrayList;
public class Verificador {

	public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {
		double inicioX = r1.getEsquina1().menorX(r1.getEsquina2());
		double finX = r1.getEsquina1().mayorX(r1.getEsquina2());
		double inicioY = r1.getEsquina1().menorY(r1.getEsquina2());
		double finY = r1.getEsquina1().mayorY(r1.getEsquina2());

		ArrayList<Coordenada> arrTodoMenosContR1 = new ArrayList<Coordenada>();
		for(double x = inicioX+0.1; x <= finX-0.1 ; x = x + 0.1 ) {
			for(double y = inicioY+0.1; y <= finY-0.1 ; y = y + 0.1  ) {
				double n1,n2;
				n1 = Math.round(x * 100.0)/100.0;
				n2 = Math.round(y * 100.0)/100.0;
				Coordenada cordAdd = new Coordenada(n1,n2);
				arrTodoMenosContR1.add(cordAdd);
			}
		}
		for(int i = 0 ; i < arrTodoMenosContR1.size();i++) {
			if ((r2.getEsquina1().equals(arrTodoMenosContR1.get(i)) )
					|| r2.getEsquina2().equals(arrTodoMenosContR1.get(i))
					|| r2.getEsquina3().equals(arrTodoMenosContR1.get(i))
					|| r2.getEsquina4().equals(arrTodoMenosContR1.get(i))) {
				return true;
			}
		}

		double inicioR2X = r2.getEsquina1().menorX(r2.getEsquina2());
		double finR2X = r2.getEsquina1().mayorX(r2.getEsquina2());
		double inicioR2Y = r2.getEsquina1().menorY(r2.getEsquina2());
		double finR2Y = r2.getEsquina1().mayorY(r2.getEsquina2());
		
		ArrayList<Coordenada> arrTodoMenosContR2 = new ArrayList<Coordenada>();
		for(double x = inicioR2X+0.1; x <= finR2X-0.1 ; x = x + 0.1 ) {
			for(double y = inicioR2Y+0.1; y <= finR2Y-0.1 ; y = y + 0.1  ) {
				double n1,n2;
				n1 = Math.round(x * 1000.0)/1000.0;
				n2 = Math.round(y * 1000.0)/1000.0;
				Coordenada cordAdd = new Coordenada(n1,n2);
				arrTodoMenosContR2.add(cordAdd);
			}
		}
		for(int i = 0 ; i < arrTodoMenosContR2.size();i++) {
			if ((r1.getEsquina1().equals(arrTodoMenosContR2.get(i)) )
					|| r1.getEsquina2().equals(arrTodoMenosContR2.get(i))
					|| r1.getEsquina3().equals(arrTodoMenosContR2.get(i))
					|| r1.getEsquina4().equals(arrTodoMenosContR2.get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean esJunto(Rectangulo r1, Rectangulo r2) {
		double inicioX = r1.getEsquina1().menorX(r1.getEsquina2());
		double finX = r1.getEsquina1().mayorX(r1.getEsquina2());
		double inicioY = r1.getEsquina1().menorY(r1.getEsquina2());
		double finY = r1.getEsquina1().mayorY(r1.getEsquina2());

		ArrayList<Coordenada> arrContorno = new ArrayList<Coordenada>();
		
		for(double x = inicioX; x <= finX + 0.1 ; x = x + 0.1  ) {
			double n1;
			n1 = Math.round(x * 100.0)/100.0;
			if (inicioX == x || finX == n1) {
				for(double y = inicioY; y <= finY+0.1 ; y = y + 0.1  ) {
					double n2;
					n2 = Math.round(y * 100.0)/100.0;
					Coordenada cordAdd = new Coordenada(n1,n2);
					arrContorno.add(cordAdd);
				}
			}
			else {
				Coordenada cordAddInicioY = new Coordenada(n1,inicioY);
				Coordenada cordAddFinY = new Coordenada(n1,finY);
				arrContorno.add(cordAddInicioY);
				arrContorno.add(cordAddFinY);

			}
		}
		for(int i = 0 ; i < arrContorno.size(); i++) {
			if((r2.getEsquina1().equals(arrContorno.get(i))) || (r2.getEsquina2().equals(arrContorno.get(i))) 
					|| (r2.getEsquina3().equals(arrContorno.get(i))) || (r2.getEsquina4().equals(arrContorno.get(i)))) {
				return true;
			}
		}
		
		double inicioR2X = r2.getEsquina1().menorX(r2.getEsquina2());
		double finR2X = r2.getEsquina1().mayorX(r2.getEsquina2());
		double inicioR2Y = r2.getEsquina1().menorY(r2.getEsquina2());
		double finR2Y = r2.getEsquina1().mayorY(r2.getEsquina2());

		ArrayList<Coordenada> arrContornoR2 = new ArrayList<Coordenada>();
		
		for(double x = inicioR2X; x <= finR2X + 0.1 ; x = x + 0.1  ) {
			double n1;
			n1 = Math.round(x * 100.0)/100.0;
			if (inicioR2X == x || finR2X == n1) {
				for(double y = inicioR2Y; y <= finR2Y + 0.1 ; y = y + 0.1  ) {
					double n2;
					n2 = Math.round(y * 100.0)/100.0;
					Coordenada cordAdd = new Coordenada(n1,n2);
					arrContornoR2.add(cordAdd);
				}
			}
			else {
				Coordenada cordAddInicioR2Y = new Coordenada(n1,inicioR2Y);
				Coordenada cordAddFinR2Y = new Coordenada(n1,finR2Y);
				arrContornoR2.add(cordAddInicioR2Y);
				arrContornoR2.add(cordAddFinR2Y);
			}
		}

		for(int i = 0 ; i < arrContornoR2.size(); i++) {
			if((r1.getEsquina1().equals(arrContornoR2.get(i))) || (r1.getEsquina2().equals(arrContornoR2.get(i))) 
					|| (r1.getEsquina3().equals(arrContornoR2.get(i))) || (r1.getEsquina4().equals(arrContornoR2.get(i)))) {
				return true;
			}
		}
		return false;
	}
	public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {

		double inicioR1X = r1.getEsquina1().menorX(r1.getEsquina2());
		double finR1X = r1.getEsquina1().mayorX(r1.getEsquina2());
		double inicioR1Y = r1.getEsquina1().menorY(r1.getEsquina2());
		double finR1Y = r1.getEsquina1().mayorY(r1.getEsquina2());
		
		ArrayList<Coordenada> cordR1 = new ArrayList<Coordenada>();
		for(double x = inicioR1X; x <= finR1X+0.1; x = x + 0.1) {
			for(double y = inicioR1Y; y <= finR1Y + 0.1; y = y + 0.1) {
				double n1,n2;
				n1 = Math.round(x * 100.0)/100.0;
				n2 = Math.round(y * 100.0)/100.0;
				cordR1.add(new Coordenada(n1,n2));
			}
		}
		
		double inicioR2X = r2.getEsquina1().menorX(r2.getEsquina2());
		double finR2X = r2.getEsquina1().mayorX(r2.getEsquina2());
		double inicioR2Y = r2.getEsquina1().menorY(r2.getEsquina2());
		double finR2Y = r2.getEsquina1().mayorY(r2.getEsquina2());
		
		ArrayList<Coordenada> cordR2 = new ArrayList<Coordenada>();
		
		for(double x = inicioR2X; x <= finR2X+0.1; x = x + 0.1) {
			for(double y = inicioR2Y; y <= finR2Y+0.1; y = y +0.1) {
				double n1,n2;
				n1 = Math.round(x * 100.0)/100.0;
				n2 = Math.round(y * 100.0)/100.0;
				cordR2.add(new Coordenada(n1,n2));
			}
		}
		
		for(int i = 0 ; i < cordR1.size();i++) {
			for(int j = 0; j < cordR2.size();j++) {
				if(cordR1.get(i).equals(cordR2.get(j))) {
					return false;
				}
			}
		}
		return true;
	}
}
