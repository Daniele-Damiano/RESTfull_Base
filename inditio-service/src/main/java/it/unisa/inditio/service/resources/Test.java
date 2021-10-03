/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.inditio.service.resources;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniele Damiano
 */
@XmlRootElement
public class Test {
    private String nome;
    private String cognome;

    public Test() {
    }
    
    

    public Test(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    
    
}
