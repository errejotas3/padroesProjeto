class Regras {
	public int vencedor(int ponto){
		if(ponto == 1){
			System.out.println("Jogador 1 venceu!!!");
		}else{
			System.out.println("Jogador 2 venceu!!!");
		}
		return ponto;
	}
	//faz uma jogada com o tipo de retirada de cartas escolhido
	public void jogada(int tipo){
		Baralho baralho = new Baralho();
		baralho.montarBaralho();
		int i;
		switch (tipo) {
		case 1:
			baralho.puxaDuasCartas();
			break;
		case 2:
			baralho.primeiraUltima();
			break;
		case 3:
			baralho.cartaRandom();
		default:
			break;
		}
	}
}