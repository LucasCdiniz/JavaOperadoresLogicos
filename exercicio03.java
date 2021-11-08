package OpLogics;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		double duracao, hrs, min, seg;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a duração do evento expressa em segundos");
		duracao = ler.nextDouble();
		
		//Conversão de segundos em horas
		
		hrs = duracao/3600;
		
		//Conversão de horas para minutos
		
		min = hrs*60;
		
		//Conversão de minutos para segundos
		
		seg = min *60;
		
		System.out.println("O resultado é de: " + Math.round(hrs) + 
				"h:" + Math.round(min) + " minutos e " + Math.round(seg) + " segundos");
		
	}

}
