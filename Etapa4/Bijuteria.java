package Etapa4;

public class Bijuteria extends Loja{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int qtdMaxEstoqueProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qtdMaxEstoqueProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }


    @Override
    public String toString(){
        return "Loja Bijuteria{"+
                "Meta de Vendas =" + metaVendas +
                '}';    
    }



}
