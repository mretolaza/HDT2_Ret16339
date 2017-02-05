import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author María Mercedes Retolaza Reyna 
 *
 */
public class Main {
	
	/**
	 * @param args
	 * @throws IOException
	 * recibe el archivo de texto y lo muestra 
	 */
	public static void main(String[] args) throws IOException{

	Calculadora c = new Calculadora();
	BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
	String linea = br.readLine();
	double a = c.operar(linea);
	System.out.println(a);
	}
}
