package Repeticao;

import java.util.Scanner;

public class Ex4_While {

	public static void main(String[] args) {
		
		int idade=0, sexo=0, humor=0, cont=0;
		int C=0, mN=0, hA=0, oC=0, maiorN40=0, menorC18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while (cont<=150)
		{
		System.out.println("Informe sua idade: ");
		idade=leia.nextInt();
		System.out.println("Informe seu sexo \n(Digite 1 para: Feminino. 2 para Masculino. Ou 3 para Outros: ");
		sexo=leia.nextInt();
		System.out.println("Informe seu humor \n(Digite 1 para: Calmo. 2 para Nervoso. Ou 3 para Agressivo: ");
		humor=leia.nextInt();
		
		if (humor==1)
		{
			C++;
		}
		if (sexo==1 && humor==2)
		{
			mN++;
		}
		if (sexo==2 && humor==3)
		{
			hA++;
		}
		if (sexo==3 && humor==1)
		{
			oC++;
		}
		if (idade>40 && humor==2)
		{
			maiorN40++;
		}
		if (idade<18 && humor==1)
		{
			menorC18++;
		}
		cont++;
		
	
		

	}
		System.out.println("Total de pessoas calmas: "+C);
		System.out.println("Total de mulheres nervosas: "+mN);
		System.out.println("Total de homens agressivos: "+hA);
		System.out.println("Total de outros calmos: "+oC);
		System.out.println("Total de pessoas nervosas maiores de 40 anos: "+maiorN40);
		System.out.println("Total de pessoas calmas menores de 18 anos: "+menorC18);
	
	}
}
	
