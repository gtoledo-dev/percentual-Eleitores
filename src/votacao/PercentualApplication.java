package votacao;

import java.util.Locale;
import java.util.Scanner;

public class PercentualApplication {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		TiposVotos votos = new TiposVotos();
		
		System.out.println("Entre com dados da eleição: ");
		System.out.print("Total de Eleitores: ");
		votos.totalEleitores = sc.nextDouble();
		System.out.print("Votos Válidos: ");
		votos.validos = sc.nextDouble();
		System.out.print("Votos Brancos: ");
		votos.votosBrancos = sc.nextDouble();
		System.out.print("Votos Nulos: ");
		votos.nulos = sc.nextDouble();
		
		System.out.println("Percentual dos votos válidos: " + votos.percentualVotosValidos() + " %");
		System.out.println("Percentual dos votos brancos: " + votos.percentualVotosBrancos() + " %");
		System.out.println("Percentual dos votos nulos: " + votos.percentualNulos() + " %");
		
		sc.close();

	}

}
