public class Mesa{

	private int preco;
	private String cor;
	private int largura;
	private int altura;
	private Madeira mad= new Madeira();

	public int getPreco(){
		return preco;
	}

	public String getCor(){
		return cor;
	}

	public int getLarg(){
		return largura;
	}

	public int getH(){
		return altura;
	}

	public Madeira getMadeira(){
		return mad;
	}

	public void setPreco(int preco){
		this.preco = preco;
	}

	public void setCor(String cor){
		this.cor = cor;
	}

	public void setLarg(int largura){
		this.largura= largura;
	}
	
	public void setH(int altura){
		this.altura= altura;
	}

	public void setMadeira(Madeira mad){
		this.mad = mad;
	}

}