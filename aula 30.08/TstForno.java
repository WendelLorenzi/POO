public class TstForno{
	public static void main(String arg[]){

		Forno forno= new Forno();

		forno.setPreco(52);
		forno.setCor("Forno Branco");
		forno.setGrauTemp(180);

		forno.getOrig().setCod(55);
		forno.getOrig().setPais("Brasil");

		System.out.println("\n Temperatura: "+ forno.getgrauTemp());
		System.out.println("\n Cor: "+ forno.getCor());
		System.out.println("\n Preço: "+ forno.getPreco());
		System.out.println("\n Código: "+ forno.getOrig().getCod());
	}
}