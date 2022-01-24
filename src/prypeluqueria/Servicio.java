/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prypeluqueria;

/**
 *
 * @author Liliana
 */
public class Servicio {
   private String nomCliente;
   private String servicio;
   private int costo;
   
    public Servicio() {
    }

    public Servicio(String nomCliente, String servicio, int costo) {
        this.nomCliente = nomCliente;
        this.servicio = servicio;
        this.costo = costo;
    }

    public Servicio(String nomCliente, String servicio) {
        this.nomCliente = nomCliente;
        this.servicio = servicio;
    }

    

    public String getNomCliente() {
        return nomCliente;
    }

    public String getServicio() {
        return servicio;
    }

    public int getCosto() {
        return costo;
    }

    public void validarCostoServicio(){
       switch(servicio){
           case "corte": costo=12000;
                         break;
           case "tintura": costo = 32000;
                         break;
           case "keratina": costo = 120000;
                          break;
           default: costo = -1;
           
    }
        
    }
    
    public int validarCostoServicio1(){
       int cost;
        switch(servicio){
           case "corte": cost=12000;
                         break;
           case "tintura": cost = 32000;
                         break;
           case "keratina": cost = 120000;
                          break;
           default: cost = -1;
           
    }
     return cost;   
    }
    
    public String mostrarServicio(){
        return "Cliente: " + nomCliente + "\nServicio: " + servicio+
                "\ncosto: " + costo;
        
    }
   
    
   
}
