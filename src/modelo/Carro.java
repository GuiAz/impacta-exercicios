package modelo;
//Classe Carro represente um carro com 10 atributos.
public class Carro {
	//Atributos privados
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private double preco;
	private String tipoCombustivel;
	private int numeroPortas;
	private boolean arCondicionado;
	private double quilometragem;
	private String placa;
	
	//Construtor Completo
	public Carro(String marca, String modelo, int ano, String cor, double preco, String tipoCombustivel,
			int numeroPortas, boolean arCondicionado, double quilometragem, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.preco = preco;
		this.tipoCombustivel = tipoCombustivel;
		this.numeroPortas = numeroPortas;
		this.arCondicionado = arCondicionado;
		this.quilometragem = quilometragem;
		this.placa = placa;
	}
	
	//Construtor Vazio
	public Carro() {
	}
	
	//Getters and Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public double getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
