//Wendel Matheus - 1997556 - Eng de computação - POO - 2018/2

public class StorageMesa{

private Leitura l= new Leitura();
private Mestudo[] vetEstudo= new Mestudo[5];
private Mcozinha[] vetCozinha= new Mcozinha[5];

	StorageMesa(){
	for(int i= 0; i<5; i++){
		vetEstudo[i]= new Mestudo();
		vetCozinha[i]= new Mcozinha();
	}
}

	public void insereMesaEstudo(String cx1, String cx2, String cx3, String cx4, String cx5){
		for(int i= 0; i<5; i++){
			vetEstudo[i].setPesosup(Integer.parseInt(cx1));
			vetEstudo[i].setPreco(Integer.parseInt(cx2));
			vetEstudo[i].setCor(cx3);
			vetEstudo[i].getMadeira().setCidade(cx4);
			vetEstudo[i].getMadeira().setCep(Integer.parseInt(cx5));
		}
	}

	public void insereMesaCozinha(String cx1, String cx2, String cx3, String cx4, String cx5){
		for(int i= 0; i<5; i++){
			vetCozinha[i].setQtdCad(Integer.parseInt(l.entDados("\n Digite o numero de cadeiras: ")));
			vetCozinha[i].setPreco(Integer.parseInt(l.entDados("\n Digite o preco: ")));
			vetCozinha[i].setCor(l.entDados("\n Digite a cor: "));
			vetCozinha[i].getMadeira().setCidade(l.entDados("\n Digite a cidade de onde veio a madeira: "));
			vetCozinha[i].getMadeira().setCep(Integer.parseInt(l.entDados("\n Digite o CEP da cidade: ")));
		}
	}

	public void consMesaEstudo(){
		int a= (Integer.parseInt(l.entDados("\n Digite a posicao que deseja consultar: ")));
		for(int i = 0; i<5; i++){
			if(i == a){
				System.out.println("\n Peso suportado: "+ vetEstudo[i].getPesosup());
				System.out.println("\n Preco: "+ vetEstudo[i].getPreco());
				System.out.println("\n Cor: "+ vetEstudo[i].getCor());
				System.out.println("\n Cidade de origem da madeira: "+ vetEstudo[i].getMadeira().getCidade());
				System.out.println("\n CEP: "+ vetEstudo[i].getMadeira().getCep());
			}
		}
	}

	public void consMesaCozinha(){
		int a= (Integer.parseInt(l.entDados("\n Digite a posicao que deseja consultar: ")));
		int i;
		for(i = 0; i<5; i++){
			if(i == a){
				System.out.println("\n Quantidade de cadeiras: "+ vetCozinha[i].getQtdCad());
				System.out.println("\n Preco: "+ vetCozinha[i].getPreco());
				System.out.println("\n Cor: "+ vetCozinha[i].getCor());
				System.out.println("\n Cidade de origem da madeira: "+ vetCozinha[i].getMadeira().getCidade());
				System.out.println("\n CEP: "+ vetCozinha[i].getMadeira().getCep());
			} 
		}
	}

	public void alteraMesaEstudo(){
		int a= (Integer.parseInt(l.entDados("\n Digite a posicao que deseja alterar: ")));
		int i;
		for(i = 0; i<5; i++){
			if(i == a){
				vetEstudo[i].setPesosup(0);
			vetEstudo[i].setPesosup(Integer.parseInt(l.entDados("\n Digite o peso suportado: ")));
				vetEstudo[i].setPreco(0);
			vetEstudo[i].setPreco(Integer.parseInt(l.entDados("\n Digite o preco: ")));
				vetEstudo[i].setCor("NULL");
			vetEstudo[i].setCor(l.entDados("\n Digite a cor: "));
				vetEstudo[i].getMadeira().setCidade("NULL");
			vetEstudo[i].getMadeira().setCidade(l.entDados("\n Digite a cidade de onde veio a madeira: "));
				vetEstudo[i].getMadeira().setCep(0);
			vetEstudo[i].getMadeira().setCep(Integer.parseInt(l.entDados("\n Digite o CEP da cidade: ")));
			}
		}
	}

	public void alteraMesaCozinha(){
		int a= (Integer.parseInt(l.entDados("\n Digite a posicao que deseja alterar: ")));
		int i;
		for(i = 0; i<5; i++){
			if(i == a){
				vetCozinha[i].setQtdCad(0);
			vetCozinha[i].setQtdCad(Integer.parseInt(l.entDados("\n Digite a quantidade de cadeiras: ")));
				vetCozinha[i].setPreco(0);
			vetCozinha[i].setPreco(Integer.parseInt(l.entDados("\n Digite o preco: ")));
				vetCozinha[i].setCor("NULL");
			vetCozinha[i].setCor(l.entDados("\n Digite a cor: "));
				vetCozinha[i].getMadeira().setCidade("NULL");
			vetCozinha[i].getMadeira().setCidade(l.entDados("\n Digite a cidade de onde veio a madeira: "));
				vetCozinha[i].getMadeira().setCep(0);
			vetCozinha[i].getMadeira().setCep(Integer.parseInt(l.entDados("\n Digite o CEP da cidade: ")));
			} 
		}
	}

	public void excluiMesaEstudo(){
		int a= (Integer.parseInt(l.entDados("\n Digite a posicao para ser excluida: ")));
			int i;
			for(i = 0; i<5; i++){
				if(i == a){
					vetEstudo[i].setPesosup(0);
					vetEstudo[i].setPreco(0);
					vetEstudo[i].setCor("NULL");
					vetEstudo[i].getMadeira().setCidade("NULL");
					vetEstudo[i].getMadeira().setCep(0);
				} 
			}
	}

	public void excluiMesaCozinha(){
		int a= (Integer.parseInt(l.entDados("\n Digite a posicao para ser excluida: ")));
		int i;
			for(i = 0; i<5; i++){
				if(i == a){
					vetCozinha[i].setQtdCad(0);
					vetCozinha[i].setPreco(0);
					vetCozinha[i].setCor("NULL");
					vetCozinha[i].getMadeira().setCidade("NULL");
					vetCozinha[i].getMadeira().setCep(0);
				} 
			}
	}

}