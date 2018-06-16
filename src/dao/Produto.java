package dao;
// Generated Jun 16, 2018 2:52:34 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Produto generated by hbm2java
 */
public class Produto  implements java.io.Serializable {


     private long codbarras;
     private Cor cor;
     private Marca marca;
     private Tamanho tamanho;
     private Tipoproduto tipoproduto;
     private String descricao;
     private double precocompra;
     private double precovenda;
     private char genero;
     private Set<Produtovenda> produtovendas = new HashSet<Produtovenda>(0);
     private Set<Produtoloja> produtolojas = new HashSet<Produtoloja>(0);
     private Set<Produtoentrega> produtoentregas = new HashSet<Produtoentrega>(0);
     private Set<Caixa> caixas = new HashSet<Caixa>(0);

    public Produto() {
    }

	
    public Produto(long codbarras, Cor cor, Marca marca, Tamanho tamanho, Tipoproduto tipoproduto, String descricao, double precocompra, double precovenda, char genero) {
        this.codbarras = codbarras;
        this.cor = cor;
        this.marca = marca;
        this.tamanho = tamanho;
        this.tipoproduto = tipoproduto;
        this.descricao = descricao;
        this.precocompra = precocompra;
        this.precovenda = precovenda;
        this.genero = genero;
    }
    public Produto(long codbarras, Cor cor, Marca marca, Tamanho tamanho, Tipoproduto tipoproduto, String descricao, double precocompra, double precovenda, char genero, Set<Produtovenda> produtovendas, Set<Produtoloja> produtolojas, Set<Produtoentrega> produtoentregas, Set<Caixa> caixas) {
       this.codbarras = codbarras;
       this.cor = cor;
       this.marca = marca;
       this.tamanho = tamanho;
       this.tipoproduto = tipoproduto;
       this.descricao = descricao;
       this.precocompra = precocompra;
       this.precovenda = precovenda;
       this.genero = genero;
       this.produtovendas = produtovendas;
       this.produtolojas = produtolojas;
       this.produtoentregas = produtoentregas;
       this.caixas = caixas;
    }
   
    public long getCodbarras() {
        return this.codbarras;
    }
    
    public void setCodbarras(long codbarras) {
        this.codbarras = codbarras;
    }
    public Cor getCor() {
        return this.cor;
    }
    
    public void setCor(Cor cor) {
        this.cor = cor;
    }
    public Marca getMarca() {
        return this.marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Tamanho getTamanho() {
        return this.tamanho;
    }
    
    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
    public Tipoproduto getTipoproduto() {
        return this.tipoproduto;
    }
    
    public void setTipoproduto(Tipoproduto tipoproduto) {
        this.tipoproduto = tipoproduto;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPrecocompra() {
        return this.precocompra;
    }
    
    public void setPrecocompra(double precocompra) {
        this.precocompra = precocompra;
    }
    public double getPrecovenda() {
        return this.precovenda;
    }
    
    public void setPrecovenda(double precovenda) {
        this.precovenda = precovenda;
    }
    public char getGenero() {
        return this.genero;
    }
    
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public Set<Produtovenda> getProdutovendas() {
        return this.produtovendas;
    }
    
    public void setProdutovendas(Set<Produtovenda> produtovendas) {
        this.produtovendas = produtovendas;
    }
    public Set<Produtoloja> getProdutolojas() {
        return this.produtolojas;
    }
    
    public void setProdutolojas(Set<Produtoloja> produtolojas) {
        this.produtolojas = produtolojas;
    }
    public Set<Produtoentrega> getProdutoentregas() {
        return this.produtoentregas;
    }
    
    public void setProdutoentregas(Set<Produtoentrega> produtoentregas) {
        this.produtoentregas = produtoentregas;
    }
    public Set<Caixa> getCaixas() {
        return this.caixas;
    }
    
    public void setCaixas(Set<Caixa> caixas) {
        this.caixas = caixas;
    }




}


