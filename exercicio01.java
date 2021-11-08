package OpLogics;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		int idadeAnos, idadeMeses, idadeDias, totalDias;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: ");
		idadeAnos = ler.nextInt();
		
		System.out.println("Informe quantos meses você tem: ");
		idadeMeses = ler.nextInt();
		
		System.out.println("Informe a quantidade de dias que você tem: ");
		idadeDias = ler.nextInt();
		
		
		totalDias = ((idadeAnos*365) + (idadeMeses*30) + idadeDias);
		
				
		System.out.println("Idade total em dias é de: " + totalDias);
	}

}
