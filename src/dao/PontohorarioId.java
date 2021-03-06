package dao;
// Generated Jun 16, 2018 2:52:34 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * PontohorarioId generated by hbm2java
 */
public class PontohorarioId  implements java.io.Serializable {


     private BigDecimal idpontohorario;
     private Date data;
     private BigDecimal idfuncionario;

    public PontohorarioId() {
    }

    public PontohorarioId(BigDecimal idpontohorario, Date data, BigDecimal idfuncionario) {
       this.idpontohorario = idpontohorario;
       this.data = data;
       this.idfuncionario = idfuncionario;
    }
   
    public BigDecimal getIdpontohorario() {
        return this.idpontohorario;
    }
    
    public void setIdpontohorario(BigDecimal idpontohorario) {
        this.idpontohorario = idpontohorario;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public BigDecimal getIdfuncionario() {
        return this.idfuncionario;
    }
    
    public void setIdfuncionario(BigDecimal idfuncionario) {
        this.idfuncionario = idfuncionario;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PontohorarioId) ) return false;
		 PontohorarioId castOther = ( PontohorarioId ) other; 
         
		 return ( (this.getIdpontohorario()==castOther.getIdpontohorario()) || ( this.getIdpontohorario()!=null && castOther.getIdpontohorario()!=null && this.getIdpontohorario().equals(castOther.getIdpontohorario()) ) )
 && ( (this.getData()==castOther.getData()) || ( this.getData()!=null && castOther.getData()!=null && this.getData().equals(castOther.getData()) ) )
 && ( (this.getIdfuncionario()==castOther.getIdfuncionario()) || ( this.getIdfuncionario()!=null && castOther.getIdfuncionario()!=null && this.getIdfuncionario().equals(castOther.getIdfuncionario()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdpontohorario() == null ? 0 : this.getIdpontohorario().hashCode() );
         result = 37 * result + ( getData() == null ? 0 : this.getData().hashCode() );
         result = 37 * result + ( getIdfuncionario() == null ? 0 : this.getIdfuncionario().hashCode() );
         return result;
   }   


}


