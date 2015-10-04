/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 8
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Julio Ronaldo Dieguez 14475
 *------------------------------------------------------------------
 *VectorHeap_implementa
 **/

import java.util.Vector;

/**
 * @author PedroJoaquin
 *
 * @param <E>
 */
/**
 * @author PedroJoaquin
 *
 * @param <E>
 */
/**
 * @author PedroJoaquin
 *
 * @param <E>
 */
public class VectorHeap_implementa<E extends Comparable<E>> implements PriorityQueue<E>{

	protected Vector<E> data; // the data, kept in heap order
	
	/**
	 * Constructor de la clase. Crea un nuevo VectorHeap
	 */
	public VectorHeap_implementa()
	// post: constructs a new priority queue
	{
		data = new Vector<E>();
	}
	
	/**
	 * Constructor de la clase. Convierte un vector en un VectorHeap 
	 * @param v Vector que se desea convertir a VectorHeap 
	 */
	public VectorHeap_implementa(Vector<E> v)
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

	/**
	 * Mueve el nodo indicado a una posicion apropiada 
	 * @param leaf Nodo que debe ser movido 
	 */
	protected void percolateUp(int leaf)
	// pre: 0 <= leaf < size
	// post: moves node at index leaf up to appropriate position
	{
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 && (value.compareTo(data.get(parent)) < 0))
		{
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}
	
	/**
	 * Mueve el nodo localizado en la raiz a una posicion apropiada dentro del subarbol
	 * @param root Nodo que se desea mover 
	 */
	protected void pushDownRoot(int root)
	// pre: 0 <= root < size
	// post: moves node at index root down
	// to appropriate position in subtree
	{
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) 
		{
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) && ((data.get(childpos+1)).compareTo (data.get(childpos)) < 0))
				{
					childpos++;
				}
				// Assert: childpos indexes smaller of two children
				if ((data.get(childpos)).compareTo (value) < 0)
				{
					data.set(root,data.get(childpos));
					root = childpos; // keep moving down
			} else { // found right location
				data.set(root,value);
				return;
			}
			} else { // at a leaf! insert and halt
				data.set(root,value);
				return;
			}
		}
	}

	
	/* (non-Javadoc)
	 * @see HDT8.src.PriorityQueue#add(java.lang.Comparable)
	 */
	public void add(E value)
	// pre: value is non-null comparable
	// post: value is added to priority queue
	{
		data.add(value);
		percolateUp(data.size()-1);
	}
	
	/* (non-Javadoc)
	 * @see HDT8.src.PriorityQueue#remove()
	 */
	@Override
	public E remove() {
		//pre: !isEmpty()
		//post: removes and returns the minimum value in priority queue
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if(data.size()>1){pushDownRoot(0);};
		return minVal;
	}


	/* (non-Javadoc)
	 * @see HDT8.src.PriorityQueue#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see HDT8.src.PriorityQueue#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data.size();
	}

	/* (non-Javadoc)
	 * @see HDT8.src.PriorityQueue#clear()
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see HDT8.src.PriorityQueue#getFirst()
	 */
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return data.get(0);
	}
}
