package br.ufpb.dcx.agenda;

import java.io.Serializable;

public class Contato implements Serializable {
    private String nome;
    private int diaAniversario;
    private int mesAniversario;
    public Contato(String nome, int dia, int mes){
        this.nome = nome;
        this.diaAniversario = dia;
        this.mesAniversario = mes;
    }


    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public int getMesAniversario() {
        return mesAniversario;
    }

    public void setMesAniversario(int mesAniversario) {
        this.mesAniversario = mesAniversario;
    }

    public String toString(){
        return this.nome+":"+this.diaAniversario+"/"+this.mesAniversario;
    }
}
