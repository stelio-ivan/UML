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
public class Loja extends Imovel {

    public Loja(int id, int areaTotal, int areaUtil, int valorPretendido, 
            int numeroPorta, String rua, String localidade, String pais) {
        
        super(id, areaTotal, areaUtil, valorPretendido, numeroPorta, rua,
                localidade, pais);
        
        valorEstimado=calcularValorEstimado();
    }

    Loja() {
    }

    

    
    
    @Override
    public String toString() {
         String output= "Loja\n"+
        "id: "+id+"\n"+
       "Area Total: "+areaTotal+"\n"+
       "Area util: "+areaUtil+"\n"+
       "Valor Pretendido: "+valorPretendido+"\n"+
       "Morada:"+rua+", "+numeroPorta+", "+localidade+" "+pais+"\n"+
       "Proprietario: "+proprietario.toString()+"\n"+
        "\n----------------------------------------------------------------";
      
     
     return output;
    }

    @Override
    int calcularValorEstimado() {
        calcularPPMQ();
      return  areaTotal*ppmq;
    }
    
}
