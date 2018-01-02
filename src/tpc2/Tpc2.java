/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc2;

/**
 *
 * @author Jeje
 */
public class Tpc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Agencia agencia= new Agencia();
        
        //objectos imoveis*********************************************
        Imovel a1= new Apartamento(5, 3, 2, 'A', 0, 25, 15, 50000, 1,
                "Juliet Ferrao", "Lisboa", "Portugal");
        
        Imovel m1= new Moradia(2, 2, 2, 1, 30, 20, 30000, 2, "Araujo", "Porto",
                "Portugal");
        
        Imovel l1= new Loja(3, 50, 50, 33000, 4, "Spallalandia", "Maputo", "Mocambique");
        
        Imovel l2= new Loja(4, 60, 51, 45000, 3, "Cavalos", "Maputo", "Mocambique");
        
        
        
        agencia.addImovel(m1);
        agencia.addImovel(a1);
        agencia.addImovel(l1);
        agencia.addImovel(l2);
        
        
        //Proprietarios******************************************************************
        Proprietario p1= new Proprietario(0, 844832967, "Stelio", "Simbine");
        Proprietario p2= new Proprietario(0, 965745028, "Spallanzani", "III");
        
        //asasociaca proprietario imovel-*------------------------------------------
        
        p1.adquirirImovel(m1);
        p1.adquirirImovel(l1);
        
        p2.adquirirImovel(a1);
        p2.adquirirImovel(l2);
        
        //chamada das funcoes
        agencia.mostraImoveis();
        agencia.mostrarImoveisLocalidade("Maputo");
        agencia.calculoValorEstimadoTotal();
        agencia.mostraValorestimadoTotal();
        
        
    }
    
}
