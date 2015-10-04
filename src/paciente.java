
public class Paciente<E> implements Comparable<E> {
	
	private String name;
	private String sintoma;
	private String code;
	
	public Paciente (String new_name, String new_sintoma, String new_code) {
		name=new_name;
		sintoma=new_sintoma;
		code=new_code;
	}
	
	public String getCode(){
		return code;
	}
	
	@Override
	public int compareTo(E new_paciente) {
		// TODO Auto-generated method stub
		String new_code=((Paciente)new_paciente).getCode();
		return code.compareTo(new_code);
	}


}
