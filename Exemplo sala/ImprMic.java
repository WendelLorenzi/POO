public class ImprMic{

	public static void main(String arg[]){

		Micro2 mic= new Micro2();

	mic.setPreco(10);
	mic.setCor("Azul");
	mic.getOrig().setCod(1);
	mic.getOrig().setPais("EUA");

	System.out.println("\n Preco: "+ mic.getPreco());
	System.out.println("\n Cor: "+ mic.getCor());
	System.out.println("\n Cod Pais: "+ mic.getOrig().setCod());
	System.out.println("\n Cod Pais: "+ mic.getOrig().setPais());
	}
}