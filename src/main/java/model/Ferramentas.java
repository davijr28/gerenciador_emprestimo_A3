package model;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Ferramentas {

    private int id;
    private String nome;
    private String marca;
    private double preco;
    private FerramentaDAO dao;

    public Ferramentas() {
        this(0, "", "", 0);

    }

    public Ferramentas(int id, String nome, String marca, double preco) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.dao = new FerramentaDAO();
    }

    // getters e setters pra acessar/modificar atributos
    // retorna o ID da ferramenta
    public int getId() {
        return id;
    }

    // define o ID da ferramenta
    public void setId(int id) {
        this.id = id;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Ferramentas> getFerramentas() {
        return dao.getFerramentasLista();
    }

    public boolean insertFerramentaBD(String nome, String marca, double preco) {
        int id = this.maiorID() + 1;
        Ferramentas objeto = new Ferramentas(id, nome, marca, preco);
        dao.insertFerramentaBD(objeto);
        return true;
    }

    public boolean deleteFerramentaBD(int id) {
        dao.deleteFerramentaBD(id);
        return true;
    }

    public boolean updateFerramentaBD(int id, String nome, String marca, double preco) {
        Ferramentas objeto = new Ferramentas(id, nome, marca, preco);
        dao.updateFerramentaBD(objeto);
        return true;
    }

    public Ferramentas carregaFerramenta(int id) {
        return dao.carregaFerramenta(id);
    }

    public int maiorID() {
        return dao.maiorID();
    }
}
