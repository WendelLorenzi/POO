public class Fabrica{
	public static void main(String arg[]){

		Distribuidor1 dist= new Distribuidor1();

		dist.getDist().setPreco(1000);
		dist.getDist().setCod(1);
		dist.getDist().setNomeproduto("Chocolate Muito Bom");
		dist.getDist().setQuantidade(200);
		dist.setCidade("Pompeia");
		dist.setQtdfunc(80);

		System.out.println("\n Nome do produto: "+ dist.getDist().getNomeproduto());
		System.out.println("\n Cod. do produto: "+ dist.getDist().getCod());
		System.out.println("\n Preço do lote: "+ dist.getDist().getNomeproduto());
		System.out.println("\n Quantidade lote: "+ dist.getDist().getQuantidade());
		System.out.println("\n Cidade onde se localiza a fabrica: "+ dist.getCidade());
		System.out.println("\n Quantidade de funcionarios para produzir um lote: "+ dist.getQtdfunc());
	}
}