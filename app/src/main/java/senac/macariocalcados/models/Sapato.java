package senac.macariocalcados.models;

import java.util.List;

public class Sapato {
    private String codigo;
    private String nome;
    private double valor;
    private List<String> urlImagem;
    private Genero genero;
    private Idade idade;
    private Tipo tipo;
    private int tamanho;

    public Sapato(String ean, Genero genero) {
        this.codigo = ean;
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public List<String> getUrlImagem() {
        return urlImagem;
    }

    public Genero getGenero() {
        return genero;
    }

    public Idade getIdade() {
        return idade;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setUrlImagem(List<String> urlImagem) {
        this.urlImagem = urlImagem;
    }

    public void setIdade(Idade idade) {
        this.idade = idade;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean setTamanho(int tamanho) {
        String Tam = String.valueOf(tamanho);
        try {
            if(genero.equals(Genero.FEMININO)){
                this.tamanho = Integer.parseInt(TamFeminino.valueOf(Tam).toString());
            }
            if(genero.equals(Genero.MASCULINO)){
                this.tamanho = Integer.parseInt(TamMasculino.valueOf(Tam).toString());
            }
            return true;
        }
        catch (IllegalArgumentException ex) {
            return false;
        }
    }
}
