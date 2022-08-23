//Wendel Matheus - 1997556 - Eng de computação - POO - 2018/2

public class MainMesa{

	public static void main(String arg[]){

		StorageMesa st= new StorageMesa();

		Leitura lei= new Leitura();


		System.out.println("\n \tInsere Mesa de estudos = 1");
		System.out.println("\n \tInsere Mesa de cozinha = 2");
		System.out.println("\n \tConsulta Mesa de estudos = 3");
		System.out.println("\n \tConsulta Mesa de cozinha = 4");
		System.out.println("\n \tAlterar registro de Mesa de estudos = 5");
		System.out.println("\n \tAlterar registro de Mesa de cozinha = 6");
		System.out.println("\n \tExcluir registro de Mesa de estudos = 7");
		System.out.println("\n \tExcluir registro de Mesa de cozinha = 8");
		System.out.println("\n");
		int a= 0;
		a = Integer.parseInt(lei.entDados("Digite a opcao desejada: "));

		switch(a){
			case 1:{
				st.insereMesaEstudo();
				break;
			}
			case 2:{
				st.insereMesaCozinha();
				break;
			}
			case 3:{
				st.consMesaEstudo();
				break;
			}
			case 4:{
				st.consMesaCozinha();
				break;
			}
			case 5:{
				st.alteraMesaEstudo();
				break;
			}
			case 6:{
				st.alteraMesaCozinha();
				break;
			}
			case 7:{
				st.excluiMesaEstudo();
				break;
			}
			case 8:{
				st.excluiMesaCozinha();
				break;
			}
			default:{
				System.out.println("\n Opcao nao encontrada !");
			}
		}
	}
}