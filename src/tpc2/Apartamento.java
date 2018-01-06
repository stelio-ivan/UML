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
public class Apartamento  extends  Imovel{
    private int numeroQuartos, numeroWC, nrAndar;
    private char letra;

    

    public Apartamento(int numeroQuartos, int numeroWC, int nrAndar, char letra,
            int id, int areaTotal, int areaUtil, int valorPretendido,
            int numeroPorta, String rua, String localidade, String pais) {
        
        super(id, areaTotal, areaUtil, valorPretendido, numeroPorta, rua,
                localidade, pais);
        this.numeroQuartos = numeroQuartos;
        this.numeroWC = numeroWC;
        this.nrAndar = nrAndar;
        this.letra = letra;
        valorEstimado=calcularValorEstimado();
    }

    
   

    
    
            
    
    
    @Override
    public String toString() {
     String output= "Apartamento "+"id: "+id+"\n"+
       "Area Total: "+areaTotal+"\n"+
       "Area util: "+areaUtil+"\n"+
       "Valor Pretendido: "+valorPretendido+"\n"+
       "Morada: "+rua+", "+numeroPorta+", "+nrAndar+"andar, " +localidade+" "+pais+"\n"+
       numeroQuartos+" Quartos "+numeroWC+" WC \n"+
       "Proprietario: "+proprietario.toString()+"\n"+
       "----------------------------------------------------------------------\n";
     
     return output;
    }

    @Override
     int calcularValorEstimado() {
        calcularPPMQ();
      return  (numeroQuartos+numeroWC)*300+areaUtil*ppmq;
        
    }
}
