package Etapa4;

public class Main {

    public static void main(String[] args)
    {  
		//instância
		Endereco e1 = new Endereco("Rua dos Bobos", "Piraporinha", "SC", "Uruguai", "99000-100", "0", "Fundos");
		System.out.println("\n[OK] Classe Endereco identificada");

		//// Verificação da classe Data
		//instância
		Data d1 = new Data(10, 3, 2023);
		System.out.println("\n[OK] Classe Data identificada");

		//Criação da instância
		Informatica lojaInformatica = new Informatica("Loja Informática", 10, 2100, e1, d1, 300, 10);
		System.out.println("\n[OK] Classe Informatica identificada");

		//// Verificação da classe Shopping
		Shopping shopping = new Shopping("Shopping Real", e1, 2);
		System.out.println("\n[OK] Classe Shopping idetificada");
        //public int quantidadeLojasPorTipo(String tipoLoja)
		int total = shopping.quantidadeLojasPorTipo("Bijuteria");
		System.out.println(total == 1 ? "[OK] Método Shopping.quantidadeLojasPorTipo() - localizou uma loja" : "[NOK] Método Shopping.quantidadeLojasPorTipo() - não conseguiu localizar uma loja");

		//public boolean removeLoja(String nomeLoja)
		boolean removeLoja1 = shopping.removeLoja("Loja Bijuteria");
		System.out.println(removeLoja1 ? "[OK] Método Shopping.removeLoja() - removeu corretamente uma loja" : "[NOK] Método Shopping.removeLoja() - não conseguiu remover a loja");

		boolean removeLoja2 = shopping.removeLoja("Loja Bijuteria");
		System.out.println(!removeLoja2 ? "[OK] Método Shopping.removeLoja() - loja não existe para remover" : "[NOK] Método Shopping.removeLoja() - removeu uma loja que não existe");

		lojaInformatica.setSeguroEletronicos(800);
		shopping.insereLoja(lojaInformatica);
		total = shopping.quantidadeLojasPorTipo("Informática");
		System.out.println(total == 2 ? "[OK] Método Shopping.quantidadeLojasPorTipo() - localizou duas lojas" : "[NOK] Método Shopping.quantidadeLojasPorTipo() - não conseguiu localizar as lojas");

		//public Informatica lojaSeguroMaisCaro()
		// Informatica maisCaro = shopping.lojaSeguroMaisCaro();
		// System.out.println(maisCaro.getSeguroEletronicos() == 800 ? "[OK] Método Shopping.lojaSeguroMaisCaro()" : "[NOK] Método Shopping.lojaSeguroMaisCaro");

    }
}
