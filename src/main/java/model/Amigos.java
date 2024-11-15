package model;

import dao.AmigoDAO;
import java.util.ArrayList;

public class Amigos {

    // Atributos da classe Amigos
    private int id; // Id único do amigo
    private String nome; // Nome do amigo
    private String telefone; // Telefone do amigo
    private AmigoDAO dao;

    // Construtor sem parâmetros, inicia com valores padrão
    public Amigos() {
        this(0, "", "");
    }

    // Construtor com parâmetros, permite criar objetos com valores específicos
    public Amigos(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    // getters e setters pra acessar/modificar atributos
    // retorna o ID do amigo
    public int getId() {
        return id;
    }

    // define o ID do amigo
    public void setId(int id) {
        this.id = id;
    }

    // retorna o nome do amigo
    public String getNome() {
        return nome;
    }

    // define o nome do amigo
    public void setNome(String nome) {
        this.nome = nome;
    }

    // retorna o telefone do amigo
    public String getTelefone() {
        return telefone;
    }

    // define o telefone do amigo
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Amigos> getAmigos() {
        return dao.getAmigos();
    }

    public boolean insertAmigoBD(String nome, String telefone) {
        int id = this.maiorID() + 1;
        Amigos objeto = new Amigos(id, nome, telefone);
        dao.insertAmigoBD(objeto);
        return true;
    }

    public boolean deleteAmigoBD(int id) {
        dao.deleteAmigoBD(id);
        return true;
    }

    public boolean updateAmigoBD(int id, String nome, String telefone) {
        Amigos objeto = new Amigos(id, nome, telefone);
        dao.updateAmigoBD(objeto);
        return true;
    }

    public Amigos carregaAmigo(int id) {
        return dao.carregaAmigo(id);
    }

    public int maiorID() {
        return dao.maiorID();
    }
}
