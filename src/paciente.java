
public class paciente<E> implements Comparable<E> {
	
	private String name;
	private String sintoma;
	private char code;
	
	public paciente (String new_name, String new_sintoma, char new_code) {
		name=new_name;
		sintoma=new_sintoma;
		code=new_code;
		
	}
	
	public char getCode(){
		return code;
	}
	
	@Override
	public int compareTo(E new_paciente) {
		// TODO Auto-generated method stub
		char new_code=((paciente)new_paciente).getCode();
		if (new_code>this.code){
			return -1;
		}
		if (new_code<this.code){
			return 1;
		}
		return 0;
	}


}
