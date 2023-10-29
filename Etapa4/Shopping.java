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

import javax.sound.midi.MidiDevice.Info;

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
        int qtdLojas = 0;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null) {
                qtdLojas++;
            }
        }
        return qtdLojas;
    }
    
    @Override
    public String toString(){
        return "Shopping{"+
                "nome = " +nome +
                ", endereço = "+ endereco +
                ", qtd lojdas = " + lojas +
                '}';    
    }

    public boolean insereLoja(Loja novaLoja){
        for(int i=0; i < lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = novaLoja;
                return true; 
            }
        }
        return false;
    }
    
    public boolean removeLoja(String removeLoja){ //remove a loja buscando pelo nome dela;
        for(int i=0; i < lojas.length; i++){
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(removeLoja)){
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
    
        // Normaliza o tipoLoja para garantir consistência
        tipoLoja = normalizar(tipoLoja);
    
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i] instanceof Loja) {
                if (lojas[i] instanceof Bijuteria) {
                    if (((Bijuteria) lojas[i]).getTipoLoja().equalsIgnoreCase(tipoLoja)) {
                        total++;
                    }
                }
                if (lojas[i] instanceof Informatica) {
                    if (((Informatica) lojas[i]).getTipoLoja().equalsIgnoreCase(tipoLoja)) {
                        total++;
                    }
                }
                
            }
        }
        return total;
    } 

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double valorMaisCaro = 0.0;

        for (int i =0; i < lojas.length; i++){
            if (lojas[i] instanceof Informatica) {
                Informatica informatica = (Informatica) lojas[i];
                if(informatica.getSeguroEletronicos() > valorMaisCaro){
                    valorMaisCaro = informatica.getSeguroEletronicos();
                    lojaMaisCara = informatica;
                }
                
            }
        }

        return lojaMaisCara;
    }
    
}
