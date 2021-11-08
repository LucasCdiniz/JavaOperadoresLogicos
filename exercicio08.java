package OpLogics;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		double custoFab, custoConsu, percDist = 0.28, imp = 0.45;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("Informe o custo de fabricação: ");
		
		custoFab = ler.nextDouble();
		
		custoConsu = (custoFab+(custoFab*imp) + (custoFab*percDist));
		
	}

}
