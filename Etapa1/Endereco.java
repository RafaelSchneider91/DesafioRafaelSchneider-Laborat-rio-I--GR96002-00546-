
/*
 * Classe Endereco: esta classe possui os atributos nomeDaRua, cidade, estado, pais (sem acento), 
 * cep (do tipo String), numero (sem acento e também do tipo String) e complemento (String). Esta classe possui os seguintes métodos:
 * Método Construtor: crie 1 construtor que um recebe parâmetros para inicializar todos os atributos.
 * Métodos de acesso: crie os métodos de acesso (getters e setters) para todos os atributos da classe.
 * Método toString: se necessário, pesquise sobre o método toString e implemente-o nesta classe, 
 * retornando uma String formatada da forma que você desejar, desde que contenha as informações de todos os atributos da classe.
 */

package Etapa1;

public class Endereco {
    private String nomeDaRua, cidade, estado, pais, Cep, numero, complemento;
    
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String Cep, String numero, String complemento)
    {
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.Cep = Cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public String getCep() {
        return Cep;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getNumero() {
        return numero;
    }
    public String getPais() {
        return pais;
    }
    public void setCep(String Cep) {
        this.Cep = Cep;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString(){
        return "Endereco{"+
                "nome da rua='"+ nomeDaRua +'\''+
                ", cidade =" + cidade + '\'' +
                ", numero ='" + estado +'\'' +
                ", numero ='" + pais +'\'' +
                ", numero ='" + Cep +'\'' +
                ", numero ='" + numero +'\'' +
                ", numero ='" + complemento +'\'' +
                '}';    
    }
}
