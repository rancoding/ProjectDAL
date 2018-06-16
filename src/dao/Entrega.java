package dao;
// Generated Jun 16, 2018 2:52:34 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Entrega generated by hbm2java
 */
public class Entrega  implements java.io.Serializable {


     private int identrega;
     private Armazem armazem;
     private Funcionario funcionarioByIdfuncionarioentrega;
     private Funcionario funcionarioByIdfuncionariorecebe;
     private Loja loja;
     private Date dataenvio;
     private Date dataentrega;
     private boolean confirmado;
     private Set<Produtoentrega> produtoentregas = new HashSet<Produtoentrega>(0);

    public Entrega() {
    }

	
    public Entrega(int identrega, Armazem armazem, Funcionario funcionarioByIdfuncionarioentrega, Funcionario funcionarioByIdfuncionariorecebe, Loja loja, Date dataenvio, Date dataentrega, boolean confirmado) {
        this.identrega = identrega;
        this.armazem = armazem;
        this.funcionarioByIdfuncionarioentrega = funcionarioByIdfuncionarioentrega;
        this.funcionarioByIdfuncionariorecebe = funcionarioByIdfuncionariorecebe;
        this.loja = loja;
        this.dataenvio = dataenvio;
        this.dataentrega = dataentrega;
        this.confirmado = confirmado;
    }
    public Entrega(int identrega, Armazem armazem, Funcionario funcionarioByIdfuncionarioentrega, Funcionario funcionarioByIdfuncionariorecebe, Loja loja, Date dataenvio, Date dataentrega, boolean confirmado, Set<Produtoentrega> produtoentregas) {
       this.identrega = identrega;
       this.armazem = armazem;
       this.funcionarioByIdfuncionarioentrega = funcionarioByIdfuncionarioentrega;
       this.funcionarioByIdfuncionariorecebe = funcionarioByIdfuncionariorecebe;
       this.loja = loja;
       this.dataenvio = dataenvio;
       this.dataentrega = dataentrega;
       this.confirmado = confirmado;
       this.produtoentregas = produtoentregas;
    }
   
    public int getIdentrega() {
        return this.identrega;
    }
    
    public void setIdentrega(int identrega) {
        this.identrega = identrega;
    }
    public Armazem getArmazem() {
        return this.armazem;
    }
    
    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }
    public Funcionario getFuncionarioByIdfuncionarioentrega() {
        return this.funcionarioByIdfuncionarioentrega;
    }
    
    public void setFuncionarioByIdfuncionarioentrega(Funcionario funcionarioByIdfuncionarioentrega) {
        this.funcionarioByIdfuncionarioentrega = funcionarioByIdfuncionarioentrega;
    }
    public Funcionario getFuncionarioByIdfuncionariorecebe() {
        return this.funcionarioByIdfuncionariorecebe;
    }
    
    public void setFuncionarioByIdfuncionariorecebe(Funcionario funcionarioByIdfuncionariorecebe) {
        this.funcionarioByIdfuncionariorecebe = funcionarioByIdfuncionariorecebe;
    }
    public Loja getLoja() {
        return this.loja;
    }
    
    public void setLoja(Loja loja) {
        this.loja = loja;
    }
    public Date getDataenvio() {
        return this.dataenvio;
    }
    
    public void setDataenvio(Date dataenvio) {
        this.dataenvio = dataenvio;
    }
    public Date getDataentrega() {
        return this.dataentrega;
    }
    
    public void setDataentrega(Date dataentrega) {
        this.dataentrega = dataentrega;
    }
    public boolean isConfirmado() {
        return this.confirmado;
    }
    
    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }
    public Set<Produtoentrega> getProdutoentregas() {
        return this.produtoentregas;
    }
    
    public void setProdutoentregas(Set<Produtoentrega> produtoentregas) {
        this.produtoentregas = produtoentregas;
    }




}

