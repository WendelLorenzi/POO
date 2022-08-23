import java.io.InputStreamReader;

public class Distribuidor2{

	private int cod;
	private String nprod;
	private int qtd;
	private int preco;

	public int getCod(){
		return cod;
	}	
	public int getPreco(){
		return preco;
	}
	public String getNomeproduto(){
		return nprod;
	}
	public int getQuantidade(){
		return qtd;
	}

	public void setCod(int cod){
		this.cod = cod;
	}
	public void setNomeproduto(String nprod){
		this.nprod= nprod;
	}
	public void setQuantidade(int qtd){
		this.qtd= qtd;
	}
	public void setPreco(int preco){
		this.preco= preco;
	}
}