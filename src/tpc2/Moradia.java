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
public class Moradia extends  Imovel{
    
    private int numeroQuartos, numeroWC, numeroAndares;

    public Moradia(int numeroQuartos, int numeroWC, int numeroAndares, int id,
            int areaTotal, int areaUtil, int valorPretendido, int numeroPorta,
            String rua, String localidade, String pais) {
        super(id, areaTotal, areaUtil, valorPretendido, numeroPorta, rua,
                localidade, pais);
        this.numeroQuartos = numeroQuartos;
        this.numeroWC = numeroWC;
        this.numeroAndares = numeroAndares;
        valorEstimado=calcularValorEstimado();
    }

    Moradia() {
    }

   

    

    
    
    

    
    
   

   
    
    

    @Override
    public String toString() {
       String output="Moradia "+
       "id: "+id+"\n"+
       "Area Total: "+areaTotal+"\n"+
       "Area util: "+areaUtil+"\n"+
       "Valor Pretendido: "+valorPretendido+"\n"+
       numeroAndares+" andares"+
       numeroQuartos+"Quartos, "+numeroWC+"WC \n"+
       "Morada: "+rua+", "+numeroPorta+" "+localidade+" "+pais+"\n"+ 
       "Proprietario: "+proprietario.toString()+"\n"+
       "-------------------------------------------------------------\n";
     
     return output;
    }

    @Override
    int calcularValorEstimado() {
        calcularPPMQ();
        return areaUtil*ppmq+numeroAndares*250;
    }
    
    
    
}
