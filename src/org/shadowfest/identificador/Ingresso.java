package org.shadowfest.identificador;
/*Cada ingresso vendido deverá gerar um código X que deverá ser associado a um cliente (nome, sexo e-mail), 
o Ingresso deve possuir valor e etc.
O sistema deverá possibilitar pontos por e-mail cada ingresso vale x pontos que 
poderá ser convertido em consumação*/
/**
 *
 * @author Lucas Sombra!
 */
public class Ingresso {
    private int codigo;
    private String festao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFesta(String festao) {
        this.festao = festao;
    }
    
 }