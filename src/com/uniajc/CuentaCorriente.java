/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniajc;

/**
 *
 * @author g.perezmoreno
 */
public class CuentaCorriente extends Cuenta {
    
    protected float sobregiro;
    
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro = 0;
    }
    
    public void retirar (float cantidad) {
        float saldoTemporal = saldo - cantidad;
        
        if (saldoTemporal < 0) {
            sobregiro = sobregiro - saldoTemporal;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }
    
    public void consignar(float cantidad){
        // sobregiro = 2000
        float sobregiroTemporal = sobregiro - cantidad;
        //sobregiroTemporal = -3000
        
        if (sobregiro > 0) {
            if (sobregiroTemporal > 0) {
                sobregiro = sobregiroTemporal;
            }else {
                saldo = saldo - sobregiroTemporal;
                sobregiro = 0;
            }
        } else {
            super.consignar(cantidad);
        }
    }
    
    public void extractoMensual() {
        super.extractoMensual();
    }
    
    public void imprimir() {
        System.out.println("saldo: " + saldo);
        System.out.println("COMISION MENSUAL: " + comisionMensual);
        System.out.println("Numero DE TRANSACIONES: " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Sobregiro: " + sobregiro);
    }

}
