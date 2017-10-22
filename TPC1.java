/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpc1;

/**
 *
 * @author Jeje
 */
import com.sun.jmx.snmp.internal.SnmpSecuritySubSystem;
import java.util.*;
//implementecao da classe cliente. exercicio1
class Cliente{
    //atributos da classe cliente
String nome, apelido;
Morada morada;
int numeroDeCliente;
long nif;
List <Automovel> automoveis= new ArrayList<>();

//funcao para comprar um automovel e adicionar ao cliente
void compraAutomovel(Automovel automovel){
boolean temMenosDe5carros=tem5Carros();
if(temMenosDe5carros==true){
    automoveis.add(automovel);
}else{
bloquearCompra();
}
automovel.vender();

}

//funcao que verifica se o cliente ja tem ou nao 5 carros associados
boolean tem5Carros(){
return (automoveis.size()<5);
}

//funcao que impede a compra de automovel por parte de um cliente que ja atingiu o limite de 5 carros
void bloquearCompra(){
System.out.println("O cliente nao pode adquirir mais carros, porque ja tem 5");
}

//funcao que apresenta os dados do cliente
public String toString(){
String dados= "nome completo: "+nome+" "+apelido+"\n Morada:"+morada+"\n nif"+
        nif+"\n numero do cliente:"+numeroDeCliente;
return dados;
      
}
//construtor com argumentos da classe cliente
    public Cliente(String nome, String apelido, Morada morada, int numeroDeCliente,  long nif) {
        this.nome = nome;
        this.apelido = apelido;
        this.morada = morada;
        this.numeroDeCliente = numeroDeCliente;
        
        this.nif = nif;
    }
    
    //funcao que verifica se certo cliente é ou nao frequente
boolean eClienteFrequente(){
return (automoveis.size()>3);
}

}

//implementacao do tipo de dado complexo Morada
class Morada{
    // atributos da Morada
String rua, cidade, localidade, pais;
int codigoPostal;

//funcao que escreve os dados da Morada
@Override
public String toString(){
    String dados= "rua: "+rua+", "+localidade+", "
            +pais+","+codigoPostal;
        return dados;
      
}
//contrutor com argumentos do tipo Morada
    public Morada(String rua, String cidade, String localidade, String pais, int codigoPostal) {
        this.rua = rua;
        this.cidade = cidade;
        this.localidade = localidade;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
    }


}

//implementacao da classe Automovel
class Automovel{
    //atributos do automovel
String marca, modelo, matricula;
int cilindrada;
Data dataDeVenda;
boolean disponibilidade= true;

/*funcao que permite associar um carro a apenas um cliente, caso o caro ja tenha
/sido vendido para outro cliente, o carro estara indisponivel para a venda*/
public void vender(){
if(disponibilidade){
    disponibilidade=false;
}else{
System.out.println("carro indisponivel, ja vendido");
}

}

//funcao que permite escrever os dados do cliente
public String toString(){
    String d="sim";
    if (disponibilidade==false)
        d="nao";
    
String dados= marca+" "+modelo+"\ncilindrada: "+cilindrada+"\ndisponibilidade:"+d;
 return dados;       
}

//construtor com argumentos da classe cliente
    public Automovel(String marca, String modelo, String matricula, int cilindrada, Data dataDeVenda) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.dataDeVenda = dataDeVenda;
    }
    //construtor sem argummentos da classe cliente
public Automovel(){
};
    

}
//tipo complexo data
class Data{
int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data() {
    }
  
}
public class TPC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //objectos automoveis
        Automovel a1= new Automovel("mercedez", "benz", "11-aa", 1000, null);
        a1.dataDeVenda=new Data(01, 12, 2014);
        
        Automovel a2= new Automovel("kia", "Sorrento", "21-aa", 1001, null);
        a2.dataDeVenda=new Data(31, 02, 2004);
        
        Automovel a3= new Automovel("Ferrari", "Spider", "33-aa", 9000, null);
        a3.dataDeVenda=new Data(14, 02, 2017);
        
        Automovel a4= new Automovel("Toyota", "Prado", "43-aa", 9500, null);
        a3.dataDeVenda=new Data(14, 02, 2017);
        
        Automovel a5= new Automovel("Toyota", "Supra", "34-aa", 8000, null);
        a3.dataDeVenda=new Data(12, 12, 2011);
        //*********************************************************************************************
        
        //objectos clientes
        Cliente c1= new Cliente("Abdull", "Ramal", null, 01, 1254789354);
        c1.morada= new Morada("araujo", "Maputo", "Kampfumo", "Mocambique", 126547);
        
        Cliente c2= new Cliente("Stelio", "Simbine", null, 02, 1254479354);
        c2.morada= new Morada("dos cavalos", "Maputo", "Kampfumo", "Mocambique", 124154547);
        
        //chamada da funcao para associacao de automoveis aos clientes
        c1.compraAutomovel(a3);
        c2.compraAutomovel(a2);
        c2.compraAutomovel(a1);
        c2.compraAutomovel(a5);
        c2.compraAutomovel(a4);
        
        //chamadas de funoes para testar o metodo toString
       System.out.println(c1.toString());
       System.out.println("\n"+c2.toString());
       System.out.println("\n"+a1.toString());
       System.out.println("\n"+a2.toString());
       System.out.println("\n"+a3.toString());
       
        //chamada da funcao que retorna se o cliente e ou nao frequente
       System.out.println("\n Cliente1 Frequente?:"+c1.eClienteFrequente());
       
       System.out.println("Cliente2 Frequente?: "+c2.eClienteFrequente());
       
    }
    
}
