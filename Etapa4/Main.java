package Etapa4;

public class Main {

    public static void main(String[] args)
    {  

		Endereco e1 = new Endereco("Rua dos Bobos", "Piraporinha", "SC", "Uruguai", "99000-100", "0", "Fundos");
		Data d1 = new Data(10, 3, 2023);

		Loja loja1 = new Loja("Loja1", 20, e1, d1, 3);
		System.out.println(loja1.tamanhoDaLoja());
		Produto produto1 = new Produto("arroz", 4.50, d1);
		// Produto produto2 = new Produto("feijao", 4.50, d1);
		System.out.println(loja1.insereProduto(produto1));
		System.out.println(loja1.removeProduto("arroz"));
		loja1.insereProduto(new Produto("feijao", 4.50, d1));
		loja1.insereProduto(new Produto("margarina", 5.50, d1));
		loja1.imprimeProdutos();


		Shopping shopping1 = new Shopping("Shopping Atlantida", e1, 5);
		shopping1.insereLoja(loja1);
		shopping1.insereLoja(new Loja("Loja2", 20, e1, d1, 2));

		System.out.println(shopping1.toString());
		System.out.println(shopping1.calcQtdLojas());		
		System.out.println(shopping1.removeLoja("Loja2"));
		System.out.println(shopping1.calcQtdLojas());

		Bijuteria lojaBijuteria = new Bijuteria("Loja Bijuteria", 10, 2100, e1, d1, 5000, 10);

		System.out.println(lojaBijuteria.toString());

		Informatica maisCaro = new Informatica("informatica1", 5, 2000, e1, d1, 500, 5);

		System.out.println(maisCaro.toString());


		System.out.println(shopping1.quantidadeLojasPorTipo("Bijuteria"));

		System.out.println(shopping1.quantidadeLojasPorTipo("Informática"));

		//public int quantidadeLojasPorTipo(String tipoLoja)
		int total = shopping1.quantidadeLojasPorTipo("Informática");
		System.out.println(total == 1 ? "[OK] Método Shopping.quantidadeLojasPorTipo() - localizou uma loja" : "[NOK] Método Shopping.quantidadeLojasPorTipo() - não conseguiu localizar uma loja");


	}
}
