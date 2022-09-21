/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NevesRibeiro
 */
public class principal {
    
 public static void main(String[]arg){
     
     Cliente Tarciso = new Cliente ();
     Tarciso.setNome("Tarciso dos Santos");
     
     Conta cc = new ContaCorrente(Tarciso);
     Conta poupanca = new Poupanca(Tarciso);
     
     cc.depositar(100);
     
     cc.transferir(100, poupanca);
     
     cc.imprimirExtrato();
     poupanca.imprimirExtrato();
 }
       
            
           
      
}
