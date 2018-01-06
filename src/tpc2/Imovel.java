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
abstract class Imovel {
   protected int id, areaTotal, areaUtil, valorPretendido, ppmq, valorEstimado,
            numeroPorta;
   
   protected String rua, localidade, pais;
   protected Proprietario proprietario;
   
   @Override
   public abstract String toString();
   
   abstract int calcularValorEstimado();

    protected Imovel(int id, int areaTotal, int areaUtil, int valorPretendido,
            int numeroPorta, String rua, String localidade, String pais) {
        this.id = id;
        this.areaTotal = areaTotal;
        this.areaUtil = areaUtil;
        this.valorPretendido = valorPretendido;        
        this.numeroPorta = numeroPorta;
        this.rua = rua;
        this.localidade = localidade;
        this.pais = pais;
        
    }

    

    
   
  protected void calcularPPMQ(){
       switch(localidade){
           case "Lisboa": ppmq=1000;
           break;
           case "Porto": ppmq=900;
           break;
           case "Faro": ppmq=900;
           break;
           default: ppmq=750;
           break;    
       
       }
   }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
   
   
   
   
}
