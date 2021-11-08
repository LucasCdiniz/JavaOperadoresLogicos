package OpLogics;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		double a,b,c,d,e,f,x,y;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: " );
		a = ler.nextDouble();
		
		System.out.print("Informe o valor de B: " );
		b = ler.nextDouble();
		
		System.out.print("Informe o valor de C: " );
		c = ler.nextDouble();
		
		System.out.print("Informe o valor de D: " );
		d = ler.nextDouble();
		
		System.out.print("Informe o valor de E: " );
		e = ler.nextDouble();
		
		System.out.print("Informe o valor de F: " );
		f = ler.nextDouble();
		
		
		x = ((c*e)-(b*f) / (a*e)-(b*d));
		
		y = ((a*f)-(c*d) / (a*e)-(b*d));
		
		System.out.println("O valor de X é: " + x + "\nO valor de Y é: " + y);
	}

}
