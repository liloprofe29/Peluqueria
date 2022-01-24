/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prypeluqueria;

import javax.swing.JOptionPane;

/**
 *
 * @author Liliana
 */
public class PryPeluqueria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomPersona = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String servicio = JOptionPane.showInputDialog("Ingrese el tipo de servicio solicitado:"
                + "(keratina/corte/peinado/tintura");
        Servicio serv1 = new Servicio(nomPersona, servicio);
        //Método que valida costo
        serv1.validarCostoServicio();
        JOptionPane.showMessageDialog(null, serv1.mostrarServicio());
    }
    
}
