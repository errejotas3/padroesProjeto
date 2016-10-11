import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Jogador jogador = new Jogador();
				
		Baralho baralho = new Baralho();
		Regras regras = new Regras();
		baralho.montarBaralho();
		
		Jogador jogador1 = new Jogador(1, "Rivaldo", 0);
		Jogador jogador2 = new Jogador(2, "Rubinho", 0);
		System.out.println("Informe como quer jogar:\n");
		System.out.println("1 - Duas primeiras cartas\n");		
		System.out.println("2 - Primeira e ultima\n");
		System.out.println("3 - Cartas randomicas");
		Scanner ler = new Scanner(System.in);
		String str = ler.nextLine();
		int tecla = Integer.parseInt(str);
		regras.jogada(tecla);
	}
}