import java.io.InputStreamReader;

public class TstMicro{


	public static void main(String arg[]){

		Micro mic = new Micro();

		// Origem or = new Origem(); //errroooo
		
	
		mic.setPreco(10);
		mic.setCor("Azul");
		mic.getOrig().setCod(1);
		mic.getOrig().setPais("EUA");
		

		System.out.println("\n Preco.....: "+ mic.getPreco());
		System.out.println("\n Cor.......: "+ mic.getCor());
		System.out.println("\n Cod Pais..: "+ mic.getOrig().getCod());
		System.out.println("\n Nome Pais.: "+ mic.getOrig().getPais());
	
	}
	
}