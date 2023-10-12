package Etapa2;

// import Etapa1.Endereco;

public class Principal {
    public static void main(String[] args){

        
        System.out.println("[Laboratório I]\n Desafio: Validador - Etapa 02\n");

        //instância
		Data d1 = new Data(10, 3, 2023);
        Data d2 = new Data(10, 4, 2023);
        // System.out.println(d1.toString());

		//// Verificação da classe Produto
		Produto p1 = new Produto("Cubo mágico", 10, d1);
		System.out.println("\n[OK] Classe Produto identificada");
		System.out.println(p1.toString());

        // public boolean estaVencido(d1);
		System.out.println(p1.estaVencido(new Data(20, 4, 2023)) ? "[OK] Método Produto.estaVencido()" : "[NOK] Método Produto.estaVencido()");
    }
}
