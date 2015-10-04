/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 8
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Julio Ronaldo Dieguez 14475
 *------------------------------------------------------------------
 *Interface Priority Queue: Interface que indica los metodos a implementar
 *en una PriorityQueue
 **/
public interface PriorityQueue<E extends Comparable<E>>
{
	/**
	 *Retorna el primer elemento de la cola
	 * @return primer elemento de la cola
	 */
	public E getFirst();
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue
	
	/**
	 * Remueve y retorna el elemento con el menor valor de la cola
	 * @return El elemento con el minimo valor 
	 */
	public E remove();
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	
	/**
	 * Se agrega un nuevo elemento a la Cola
	 * @param value Valor que se desea agregar a la cola 
	 */
	public void add(E value);
	// pre: value is non-null comparable
	// post: value is added to priority queue
	
	/**
	 * Determina si la cola se encuentra vacia 
	 * @return TRUE si esta vacio y FALSE si no 
	 */
	public boolean isEmpty();
	// post: returns true iff no elements are in queue
	
	/**
	 * Retorna el tamano del la cola
	 * @return Tamano de la cola 
	 */
	public int size();
	// post: returns number of elements within queue
	
	/**
	 * Remueve todos los elementos de la cola 
	 */
	public void clear();
	// post: removes all elements from queue

}
