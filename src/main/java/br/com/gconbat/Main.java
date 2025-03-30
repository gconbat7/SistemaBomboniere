package br.com.gconbat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Lacta", 1, 100, 9.90, Categoria.CHOCOLATES);
        Item item2 = new Item("Oreo", 2, 50,10.00 , Categoria.BISCOITOS);
        Item item3 = new Item("Trident", 3, 70, 12.00, Categoria.CHICLETES);
        Item item4 = new Item("Paçoca", 4, 60, 2.00, Categoria.DOCES);
        Item item5 = new Item("Doritos", 5, 88, 13.00, Categoria.SALGADINHOS);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionar(item1, 7);
        carrinho.adicionar(item3, 7);

        carrinho.mostrarPreco();
    }
}