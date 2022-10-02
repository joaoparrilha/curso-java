package classe;

//import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto("Notebook", 4356.89);
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		//chamar os parenteses para os metodos
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		
		System.out.printf("Média do carinho = R$%.2f.", mediaCarrinho);
		
	}
}
