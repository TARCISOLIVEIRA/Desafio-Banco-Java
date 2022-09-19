/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NevesRibeiro
 */
public class Poupanca  extends Conta{

    @Override
    public void imprimirExtrato() {
        
        System.out.println("===Extrato de Conta Poupança ====");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo:  %.2f", super.saldo));
        
    }
    
    }

  
   

