//Nome: Wendel Matheus - Curso: Eng de computação - RA: 1997556 - Disciplina: POO - Slide: 40 (aula ferramental)

import java.util.Scanner;

public class Ex3_matriz{
	public static void main(String arg[]){
		Scanner let= new Scanner(System.in);
		System.out.println(" Digite a quantidade de linhas: ");
		int lin= 0;
		lin= let.nextInt();
		System.out.println(" Digite a quantidade de colunas: ");
		int col= 0;
		col= let.nextInt();
		let.nextLine();

		int mat[][]= new int[lin][col];
		for(int i= 0; i<lin; i++){
			for(int j= 0; j<col; j++){
				System.out.println("Digite o valor na posicao "+ i + j);
				mat[i][j]= let.nextInt();
				let.nextLine();
			}
		} 
		lin= (lin-1);
		col= (col-1);
		for(int i= lin; i>= 0; i--){
			for(int j= col; col>= 0; j--){
				System.out.println("\n Valor: "+ mat[i][j]);
			}
		}

	}
}

//Criar uma matriz no qual o usuario irá definir tamanho
//printar o a matriz 