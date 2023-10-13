/*
 * Classe Loja: uma loja possui os atributos nome, quantidadeFuncionarios e salarioBaseFuncionario (o nome dos atributos intuitivamente indica o que cada um deles significa).
 * Esta classe possui os seguintes métodos:

 * Métodos Construtores: crie 2 construtores para a classe, sendo que um recebe parâmetros para inicializar todos os atributos e outro recebe apenas valores 
 para inicializar o nome e a quantidade de funcionários, colocando -1 no salário base dos funcionários.
 * Métodos de acesso: crie os métodos de acesso (getters e setters) para todos os atributos da classe.
 * Método toString: se necessário, pesquise sobre o método toString e implemente-o nesta classe, retornando uma String formatada da forma que você desejar, 
 desde que contenha as informações de todos os atributos da classe.
 * Método gastosComSalario: este método não recebe parâmetros e retorna quanto a loja gasta com o salário de todos os seus funcionários. Atente para o fato 
 de que não é possível realizar este cálculo caso o valor do salário base seja -1. Neste caso, não realize o cálculo e retorne -1.
 * Método tamanhoDaLoja: este método não recebe parâmetros e retorna um dos seguintes caracteres: ‘P’, caso a loja possua menos de 10 funcionários; ‘M’, caso a 
 loja possua entre 10 (inclusive) e 30 (inclusive) funcionários; ou ‘G’, caso a loja possua mais do que 31 (inclusive) funcionários.
 */
package Etapa3;

public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    @Override
    public String toString(){
        return "Loja{"+
                "nome='"+nome+'\''+
                ", funcionarios='"+quantidadeFuncionarios+'\''+
                ", salario =" + salarioBaseFuncionario +
                ", endereco =" + endereco +
                ", data de fundacao =" + dataFundacao +
                '}';    
    }


    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1) {
            return -1.00;
        } else {
            return (quantidadeFuncionarios * salarioBaseFuncionario);
        }
        
        
    }

    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios >0 && quantidadeFuncionarios < 10){
            return 'P';
        }else if(quantidadeFuncionarios >= 10 && quantidadeFuncionarios <=30){
            return 'M';
        }else return 'G';
        
    }
}