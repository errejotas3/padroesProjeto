import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Baralho {
	ArrayList<Carta> baralho = new ArrayList<Carta>();
	Regras regras = new Regras();
	Jogador jogador = new Jogador();
	Jogador jogador1 = new Jogador(1, "Rivaldo", 0);
	Jogador jogador2 = new Jogador(2, "Rubinho", 0);
	Carta carta1, carta2;
	//monta o baralho com 52 cartas
	public void montarBaralho(){
		//Criar Naipes
		for(int j = 0; j <= 3; j++){
			//Criar cartas
			for(int c = 1; c <= 13; c++){
				Carta carta = new Carta();
				if(j == 0){
					carta.setnTipo("PAUS");
					carta.setnValue(10);
				}else if (j == 1) {
					carta.setnTipo("COPAS");
					carta.setnValue(20);
				}else if (j == 2) {
					carta.setnTipo("ESPADAS");
					carta.setnValue(30);
				}else if(j == 3){
					carta.setnTipo("OURO");
					carta.setnValue(40);
				}
				if (c == 1) {
					carta.setcNome("As");
					carta.setcValor(c + carta.getnValue());
					if(j == 0){
						carta.setnTipo("PAUS");
						carta.setnValue(10);
					}else if (j == 1) {
						carta.setnTipo("COPAS");
						carta.setnValue(20);
					}else if (j == 2) {
						carta.setnTipo("ESPADAS");
						carta.setnValue(30);
					}else if(j == 3){
						carta.setnTipo("OURO");
						carta.setnValue(40);
					}
				} else if(c == 11){
					carta.setcNome("Valete");
					carta.setcValor(c + carta.getnValue());
					if(j == 0){
						carta.setnTipo("PAUS");
						carta.setnValue(10);
					}else if (j == 1) {
						carta.setnTipo("COPAS");
						carta.setnValue(20);
					}else if (j == 2) {
						carta.setnTipo("ESPADAS");
						carta.setnValue(30);
					}else if(j == 3){
						carta.setnTipo("OURO");
						carta.setnValue(40);
					}
				} else if(c == 12){
					carta.setcNome("Dama");
					carta.setcValor(c + carta.getnValue());
					if(j == 0){
						carta.setnTipo("PAUS");
						carta.setnValue(10);
					}else if (j == 1) {
						carta.setnTipo("COPAS");
						carta.setnValue(20);
					}else if (j == 2) {
						carta.setnTipo("ESPADAS");
						carta.setnValue(30);
					}else if(j == 3){
						carta.setnTipo("OURO");
						carta.setnValue(40);
					}
				} else if(c == 13){
					carta.setcNome("Rei");
					carta.setcValor(c + carta.getnValue());
					if(j == 0){
						carta.setnTipo("PAUS");
						carta.setnValue(10);
					}else if (j == 1) {
						carta.setnTipo("COPAS");
						carta.setnValue(20);
					}else if (j == 2) {
						carta.setnTipo("ESPADAS");
						carta.setnValue(30);
					}else if(j == 3){
						carta.setnTipo("OURO");
						carta.setnValue(40);
					}
				} else{
					carta.setcNome(""+c+"");
					carta.setcValor(c + carta.getnValue());
				}
				baralho.add(carta);
				Collections.shuffle(baralho);
			}
		}
	}
	//VERIFICA QUEM TEM A MAIOR PONTUAÇÃO
	public int maiorPonto(int ponto1, int ponto2){
		if (ponto1 > ponto2) {
			return 1;
		}else{
			return 2;
		}
	}
	//metodo para pegar as duas primeiras cartas embaralhadas
	public int puxaDuasCartas(){
		for(int i = 0; i < 10; i++){
			carta1 = baralho.remove(1);
			carta2 = baralho.remove(0);
			jogador1.setCarta(carta1);
			jogador2.setCarta(carta2);
			jogador1.setPontos(jogador1.getPontos() + carta1.getcValor());
			jogador1.setPontos(jogador2.getPontos() + carta2.getcValor());
			System.out.println("Jogador: "+ jogador1.getNome() +" tirou " + carta1);
			System.out.println("Jogador: "+ jogador2.getNome() +" tirou " + carta2);
		}
		return regras.vencedor(this.maiorPonto(jogador1.getPontos(), jogador2.getPontos()));
	}
	//metodo para retirar primeira e ultima carta
	public int primeiraUltima(){
		for(int i = 0; i < 10; i++){
			int tamanho = baralho.size() - 1;
			carta1 = baralho.remove(0);
			carta2 = baralho.remove(tamanho - 1);
			jogador1.setCarta(carta1);
			jogador2.setCarta(carta2);
			jogador1.setPontos(jogador1.getPontos() + carta1.getcValor());
			jogador1.setPontos(jogador2.getPontos() + carta2.getcValor());

			System.out.println("Jogador: "+ jogador1.getNome() +" tirou " + carta1);
			System.out.println("Jogador: "+ jogador2.getNome() +" tirou " + carta2);
		}
		return regras.vencedor(this.maiorPonto(jogador1.getPontos(), jogador2.getPontos()));
	}
	//gera duas cartas randomicas
	public int cartaRandom(){
		int tamanho, rCarta1 = 0, rCarta2 = 0;
		Carta carta1, carta2;
		for(int i = 0; i < 10; i++){
			tamanho = baralho.size() - 1;
			Random random = new Random();
			rCarta1 = random.nextInt(tamanho);
			rCarta2 = random.nextInt(tamanho);
			carta1 = baralho.remove(rCarta1);
			carta2 = baralho.remove(rCarta2);
			jogador1.setCarta(carta1);
			jogador2.setCarta(carta2);
			jogador1.setPontos(jogador1.getPontos() + carta1.getcValor());
			jogador1.setPontos(jogador2.getPontos() + carta2.getcValor());
			System.out.println("Jogador: "+ jogador1.getNome() +" tirou " + carta1);
			System.out.println("Jogador: "+ jogador2.getNome() +" tirou " + carta2);	
		}
		return regras.vencedor(this.maiorPonto(jogador1.getPontos(), jogador2.getPontos()));
	}
}