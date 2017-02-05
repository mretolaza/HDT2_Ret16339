import java.util.Scanner;

import org.junit.Test;

/*María Mercedes Retolaza Reyna, 16339
 * Sección 20 
 */
/**
 * @author Marìa Mercedes Retolaza 
 * Clase donde se realizan las operaciones principales y se implementa la clase 
 * iCalculadora
 */

public class Calculadora implements iCalculadora{
	/* (non-Javadoc)
	 * @see iCalculadora#suma(double, double)
	 */
	@Override 
	@Test
	public double suma(double x, double y){
		double z= x+y;
		return z; 
	}
	/* (non-Javadoc)
	 * @see iCalculadora#resta(double, double)
	 */
	@Override 
	@Test
	public double resta(double x, double y){
		double z= x-y;
		return z; 
	}
	
	/* (non-Javadoc)
	 * @see iCalculadora#multiplicacion(double, double)
	 */
	@Override 
	@Test
	public double multiplicacion(double x, double y){
		double z= x*y; 
		return z; 
	}
	
	/* (non-Javadoc)
	 * @see iCalculadora#division(double, double)
	 */
	@Override 
	@Test
	public double division (double x,double y){
		double z= x/y; 
		return z; 
	}
	
	/* (non-Javadoc)
	 * @see iCalculadora#operar(java.lang.String)
	 */
	@Override 
	@Test
	public double operar(String n){
		vector v = new vector (); 
		Scanner leer = new Scanner(n);
		
		while (leer.hasNext()) {
			if (leer.hasNextInt()) {
				v.push(leer.nextInt());
			} else {
				int n2 = (int) v.pop();
				int n1 = (int) v.pop();
				String op = leer.next();
				
				if (op.equals("+")) {
					v.push(n1 + n2);
				} else if (op.equals("-")) {
					v.push(n1 - n2);
				} else if (op.equals("*")) {
					v.push(n1 * n2);
				} else {
					v.push(n1 / n2);
				}
				
			}
	}
		double a = (int) v.pop();
		return a;
}
}
