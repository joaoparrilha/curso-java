package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1]= 8;
		notasAlunoA[2]= 6.7;
		notasAlunoA[3]= 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total1  = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total1 += notasAlunoA[i];
		}
		
		double media = (total1 /notasAlunoA.length);
		System.out.println(media);
		
		double [] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		double total2 = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			total2 += notasAlunoB[i];
		}
		
		double media2 = total2/notasAlunoB.length;
		System.out.println(media2);
	}

}
