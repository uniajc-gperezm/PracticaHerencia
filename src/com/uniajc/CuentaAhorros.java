/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniajc;

/**
 *
 * @author g.perezmoreno
 */
public class CuentaAhorros extends Cuenta {
    
    protected boolean activa;
    
    private final float MONTO_MINIMO = 10000;
    private final float COSTO_COMISION_MENSUAL = 1000;
    
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        isActive();
    }
    
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        }
    }
    
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
    }
    
    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual = (numeroRetiros - 4) * COSTO_COMISION_MENSUAL;
        }
        super.extractoMensual();
        isActive();
        
    }
    
    public void imprimir() {
        System.out.println("saldo: " + saldo);
        System.out.println("COMISION MENSUAL: " + comisionMensual);
        System.out.println("Numero DE TRANSACIONES: " + (numeroConsignaciones + numeroRetiros));
    }
    
    public void isActive() {
        if (saldo < MONTO_MINIMO) {
            activa = false;
        } else {
            activa = true;
        }
    }
}
