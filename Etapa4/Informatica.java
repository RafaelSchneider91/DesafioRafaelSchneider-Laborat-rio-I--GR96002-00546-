package Etapa4;

public class Informatica extends Loja {

    private double seguroEletronicos; //representa um seguro que lojas que vendem aparelhos eletrônicos devem pagar mensalmente
    private String tipoLoja;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int qtdMaxEstoqueProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao,  qtdMaxEstoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
        this.tipoLoja = "Informática";
    }
    
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public String getTipoLoja() {
        return tipoLoja;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public void setTipoLoja(String tipoLoja) {
        this.tipoLoja = tipoLoja;
    }

    @Override
    public String toString(){
        return "Loja Informatica{"+
                "Valor Mensal Seguro: " + seguroEletronicos +
                '}';    
    }

    

}
