import java.util.PriorityQueue;
import java.util.Vector;

/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 8
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Julio Ronaldo Dieguez 14475
 *------------------------------------------------------------------
 *VectorHeap: Clase encargada de crear un vector basado en Heap que hereda 
 *de la clase PriorityQueue para ordenar los datos en orden de importancia 
 **/

public class VectorHeap < E extends Comparable<E>> extends PriorityQueue<E>{
	/**
	 * Data: Vector que almacena la informacion del VectorHeap 
	 */
	protected Vector<E> data; // the data, kept in heap order
	
	/**
	 * Constructor de la clase sin ningun vector predeterminado 
	 */
	public VectorHeap()
	// post: constructs a new priority queue
	{
	data = new Vector<E>();
	}
	/**
	 * Constructor de la clase que recibe un Vector como parametro.
	 * Este constructor convierte el vector ingresado en un VectorHeap
	 * @param v Vector a convertir en VectorHeap 
	 */
	public VectorHeap(Vector<E> v)
	// post: constructs a new priority queue from an unordered vector
	{
	int i;
	data = new Vector<E>(v.size()); // we know ultimate size
	for (i = 0; i < v.size(); i++)
	{ // add elements to heap
	add(v.get(i));
	}
	}
	
	/**
	 * Retorna el padre del nodo indicado 
	 * @param i Nodo del cual se desea conocer el padre 
	 * @return Padre del Nodo en la posicion i 
	 */
	protected static int parent(int i)
	// pre: 0 <= i < size
	// post: returns parent of node at location i
	{
	return (i-1)/2;
	}
	
	/**
	 * Retorna el hijo izquierdo del nodo indicado 
	 * @param i Nodo del cual se desea conocer el hijo 
	 * @return Localidad del hijo izquierdo del nodo 
	 */
	protected static int left(int i)
	// pre: 0 <= i < size
	// post: returns index of left child of node at location i
	{
	return 2*i+1;
	}
	
	/**
	 * Retorna el hijo derecho del nodo indicado 
	 * @param i	Nodo del cual se desea conocer el hijo derecho
	 * @return Localidad del hijo derecho del nodo 
	 */
	protected static int right(int i)
	// pre: 0 <= i < size
	// post: returns index of right child of node at location i
	{
	return 2*(i+1);
	}
}
