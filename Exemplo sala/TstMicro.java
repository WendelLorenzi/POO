import java.io.*;

public class TstMicro{

	public static void main(String arg[]){
		Micro2 mic= new Micro2();

		mic.entdados(10);
		//mic.impdados(mic);
		System.out.println("Mic_preco: \n"+ mic.preco);
	}
}