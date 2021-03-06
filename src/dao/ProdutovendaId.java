package dao;
// Generated Jun 16, 2018 2:52:34 PM by Hibernate Tools 4.3.1



/**
 * ProdutovendaId generated by hbm2java
 */
public class ProdutovendaId  implements java.io.Serializable {


     private long codbarras;
     private int idvenda;

    public ProdutovendaId() {
    }

    public ProdutovendaId(long codbarras, int idvenda) {
       this.codbarras = codbarras;
       this.idvenda = idvenda;
    }
   
    public long getCodbarras() {
        return this.codbarras;
    }
    
    public void setCodbarras(long codbarras) {
        this.codbarras = codbarras;
    }
    public int getIdvenda() {
        return this.idvenda;
    }
    
    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProdutovendaId) ) return false;
		 ProdutovendaId castOther = ( ProdutovendaId ) other; 
         
		 return (this.getCodbarras()==castOther.getCodbarras())
 && (this.getIdvenda()==castOther.getIdvenda());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getCodbarras();
         result = 37 * result + this.getIdvenda();
         return result;
   }   


}


