package Etapa4;

public class Bijuteria extends Loja {
    private double metaVendas;
    private String tipoLoja;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
        Data dataFundacao, double metaVendas, int qtdMaxEstoqueProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qtdMaxEstoqueProdutos);
        this.metaVendas = metaVendas;
        this.tipoLoja = "Bijuteria";

    }

    public double getMetaVendas() {
        return metaVendas;
    }

   public String getTipoLoja() {
       return tipoLoja;
   }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public void setTipoLoja(String tipoLoja) {
        this.tipoLoja = tipoLoja;
    }

    @Override
    public String toString() {
        return "Loja Bijuteria{" +
                "Tipo loja: " + tipoLoja +
                ", Meta de Vendas: " + metaVendas +
                
                '}';
    }

}
