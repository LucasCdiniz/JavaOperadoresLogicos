package OpLogics;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		double a, b, c, r, s, d;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: ");
		a = ler.nextDouble();
		
		System.out.print("Informe o valor de B: ");
		b = ler.nextDouble();
		
		System.out.print("Informe o valor de C: ");
		c = ler.nextDouble();
		
		r = Math.pow((a+b), 2);
		
		s = Math.pow((b+c), 2);
		
		d = ((r+s)/2);
		
		System.out.println("O valor de D é: " + d);
		
		
	}

}
