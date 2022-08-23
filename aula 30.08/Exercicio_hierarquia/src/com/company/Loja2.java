package com.company;
package java.io.InputStreamReader;

public class Loja2 {
    private int qtd;
    private String produto;
    private int preco;

    public int getPreco(){
        return preco;
    }
    public String getProduto(){
        return produto;
    }
    public int getQuantidade(){
        return qtd;
    }
    public void setPreco(int preco){
        this.preco = preco;
    }
    public void setProduto(String produto){
        this.produto= produto;
    }
    public void setQuantidade(int qtd){
        this.qtd= qtd;
    }
}
}
