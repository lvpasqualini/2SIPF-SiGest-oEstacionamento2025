// Classe de Objetos que guarda dados de produtos e servicos oferecidos no estacionamento
//Exemplos de produtos e servicos: estacionar veiculo; lavar veiculo; trocar oleo
public class Produto {
	private int peso;
	private double altura;
	
	public Produto(int peso, double altura) {
		this.peso=peso;
		this.altura=altura;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
}