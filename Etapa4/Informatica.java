package Etapa4;

public class Informatica extends Loja {

    private double seguroEletronicos; //representa um seguro que lojas que vendem aparelhos eletrônicos devem pagar mensalmente
    
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int qtdMaxEstoqueProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qtdMaxEstoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString(){
        return "Loja Informatica{"+
                "Valor Mensal seguro =" + seguroEletronicos +
                '}';    
    }

}
