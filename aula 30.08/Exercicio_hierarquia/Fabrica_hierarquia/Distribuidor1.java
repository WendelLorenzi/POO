public class Distribuidor1 extends Distribuidor2{

	private Distribuidor2 dist;
	private String cidade;
	private int qtdfunc;

	public Distribuidor2 getDist(){
		return dist;
	}
	public String getCidade(){
		return cidade;
	}
	public int getQtdfunc(){
		return qtdfunc;
	}
	public void setDist(Distribuidor2 dist){
		this.dist= dist;
	}
	public void setCidade(String cidade){
		this.cidade= cidade;
	}
	public void setQtdfunc(int qtdfunc){
		this.qtdfunc= qtdfunc;
	}
}