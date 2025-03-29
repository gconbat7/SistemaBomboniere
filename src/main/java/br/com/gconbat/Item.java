package br.com.gconbat;

public class Item {
    // Atributos (nome, id, quantidade, preco, categoria)
    private String nome;
    private int id;
    private int quantidade;
    private double preco;
    private Categoria categoria;

    public Item() {
        this.nome = "";
        this.id = 0;
        this.quantidade = 0;
        this.preco = 0;
        this.categoria = null;
    }

    public Item(String nome) {
        this.nome = nome;
        this.id = 0;
        this.quantidade = 0;
        this.preco = 0;
        this.categoria = null;
    }

    public Item(String nome, int id, int quantidade, double preco, Categoria categoria) {
        this.nome = nome;
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
    }

}
