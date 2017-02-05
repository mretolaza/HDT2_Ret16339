import org.junit.Test;

/*Mar�a Mercedes Retolaza Reyna, 16339 
 * Secci�n,20
 * 
 */
/**
 * @author Mar�a Mercedes Retolaza Reyna, 16339
 * Interface de Stack, tiene como m�todos las tres instrucciones que se 
 * implementar�n en el programa (push, pop y empty) 
 * @param <E>
 */
public interface iStack<E> {
@Test
   public void push(E p);
@Test
	public E pop();
@Test
	public boolean isEmpty(); 

}
