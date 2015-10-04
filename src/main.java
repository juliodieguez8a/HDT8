import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String file = "pacientes.txt";
		String[] separador; //separador de frases
		BufferedReader br = new BufferedReader(new FileReader(file));
	    String line;
	    
	    Vector<Paciente> listado_pacientes = new Vector<Paciente>();
	    
        try {
			while ((line = br.readLine()) != null) {
				//separador de frases
			    separador=line.split(",");
			    listado_pacientes.add(new Paciente(separador[0], separador[1], separador[2]));
			    //System.out.print(separador[0]+separador[1]+separador[2]);
			}
		} catch (IOException e) {
			System.out.println("error");
		}
        
        
        VectorHeap heap = new VectorHeap(listado_pacientes);
		String ordenados="";
        while(heap.iterator().hasNext()){
			Paciente paciente = (Paciente) heap.poll();
			ordenados +=paciente.toString()+"\n";
		}
		System.out.println(ordenados);
	}

}
