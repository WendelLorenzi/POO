public class Distribuidor1 extends Distribuidor2{

	private String cidade;
	private int qtdfunc;

	public Distribuidor1(){
		qtdfunc= 0;
		cidade= "";
	}

	public String getCidade(){
		return cidade;
	}
	public int getQtdfunc(){
		return qtdfunc;
	}
	public void setCidade(String cidade){
		this.cidade= cidade;
	}
	public void setQtdfunc(int qtdfunc){
		this.qtdfunc= qtdfunc;
	}
}