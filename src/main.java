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
        System.out.println("Atención de emergencias que usa la implementación \nproporcionada por el Java Collection Framework\n");
        
        VectorHeap v_heap = new VectorHeap(listado_pacientes);
		String ordenados="";
        while(v_heap.iterator().hasNext()){
			Paciente paciente = (Paciente) v_heap.poll();
			ordenados += paciente.toString()+"\n";
		}
		System.out.println(ordenados);
		
		ordenados="";
		VectorHeap_implementa v_heap2 = new VectorHeap_implementa(listado_pacientes);
		for(int i=0; i<=(v_heap2.size()); i++){
			Paciente paciente = (Paciente)v_heap2.remove();
			ordenados += paciente.toString()+"\n";
		}
		System.out.println(ordenados);
	}
	
}
