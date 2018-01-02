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
 class Agencia {
    private List <Imovel> carteiraImoveis;
    private int valorEstimadoTotal;

    Agencia() {
        this.carteiraImoveis = new ArrayList<>();
    }
    
    
    void mostraImoveis(){
        for(Imovel imovelActual:carteiraImoveis){
            System.out.println(imovelActual.toString());
        }
        
   }
    
    void mostrarImoveisLocalidade(String localidade){
         for(Imovel imovelActual:carteiraImoveis){
             if(imovelActual.localidade.equals(localidade)){
                System.out.println(imovelActual.toString());
             }
        }
    
    }

    void addImovel(Imovel imovel) {
            carteiraImoveis.add(imovel);
    
    }
    
    int  calculoValorEstimadoTotal(){
         
        valorEstimadoTotal = carteiraImoveis.stream().map((imovelActual) ->
                imovelActual.calcularValorEstimado()).reduce(valorEstimadoTotal, Integer::sum);
        return valorEstimadoTotal;
    }
    
    void mostraValorestimadoTotal(){
        System.out.println("Valor total estimado da carteira:  "+valorEstimadoTotal);
    }
}
