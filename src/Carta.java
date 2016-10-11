public class Carta extends Naipe{
	int cValor;
	String cNome;
	//gets and setters 
	public int getcValor() {
		return cValor;
	}
	public void setcValor(int cValor) {
		this.cValor = cValor;
	}
	public String getcNome() {
		return cNome;
	}
	public void setcNome(String cNome) {
		this.cNome = cNome;
	}
	@Override
	public String toString() {
		return "Carta -> " + cNome + " de "  + nTipo + "----- Valor = " + cValor + "\n";
	}
}