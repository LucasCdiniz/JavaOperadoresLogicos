package OpLogics;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		int dias, diasAno, diasMeses, diasDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe uma quantidade de dias: ");
		dias = ler.nextInt();
		
		//Convers�o dos Anos
		diasAno = dias/365;
		
		//Convers�o dos Meses
		dias %=365;
		diasMeses = dias/30;
		
		//Convers�o dos dias
		dias%=365;
		diasDias=dias;
		
		
		System.out.println("A quantidade de anos �: "+ diasAno);
		System.out.println("A quantidade de meses �: "+ diasMeses);
		System.out.println("A quantidade de dias �: "+ diasDias);

	}

}
