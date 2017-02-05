import org.junit.Test;

/*María Mercedes Retolaza Reyna, 16339 
 * Sección,20
 * 
 */
/**
 * @author María Mercedes Retolaza Reyna, 16339
 * Interface de Stack, tiene como métodos las tres instrucciones que se 
 * implementarán en el programa (push, pop y empty) 
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
