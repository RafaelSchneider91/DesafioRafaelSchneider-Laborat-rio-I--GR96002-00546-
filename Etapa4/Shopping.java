/*
 * Um Shopping possui os atributos, nome(do tipo String), endereco (do tipo Endereco) e lojas (que deve ser umarray de Loja).
 * No construtor de Shopping, receba informações para inicializar o nome, o endereço e, também, receba a quantidade máxima de lojasdeste shopping (do tipo inteiro).
 * No construtor de shopping, então, instancie oarray lojas, informando a capacidade dele conforme o valor recebido por parâmetro.
 * Naturalmente, quando um Shopping for criado, ele não terá lojas ainda, apenas o espaço em memória necessário para armazená-las.
 * Crie os métodos de acesso dos atributos.
 * Implemente o método toString nesta classe, retornando uma String formatada da forma que você desejar, desde que contenha as informações de todos os atributos da classe.
 * 
 * 
 * insereLoja: este método recebe um objeto do tipo Loja por parâmetro e insere esta loja no array lojas, na primeira posição livre do array (ou seja, a primeira posição nula).
 *          - O método retorna verdadeiro caso a loja seja inserida corretamente e falso caso contrário (ou seja, caso não haja lugar no array).
 * removeLoja: este método recebe uma String que representa o nome de uma loja e remove a loja com este nome do array lojas.
 *          - O método retorna verdadeiro caso a loja seja removida e falso caso contrário (caso não haja a loja com o nome solicitado no array).
 * quantidadeLojasPorTipo: este método recebe como parâmetro uma String que indica o tipo de loja que deve ser buscado (Cosmético, Vestuário, Bijuteria, Alimentação ou Informática).
 *          - Deve-se então retornar a quantidade de lojas desse tipo que existem no shopping.
 *          - Caso seja recebida uma String que não corresponde a nenhuma das opções anteriores, o método retorna –1.
 * lojaSeguroMaisCaro: este método não recebe parâmetros e retorna a loja do tipo Informatica que paga o maior valor de seguro de eletrônicos do shopping.
 *          - Caso não haja lojas deste tipo, o método retorna null.
 * 
 * 
 */

package Etapa4;

import java.text.Normalizer;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int qtdMaxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdMaxLojas];
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setQtdLojas(Loja[] Lojas) {
        this.lojas = Lojas;
    }

    public int calcQtdLojas() {
        int qtdLojas = 0; //inicia com o valor variavel zero.
        for (int i = 0; i < lojas.length; i++) {// inicia a varredura do array lojas se for diferente de nulo, a variavel qtdLojas, recebe a soma de +1;
            if (lojas[i] != null) {
                qtdLojas++;
            }
        }
        return qtdLojas; //apos passar por todo o array, retorna a qtd de lojas.
    }
    
    @Override
    public String toString(){
        return "Shopping{"+
                "nome = " +nome +
                ", endereço = "+ endereco +
                ", qtd lojdas = " + lojas +
                '}';    
    }

    public boolean insereLoja(Loja novaLoja){ // retorna true caso inserido com sucesso e false caso negativo;
        for(int i=0; i < lojas.length; i++){
            if(lojas[i] == null){ //verifica o espaço nulo e caso verdadeiro atribui a loja que foi instaciada no parametro do metodo;
                lojas[i] = novaLoja;
                return true; 
            }
        }
        return false;
    }
    
    public boolean removeLoja(String removeLoja){ //remove a loja buscando pelo nome dela;
        for(int i=0; i < lojas.length; i++){
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(removeLoja)){ //busca as lojas diferentes de null e o nome da loja ignorando letras maiusculas e minusculas;
                lojas[i] = null; //Remove a loja, definido o array como null;
                return true; //Loja removida
            }
        }
        return false; //Loja não encontrada
    }

    // Método para normalizar uma string para sua Forma Canônica Composta (NFC)
    public static String normalizar(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFC);
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int total = 0; 
        
        tipoLoja = normalizar(tipoLoja); // Normaliza o tipoLoja para garantir consistência de palavras;
    
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i] instanceof Loja) { //se caso o objeto da loja i possuir um instancia do tipo loja
                if (lojas[i] instanceof Bijuteria) { //se caso o objeto da loja i possuir um instancia do tipo bijuteria
                    if (((Bijuteria) lojas[i]).getTipoLoja().equalsIgnoreCase(tipoLoja)) { //se caso o objeto bijuteria possuir o tipo loja bijuteria, então sera atribuido o valor +1 na variavel total;
                        total++; 
                    }
                }
                if (lojas[i] instanceof Informatica) { //se caso o objeto da loja i possuir um instancia do tipo informatica
                    if (((Informatica) lojas[i]).getTipoLoja().equalsIgnoreCase(tipoLoja)) {
                        total++;
                    }
                }
                
            }
        }
        return total;
    } 

    public Informatica lojaSeguroMaisCaro() { //busca a loja com seguro mais caro das lojas do tipo Informática.
        Informatica lojaMaisCara = null; //inicia o metodo com a variavel com valor null;
        double valorMaisCaro = 0.0; //inicia o metodo com a veriavel com valor 0.0;

        for (int i =0; i < lojas.length; i++){
            if (lojas[i] instanceof Informatica) { //se a loja i , possui um instancia do tipo informatica,
                Informatica informatica = (Informatica) lojas[i]; // é convertido (casting) e armazenado na variavel informatica, para poder acessar os metodos da classe informatica.
                if(informatica.getSeguroEletronicos() > valorMaisCaro){// se o valor atual é maior do o valor da variavel nova, então é identificado a loja que possui o maior seguro.
                    valorMaisCaro = informatica.getSeguroEletronicos(); //atualiza a variavel com o novo valor.
                    lojaMaisCara = informatica; //atualiza a variavel com a loja do seguro maior;
                }
                
            }
        }

        return lojaMaisCara; //retorna o valor da variavel validado no for;
    }
    
    public void imprimeLojas(){ //exibe todas as lojas criadas
        for(int i =0; i < lojas.length; i++){
            Loja l = lojas[i];
            if (l != null) { //se a loja for diferente de nulo, sera impresso as lojas criadas com o metodo tostring criada na classe Loja.
                System.out.println(l.toString());
            }
        }
    }
}
