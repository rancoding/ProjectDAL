package dao;
// Generated Jun 16, 2018 2:52:34 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Pontosentrada generated by hbm2java
 */
public class Pontosentrada  implements java.io.Serializable {


     private BigDecimal identrada;
     private Pontohorario pontohorario;

    public Pontosentrada() {
    }

    public Pontosentrada(BigDecimal identrada, Pontohorario pontohorario) {
       this.identrada = identrada;
       this.pontohorario = pontohorario;
    }
   
    public BigDecimal getIdentrada() {
        return this.identrada;
    }
    
    public void setIdentrada(BigDecimal identrada) {
        this.identrada = identrada;
    }
    public Pontohorario getPontohorario() {
        return this.pontohorario;
    }
    
    public void setPontohorario(Pontohorario pontohorario) {
        this.pontohorario = pontohorario;
    }




}


