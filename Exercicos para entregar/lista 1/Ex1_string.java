//Nome: Wendel Matheus - Curso: Eng de computação - RA: 1997556 - Disciplina: POO - Slide: 40 (aula ferramental)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Ex1_string{
	public static void main(String arg[]){
		InputStreamReader i= new InputStreamReader(System.in);
		BufferedReader buf= new BufferedReader(i);
		String a= "";
		System.out.println("\n Digite a frase: ");
		try{
			a= buf.readLine();
		}
		catch(IOException e){
			System.out.println("Erro de entrada !");
		}
		String b= "";
		System.out.println("\n Escolha uma letra: ");
		try{
			b= buf.readLine();
		}
		catch(IOException e){
			System.out.println("Erro de entrada !");
		}
		int cont=0, cont2=0;
		while(cont < (a.length())){
			//na variavel char está armazenado o caracter da posição i;
			char c= a.charAt(cont);
			// está transformado uma string em um char
			char d= b.charAt(0);
			if(c == d){
				cont2= cont2 + 1;
				System.out.println("\n Posição da letra: "+ cont);
			}
			cont++;
		}
		if(cont2 == 0){
			System.out.println("\n A frase não contem a letra "+ b);
		}
		System.out.println("\n Quantidade de vezes que a letra escolhida apareceu na frase: "+ cont2);
	}
}
// Verificar se a letra escolhida está na frase
//verificar quatas vezes está letra se repete na frase
//printar as posições da letra na frase
