package model;


public class Amigos {

    private int id; //Identificador do Amigo
    private String nome; //Nome do Amigo
    private String telefone; //Telefone do Amigo
    //Operacao do banco de dados a fazer (Falta conectar netbeans com o respectivo banco de dados, e criar mais classes no package DAO)

    public Amigos() {
        this(0, "", "");
    }

    public Amigos(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public int getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
