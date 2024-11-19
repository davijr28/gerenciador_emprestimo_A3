package model;

import dao.AmigoDAO;
import java.util.ArrayList;

public class Amigo {

    // Atributos da classe Amigo
    private int id; // Id único do amigo
    private String nome; // Nome do amigo
    private String telefone; // Telefone do amigo
    private AmigoDAO dao; // Objeto dao acessado pela classe amigo

    // Construtor sem parâmetros, inicia com valores padrão
    public Amigo() {
        this(0, "", "");
    }

    // Construtor com parâmetros, permite criar objetos com valores específicos
    public Amigo(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dao = new AmigoDAO();
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

    public ArrayList<Amigo> getAmigos() {
        return dao.getAmigosLista();
    }

    public boolean insertAmigoBD(String nome, String telefone) {
        int id = this.maiorID() + 1;
        Amigo objeto = new Amigo(id, nome, telefone);
        dao.insertAmigoBD(objeto);
        return true;
    }

    public boolean deleteAmigoBD(int id) {
        dao.deleteAmigoBD(id);
        return true;
    }

    public boolean updateAmigoBD(int id, String nome, String telefone) {
        Amigo objeto = new Amigo(id, nome, telefone);
        dao.updateAmigoBD(objeto);
        return true;
    }

    public Amigo carregaAmigo(int id) {
        return dao.carregaAmigo(id);
    }

    public int maiorID() {
        return dao.maiorID();
    }
}