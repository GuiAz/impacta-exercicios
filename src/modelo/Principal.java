package modelo;

public class Principal {
	
	//Objeto Carro com o informações diretas no Construtor
	public static void main(String[] args) {
		Carro meuCarro = new Carro("HYUNDAI", "HB20", 2017, "BRANCO", 58.300, 
				"ALCOOL/ GASOLINA", 4, true, 27.243, "ABC1234");
		//Impressao separada
		System.out.println("Marca			: " + meuCarro.getMarca());
		System.out.println("Modelo			: " + meuCarro.getModelo());
		System.out.println("Ano				: " + meuCarro.getAno());
		System.out.println("Cor				: " + meuCarro.getCor());
		System.out.println("Preço			: " + meuCarro.getPreco());
		System.out.println("Combustivel		: " + meuCarro.getTipoCombustivel());
		System.out.println("Portas			: " + meuCarro.getNumeroPortas());
		System.out.println("Ar Condicionado : " + meuCarro.isArCondicionado());
		System.out.println("Quilometragem	: " + meuCarro.getQuilometragem());
		System.out.println("Placa			: " + meuCarro.getPlaca());
		
		//Objeto Carro com Construtor populados separadamente.
		Carro meuCarro2 = new Carro();
		meuCarro2.setMarca("FORD");
		meuCarro2.setModelo("FUSION");
		meuCarro2.setAno(2014);
		meuCarro2.setCor("PRATA");
		meuCarro2.setPreco(77.908);
		meuCarro2.setTipoCombustivel("ALCOOL/ GASOLINA");
		meuCarro2.setNumeroPortas(4);
		meuCarro2.setArCondicionado(false);
		meuCarro2.setQuilometragem(24.912);
		meuCarro2.setPlaca("DEF5678");
		
		//Impressao dos atrubuidos juntos
		System.out.println("Marca: " + meuCarro2.getMarca() + "," + "\nModelo: " + meuCarro2.getModelo() +
				", Ano: " + meuCarro2.getAno() + ", Cor: " + meuCarro2.getCor() + ", Preco: " +
				 meuCarro2.getPreco()	+ ", Combustivel: " + meuCarro2.getTipoCombustivel() +
				 ", Portas: " + meuCarro2.getNumeroPortas() + ", Ar Condicionado: " + 
				 meuCarro2.isArCondicionado() + ", Quilometragem: " + meuCarro2.getQuilometragem() +
				 ", Placa: " + meuCarro2.getPlaca());
	}
		
		

}
