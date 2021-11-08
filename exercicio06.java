package OpLogics;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		double x1,x2,y1,y2,p1,p2,d;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor de X1: ");
		x1 = ler.nextDouble();
		
		System.out.print("Informe o valor de X2: ");
		x2 = ler.nextDouble();
		
		
		System.out.print("Informe o valor de Y1: ");
		y1 = ler.nextDouble();
		
		System.out.print("Informe o valor de Y2: ");
		y2 = ler.nextDouble();
		
		//Potência Math.pow
		p1 = Math.pow((x2-x1), 2);
		
		p2 = Math.pow((y2-y1), 2);
		
		//Raiz Quadrada Math.sqrt
		d = Math.sqrt((p1+p2));
		
		System.out.println("O valor da distância é de: " + d);
		
		
	}

}
