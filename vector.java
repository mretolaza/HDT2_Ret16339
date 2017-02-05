import java.util.Vector;

import org.junit.Test;
/**
 * @author Mar�a Mercedes Retolaza Reyna 
 * En esta clase se implementa la interface y se realizan las operaciones del
 * stack, es decir, se realizan las instrucciones para cada operaci�n 
 * @param <E>
 */
public class vector<E> implements iStack<E> {
	
	private Vector <E> v=new Vector <E>(1);
	
	/* (non-Javadoc)
	 * @see iStack#push(java.lang.Object)
	 * Operaci�n de insertar en Stack 
	 */
	@Override
	@Test
	public void push(E p) {
		v.add(p);
		
	}

	/* (non-Javadoc)
	 * @see iStack#pop()
	 * Operaci�n que saca un dato del stack
	 */
	@Override
	@Test
	public E pop() {
		E p = null;
		if (!isEmpty()) {
		    p = v.lastElement();
		    v.remove(v.size() - 1);}
		return p;
	}

	/* (non-Javadoc)
	 * @see iStack#isEmpty()
	 * revisa si esta vacio 
	 */
	@Override
	
	public boolean isEmpty() {
		return (v.isEmpty());
	}

	

}