package Repeticao;

import java.util.Scanner;

public class Ex2_For {

	public static void main(String[] args) {
		
		int x, contpar=0, contimpar=0, cont=0;
		Scanner leia = new Scanner(System.in);
		
		for (cont=1; cont<=10; cont++)
		{
			System.out.println("Digite o "+cont+"� n�mero.");
			x=leia.nextInt();
		if (x%2==0)
		{
			contpar++;
		}
		if (x%2!=0)
		{
			contimpar++;
		}
		}
		System.out.println(contpar+" s�o n�meros PARES.");
		System.out.println(contimpar+" s�o n�meros �MPARES.");
	
	}

}
