package model;

public class Restaurante {
    private int id;
    private String nome;
    private String endereco;
    private String tipoComida;
    private double avaliacao;

    // Construtor vazio
    public Restaurante() {
    }

    // Construtor com parâmetros
    public Restaurante(int id, String nome, String endereco, String tipoComida, double avaliacao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.tipoComida = tipoComida;
        this.avaliacao = avaliacao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    // Método toString para exibir as informações do restaurante
    @Override
    public String toString() {
        return "Restaurante{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", tipoComida='" + tipoComida + '\'' +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
