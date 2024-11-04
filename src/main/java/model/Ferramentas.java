package model;

public class Ferramentas {

    private String nome;
    private String marca;
    private double custo;
    private boolean emprestado;

    public Ferramentas() {
        this("", "", 0, false);

    }

    public Ferramentas(String nome, String marca, double custo, boolean emprestado) {
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.emprestado = emprestado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}