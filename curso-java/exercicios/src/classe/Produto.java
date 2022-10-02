package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//metodos construtores, construtores nao tem return
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	//construtor padrao
	Produto(){
		
	}
	
	//nao precisa colocar os parametros, pois estao na mesma classe
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	double precoComDesconto (double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
