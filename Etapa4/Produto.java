/*
 * Classe Produto: um produto possui os atributos nome e preco (sem cedilha). Esta classe possui os seguintes métodos:
 * Método Construtor: crie 1 construtor que um recebe parâmetros para inicializar todos os atributos.
 * Métodos de acesso: crie os métodos de acesso (getters e setters) para todos os atributos da classe.
 * Método toString: se necessário, pesquise sobre o método toString e implemente-o nesta classe, retornando uma String 
 * formatada da forma que você desejar, desde que contenha as informações de todos os atributos da classe.

 */
package Etapa4;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade; //data de validade do produto
    // private Data estaVencido; //dataatual

    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
        // this.estaVencido = estaVencido;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }


    @Override
    public String toString(){
        return "Produto{"+
                "nome: "+nome + 
                ", preço: " + preco +
                ", dataValidade: " + dataValidade +
                '}';    
    }



    public boolean estaVencido(Data data){
        if (dataValidade.getAno() < data.getAno() 
        || (dataValidade.getAno() == data.getAno() && dataValidade.getMes() < data.getMes()) 
        || (dataValidade.getAno() == data.getAno() && dataValidade.getMes() == data.getMes() && dataValidade.getDia() < data.getDia())
        ){
            return true;
        }else{
            return false;
        }

    }
}
