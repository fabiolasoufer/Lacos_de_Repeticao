package Repeticao;

import java.util.Scanner;

public class Ex2_For {

	public static void main(String[] args) {
		
		int x, contpar=0, contimpar=0, cont=0;
		Scanner leia = new Scanner(System.in);
		
		for (cont=1; cont<=10; cont++)
		{
			System.out.println("Digite o "+cont+"° número.");
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
		System.out.println(contpar+" são números PARES.");
		System.out.println(contimpar+" são números ÍMPARES.");
	
	}

}
