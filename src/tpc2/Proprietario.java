/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeje
 */
public class Proprietario {
    private int id, contacto;
    private String nome, apelido;
    private List <Imovel> imoveisAdquiridos= new ArrayList<>();

    

    Proprietario(int id, int contacto, String nome, String apelido) {
        this.id = id;
        this.contacto = contacto;
        this.nome = nome;
        this.apelido = apelido;
    }

    
     
    
    
    void adquirirImovel(Imovel imovel){  
        imoveisAdquiridos.add(imovel);
        imovel.setProprietario(this);
        
    }

    @Override
    public String toString() {
        return "id:"+id+", "+nome+" "+apelido+" ,"+contacto;
    }
    
    
    
}
