//Nome: Wendel Matheus - Curso: Eng de computação - RA: 1997556 - Disciplina: POO - Slide: 40 (aula ferramental)

import java.util.Scanner;

public class Ex2_vetor{
	public static void main(String arg[]){
		Scanner dados= new Scanner(System.in);
		System.out.println("\n Digite o tamanho do vetor: ");
		int a= 0;
		a= dados.nextInt();// Lê os dados do teclados
		
		int vet[]= new int[a];
		for(int i=0; i<a; i++){
			System.out.println(" Valor posicao: "+ i);
			vet[i]= dados.nextInt();
			dados.nextLine();
		}
		a= (a-1);// retirando uma unidade da variavel passada para que a posição 0 seja passada no for
		for(int i=a ; i>= 0; i--){
			System.out.println("\n Valor: "+ vet[i]);
		}

	}
}

//Criar um vetor no qual o usuario irá definir  tamanho
//printar o vetor inversamente