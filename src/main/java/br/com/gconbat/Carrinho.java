package br.com.gconbat;

import java.util.ArrayList;

public class Carrinho {
    private double preco;
    private ArrayList<Item> items;


    public Carrinho(){
        this.preco = 0;
        this.items = new ArrayList<>();
    }

    public void adicionar(Item item, int quantidade) {
        items.add(item);

        preco += item.getPreco()*quantidade;
        item.setQuantidade(item.getQuantidade()-quantidade);

        System.out.println("Descrição: "+item.getNome()+", Quantidade:"+quantidade+", Valor Unitário:R$"+item.getPreco()+", Total:R$"+item.getPreco()*quantidade);
    }

    public void remover(Item item, int quantidade) {
        items.remove(item);

        preco -= item.getPreco()*quantidade;
        item.setQuantidade(item.getQuantidade()+quantidade);
    }

    public void mostrarPreco() {
        System.out.println("Valor a pagar: R$" +preco);
    }

}
