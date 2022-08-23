public class Micro{

	private int preco;
	private String cor;
	private Origem orig = new Origem();

	public int getPreco(){
		return preco;
	}

	public String getCor(){
		return cor;
	}

	public Origem getOrig(){
		return orig;
	}

	public void setPreco(int preco){
		this.preco = preco;
	}

	public void setCor(String cor){
		this.cor = cor;
	}
	
	public void setOrig(Origem orig){
		this.orig = orig;
	}


	
	
}