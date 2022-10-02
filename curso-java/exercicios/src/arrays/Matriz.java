package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int  qtdeNotas = entrada.nextInt();
		
		double [][] notasDaTurma = new double [qtdeAlunos][qtdeNotas];
		//x aluno vao ter x notas
		
		double total = 0;
		for(int a = 0; a < notasDaTurma.length; a++){ //a representa o aluno
			for(int n = 0; n < notasDaTurma[a].length; n++) { //n representa a nota
				System.out.printf("Informe a nota do aluno %d do aluno %d: ", n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total/ (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é " + media);
		
		for(double [] notasDoAluno : notasDaTurma) {
			
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		
		entrada.close();
	}

}
