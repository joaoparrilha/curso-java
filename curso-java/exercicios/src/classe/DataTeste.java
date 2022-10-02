package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data();
		//data1.dia = 3;
		//data1.mes = 3;
		data1.ano = 1999;
		
		var data2 = new Data(15, 1, 2001);
		//data2.dia = 15;
		//data2.mes = 1;
		//data2.ano = 2001;
		
		System.out.println(data1.obterDataFormatada());
		System.out.printf(data2.obterDataFormatada());
		
		//data1.imprimirDataFormatada();
	}

}
