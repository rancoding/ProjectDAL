package dao;
// Generated Jun 16, 2018 2:52:34 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Armazem generated by hbm2java
 */
public class Armazem  implements java.io.Serializable {


     private int idarmazem;
     private Localidade localidade;
     private String nome;
     private Set<Entrega> entregas = new HashSet<Entrega>(0);
     private Set<Caixa> caixas = new HashSet<Caixa>(0);

    public Armazem() {
    }

	
    public Armazem(int idarmazem, Localidade localidade, String nome) {
        this.idarmazem = idarmazem;
        this.localidade = localidade;
        this.nome = nome;
    }
    public Armazem(int idarmazem, Localidade localidade, String nome, Set<Entrega> entregas, Set<Caixa> caixas) {
       this.idarmazem = idarmazem;
       this.localidade = localidade;
       this.nome = nome;
       this.entregas = entregas;
       this.caixas = caixas;
    }
   
    public int getIdarmazem() {
        return this.idarmazem;
    }
    
    public void setIdarmazem(int idarmazem) {
        this.idarmazem = idarmazem;
    }
    public Localidade getLocalidade() {
        return this.localidade;
    }
    
    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Entrega> getEntregas() {
        return this.entregas;
    }
    
    public void setEntregas(Set<Entrega> entregas) {
        this.entregas = entregas;
    }
    public Set<Caixa> getCaixas() {
        return this.caixas;
    }
    
    public void setCaixas(Set<Caixa> caixas) {
        this.caixas = caixas;
    }




}


