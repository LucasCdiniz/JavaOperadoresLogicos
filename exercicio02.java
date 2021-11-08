package OpLogics;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		int dias, diasAno, diasMeses, diasDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe uma quantidade de dias: ");
		dias = ler.nextInt();
		
		//Conversão dos Anos
		diasAno = dias/365;
		
		//Conversão dos Meses
		dias %=365;
		diasMeses = dias/30;
		
		//Conversão dos dias
		dias%=365;
		diasDias=dias;
		
		
		System.out.println("A quantidade de anos é: "+ diasAno);
		System.out.println("A quantidade de meses é: "+ diasMeses);
		System.out.println("A quantidade de dias é: "+ diasDias);

	}

}
