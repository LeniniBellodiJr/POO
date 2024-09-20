package dominio;

import java.time.LocalDate;

public class Produto extends BaseParametro {

    private int codigoSubClasse;
    private Double valor;
    
    
    public int getCodigoSubClasse() {
        return codigoSubClasse;
    }
    public void setCodigoSubClasse(int codigoSubClasse) {
        this.codigoSubClasse = codigoSubClasse;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Produto() {
        super();
    }
    public Produto(int codigo, String descricao, LocalDate dataInclusao, int codigoSubClasse, Double valor) {
        super(codigo, descricao, dataInclusao);
        this.codigoSubClasse = codigoSubClasse;
        this.valor = valor;
    }
    

    

    
    
}
