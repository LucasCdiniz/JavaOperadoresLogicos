package OpLogics;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		double p1,p2,p3,media;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("Informe a nota da P1: ");
		p1 = ler.nextDouble();
		
		System.out.print("Informe a nota da P2: ");
		p2 = ler.nextDouble();
		
		System.out.print("Informe a nota da P3: ");
		p3 = ler.nextDouble();
		
		media = ((p1*2)+(p2*3)+(p3*5))/10;
		
		
		
		System.out.println("A média do aluno é: " + media );
		
	}

}
