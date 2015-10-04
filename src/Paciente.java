/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 8
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Julio Ronaldo Dieguez 14
 *------------------------------------------------------------------
 *Paciente: Clase encagrada de almacenar los datos de los pacientes. Estos incluyen 
 *el nombre, sintoma y codigo de emergencia. 
 **/


public class Paciente<E> implements Comparable<E> {
	
	private String name;	//Nombre de paciente 
	private String sintoma;	//Sintoma de paciente 
	private String code;	//Codigo de Emergencia de Paciente 
	
	/**
	 * Constructor de la Clase. Crea un nuevo objeto Paciente recibiendo diferentes parametros 
	 * @param new_name Nombre del Paciente a crear
	 * @param new_sintoma Sintoma del paciente a crear 
	 * @param new_code Codigo de Emergencia del paciente 
	 */
	public Paciente (String new_name, String new_sintoma, String new_code) {
		name=new_name;
		sintoma=new_sintoma;
		code=new_code;
	}
	
	/**
	 * Permite obtener el codigo de emergencia del paciente 
	 * @return codigo de emergencia 
	 */
	public String getCode(){
		return code;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(E new_paciente) {
		// TODO Auto-generated method stub
		String new_code=((Paciente)new_paciente).getCode();
		return code.compareTo(new_code);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return name+", "+sintoma+", "+code;
	}

}

