
public class Jogador {
	int id;
	String nome;
	int pontos;
	Carta carta;
	public Jogador(int id, String nome, int pontos) {
		super();
		this.id = id;
		this.nome = nome;
		this.pontos = pontos;
	}
	public Jogador(){
	}
	
	public Carta getCarta() {
		return carta;
	}
	public void setCarta(Carta carta) {
		this.carta = carta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + ", Pontos ->" + pontos;
	}
}