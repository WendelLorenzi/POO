import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 


public class Leitura{

	public String entDados(String aa){
		InputStreamReader i= new InputStreamReader(System.in);
		BufferedReader buf= new BufferedReader(i);
		String a= "";
		System.out.println(aa);

		try{
			a= buf.readLine();
		}
		catch(IOException ioe){
			System.out.println("Erro de entrada !");
		}
		return a;
	}
}