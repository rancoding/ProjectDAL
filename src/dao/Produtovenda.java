package dao;
// Generated Jun 16, 2018 2:52:34 PM by Hibernate Tools 4.3.1



/**
 * Produtovenda generated by hbm2java
 */
public class Produtovenda  implements java.io.Serializable {


     private ProdutovendaId id;
     private Produto produto;
     private Venda venda;
     private short quantidade;

    public Produtovenda() {
    }

    public Produtovenda(ProdutovendaId id, Produto produto, Venda venda, short quantidade) {
       this.id = id;
       this.produto = produto;
       this.venda = venda;
       this.quantidade = quantidade;
    }
   
    public ProdutovendaId getId() {
        return this.id;
    }
    
    public void setId(ProdutovendaId id) {
        this.id = id;
    }
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Venda getVenda() {
        return this.venda;
    }
    
    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    public short getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }




}


