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


* Na classe Loja, crie um novo atributo, que representa os produtos que a loja possui.
* Este atributo deve ser chamado de estoqueProdutos, e é um array de Produto.
* Sempre que uma loja for criada (ou seja, nos métodos construtores), deve ser informada a quantidade máxima de produtos por parâmetro.
* Assim sendo, o array estoqueProdutos será instanciado nos construtores com o tamanho recebido por parâmetro.
* Naturalmente, quando uma loja for criada, o estoque de produtos não terá produtos ainda, apenas espaço necessário para armazená-los.
* Crie os métodos de acesso para este atributo.
* Atualize o método toString.

* imprimeProdutos: este método não recebe parâmetros e imprime a informação de todos os produtos da loja.
* insereProduto: este método recebe um Produto por parâmetro e insere-o na primeira posição livre do array de estoque desta loja (ou seja, na primeira posição nula do array).
* O método deve retornar verdadeiro caso o produto seja inserido no estoque ou falso caso não, seja (no caso de não haver espaço).
* removeProduto: este método recebe uma String que representa o nome de um produto e remove o produto correspondente do estoque. O método retorna verdadeiro caso o produto tenha sido removido e falso caso contrário (caso não haja o produto solicitado no estoque).

 */
package Etapa4;

public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos; //array de Produtos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int qtdMaxEstoqueProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[qtdMaxEstoqueProdutos];
        for(int i=0; i<estoqueProdutos.length; i++){
            estoqueProdutos[i] = null;
        }
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int qtdMaxEstoqueProdutos ){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[qtdMaxEstoqueProdutos];
        for(int i=0; i<estoqueProdutos.length; i++){
            estoqueProdutos[i] = null;
        }   
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

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
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

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
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

    public boolean insereProduto(Produto novoProduto) { //metodo para inserir novos produtos no array;
        if(novoProduto == null){
            return false;
        }
        
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = novoProduto;
                return true;
            }
        }

        return false;
    }

    public boolean removeProduto(String nomeProduto){
        for(int i=0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)){
                estoqueProdutos[i] = null; //Remove o produto, definido o array como null;
                return true; //Produto removido
            }
        }

        return false; //Produto não removido;
    }
    
    public void imprimeProdutos(){ //metodo para imprimir os produtos do array;
        
        for(int i =0; i< estoqueProdutos.length; i++){
            Produto produto = estoqueProdutos[i];
            if(produto != null) {
            System.out.println("Produto" + estoqueProdutos[i] + produto.toString());
            }
        }
    }
}