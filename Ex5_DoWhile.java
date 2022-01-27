package Repeticao;

import java.util.Scanner;

public class Ex5_DoWhile {

	public static void main(String[] args) {
		
		int x, soma=0;
		Scanner leia = new Scanner(System.in);
		
		
		do
		{
			System.out.println("Digite um número: ");
			x = leia.nextInt();
			soma=soma+x;
				
		}
		while (x!=0);
		System.out.println("A soma dos números digitados é: "+soma);
		
		}	
		
}
