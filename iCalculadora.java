import org.junit.Test;

/*María Mercedes Retolaza Reyna,16339 
 * Sección,20
 * 
 */
public interface iCalculadora {
	@Test
    /**
     * @param num
     * @return
     * Operar es el que realizarà las operaciones tipo postfix 
     */
    public double operar (String num);
	@Test
	/**
	 * @param x
	 * @param y
	 * @return
	 * Mètodo donde se realiza una suma comun, recibe dos numeros y se opera 
	 * de la forma a+b
	 */
	public double suma(double x, double y);
	@Test
	/**
	 * @param x
	 * @param y
	 * @return
	 * Mètodo donde se realiza una resta comun, recibe dos numeros y se opera 
	 * de la forma a-b
	 */
	public double resta(double x, double y);
	@Test
	/**
	 * @param x
	 * @param y
	 * @return
	 * Mètodo donde se realiza una multiplicacion comun, recibe dos numeros y se opera 
	 * de la forma a*b
	 */
	public double multiplicacion(double x, double y);
	@Test
	/**
	 * @param x
	 * @param y
	 * @return
	 * Mètodo donde se realiza una division comun, recibe dos numeros y se opera 
	 * de la forma a/b
	 */
	public double division(double x, double y);


}
