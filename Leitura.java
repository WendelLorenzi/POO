import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOExeption;

public class Leitura{
	public String inDados(String rotulo){
		InputStreamReader teclado= new InputStreamReader(System.in);
		BufferedReader mem= new BufferedReader(teclado);
		String entrada= "";

		System.out.println(teclado);
		try{
			entrada= mem.readLine();
		}
		catch(IOExeption ioe){
			System.out.println("\n Erro no Sistema ");
		}
		return entrada;
	}
}