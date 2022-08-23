public class TstObjMicro{


	public static void main(String arg[]){

		Forno forno = new Forno();
		Telefone tel = new Telefone();

				
		tel.setNumTel(35204009);
		tel.setPreco(16);
		tel.setCor("rosa");
		tel.getOrig().setCod(13);
		tel.getOrig().setPais("China");	

		forno.setGrauTemp(180);
		forno.setPreco(52);
		forno.setCor("Forno Branco");
		forno.getOrig().setCod(55);
		forno.getOrig().setPais("Brasil");
		

		System.out.println("\nDados do Forno\n");
		System.out.println("\nTemperatura....: "+ forno.getGrauTemp());
		System.out.println("\n Preco.....: "+ forno.getPreco());
		System.out.println("\n Cor.......: "+ forno.getCor());
		System.out.println("\n Cod Pais..: "+ forno.getOrig().getCod());
		System.out.println("\n Nome Pais.: "+ forno.getOrig().getPais());

		System.out.println("\nDados do Telefone\n");
		
		System.out.println("\nNumero tel.: "+ tel.getNumTel());

		System.out.println("\n Preco.....: "+ tel.getPreco());
		System.out.println("\n Cor.......: "+ tel.getCor());
		System.out.println("\n Cod Pais..: "+ tel.getOrig().getCod());
		System.out.println("\n Nome Pais.: "+ tel.getOrig().getPais());

	
	}
	
}

//OBJETO Forno = classe forno + classe Micro.