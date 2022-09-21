/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NevesRibeiro
 */
public class Poupanca  extends Conta{

    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        
        System.out.println("===Extrato de Conta Poupança ====");
        super.imprimirExtrato();
        
    }
    
    }

  
   

