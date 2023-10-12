/*
 * Classe Data: esta classe possui os atributos dia, mes (sem acento) e ano, todos do tipo inteiro. Esta classe possui os 
 seguintes métodos:
 * Método Construtor: crie 1 construtor que um recebe parâmetros para inicializar todos os atributos. Neste construtor, 
 você deve validar a data informada nos parâmetros. Ou seja, o método construtor deve verificar se o dia é condizente 
 com o mês, levando em conta, também, o fato de o ano poder ser bissexto. Por exemplo, o dia 29 para o mês 2 só pode 
 ser atribuído em anos bissextos. Caso a data seja inválida, o método construtor deve imprimir uma mensagem de erro e 
 alterar a data para a seguinte data padrão: 1/1/2000.
 * Métodos de acesso: crie os métodos de acesso (getters e setters) para todos os atributos da classe.
 * Método toString: se necessário, pesquise sobre o método toString e implemente-o nesta classe, retornando uma 
 String que representa a data no formato dia/mês/ano.
 * Método verificaAnoBissexto: este método não recebe parâmetros e retorna verdadeiro caso o ano seja bissexto e falso caso contrário.
 */


package Etapa1;

public class Data {
    private int dia, mes, ano;


    public Data(int dia, int mes, int ano){
        if (ano < 0){
            System.out.println("Ano Invalido!");
        }
        if (mes < 1|| mes > 12){
            System.out.println("Mês Invalido");
        }
        if (dia < 1 || dia > (diaMes(mes, ano)) ){
            System.out.println("Dia Invalido");
        }
        
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    //Verifica a quantidade de dias do mes considerando ano bissexto

    private int diaMes(int mes, int ano){
        int dias;

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
        {
            dias = 30;
        } else if (mes == 2)
        {
            if(ano % 400 == 0 || (ano % 100 != 0 && ano % 4 == 0)){
                dias = 29;
            }else{
                dias = 28;
            }
        } else 
        {
            dias = 31;
        }
        return dias;
    }
    

    public boolean verificaAnoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true; // O ano é bissexto
        } else {
            return false; // O ano não é bissexto
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

}