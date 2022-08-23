public class Forno extends Micro{

	private int grauTemp;
	private String aa;

	public String getaa(){
		return aa;
	}
	public void setaa(String aa){
		this.aa= aa;
	}
	public int setaa(String aa){
		return (aa + aa.length());
	}


	public int getGrauTemp(){
		return grauTemp;
	}


	public void setGrauTemp(int grauTemp){
		this.grauTemp = grauTemp;
	}

	
}