package OpLogics;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		double duracao, hrs, min, seg;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a dura��o do evento expressa em segundos");
		duracao = ler.nextDouble();
		
		//Convers�o de segundos em horas
		
		hrs = duracao/3600;
		
		//Convers�o de horas para minutos
		
		min = hrs*60;
		
		//Convers�o de minutos para segundos
		
		seg = min *60;
		
		System.out.println("O resultado � de: " + Math.round(hrs) + 
				"h:" + Math.round(min) + " minutos e " + Math.round(seg) + " segundos");
		
	}

}
