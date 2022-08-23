import java.io.*;

public class Maiormenor{
	public static void main(String arg[]){
		int a= 0;
		int b= 5;
		for(a=0; a<=b; a++){
		if(a>b){
			System.out.println("A é maior que B");
		}
			else if(a < b){
				System.out.println("A é menor que B");
			}
				else if(a == b){
					System.out.println("A é igual a B");
				}
		}
	}
}