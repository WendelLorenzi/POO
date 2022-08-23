
public class TstEntDados{
	public static void main(String arg[]){
		Pessoa p= new Pessoa();
		Leitura l= new Leitura();

		p.setId(Integer.parseInt(l.inDados("Informe o id: ")));
		p.setNome(l.inDados("\n Informe o nome: "));

		System.out.println("\n Id: "+ p.getId());
		System.out.println("\n Nome: "+ p.getNome());

	}
}