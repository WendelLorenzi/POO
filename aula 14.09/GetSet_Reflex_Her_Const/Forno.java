public class Forno extends Micro{

	private int grauTemp;

	public Forno(){
		grauTemp = 360;
		System.out.println("\n Executou o construtor da classe Forno");
	}


	public int getGrauTemp(){
		return grauTemp;
	}


	public void setGrauTemp(int grauTemp){
		this.grauTemp = grauTemp;
	}

	
}