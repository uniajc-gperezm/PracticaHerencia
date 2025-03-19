/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uniajc;

/**
 *
 * @author g.perezmoreno
 */
public class PracticaHerenciaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Cuenta de Ahorros: ");
        
        final float SALDO = 15000;
        final float TASA_ANUAL = 0.10f;
        
        CuentaAhorros cuentaAhorros1 = new CuentaAhorros(SALDO, TASA_ANUAL);
        
        System.out.println("");
        
        cuentaAhorros1.imprimir();
        
        System.out.println("");
        
        cuentaAhorros1.consignar(5000);
        cuentaAhorros1.consignar(2000);
        cuentaAhorros1.consignar(3000);
        cuentaAhorros1.consignar(1000);
        cuentaAhorros1.imprimir();
        
        System.out.println("");
        
        System.out.println();
        // retirar valor de 2000
        cuentaAhorros1.retirar(2000); // 24000
        cuentaAhorros1.retirar(1000); // 23000
        cuentaAhorros1.retirar(100); // 22900
        cuentaAhorros1.retirar(200); // 22700
        cuentaAhorros1.retirar(500); // 22200
        cuentaAhorros1.retirar(500); // 21700
        cuentaAhorros1.retirar(10000); // 11700
     
        cuentaAhorros1.imprimir();
        
    }
    
}
