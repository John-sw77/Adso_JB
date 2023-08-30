/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.gestoring.Modelo.Vista;

/**
 *
 * @author John Bojacá
 */
public class Control_Pantalla {
    private static Vista_Solicitud PantallaSolicitud;
    
    public static void AbrirVista_Solicitud (){
        
            PantallaSolicitud= new Vista_Solicitud();
            PantallaSolicitud.setVisible (true);
            PantallaSolicitud.setLocationRelativeTo(null);
    
    }
    
    public static void CerrarVista_Solicitud (){
        
        PantallaSolicitud.setVisible (false);
        PantallaSolicitud= null;
        
        
    
    
    }
    
}
