public class Fabrica{
	public static void main(String arg[]){

		Distribuidor1 dist= new Distribuidor1();
		
		dist.setPreco(1000);
		dist.setCod(1);
		dist.setNomeproduto("Chocolate Muito Bom");
		dist.setQuantidade(200);
		dist.setCidade("Pompeia");
		dist.setQtdfunc(80);
		

		System.out.println("\n Nome do produto: "+ dist.getNomeproduto());
		System.out.println("\n Cod. do produto: "+ dist.getCod());
		System.out.println("\n Preço do lote: "+ dist.getPreco());
		System.out.println("\n Quantidade lote: "+ dist.getQuantidade());
		System.out.println("\n Cidade onde se localiza a fabrica: "+ dist.getCidade());
		System.out.println("\n Quantidade de funcionarios para produzir um lote: "+ dist.getQtdfunc());
	}
}