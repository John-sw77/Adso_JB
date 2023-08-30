/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.sena.gestoring;

import co.edu.sena.gestoring.Modelo.Contolador.Conexion;
import co.edu.sena.gestoring.Modelo.Vista.Control_Pantalla;

/**
 *
 * @author John Bojacá
 */
public class GestorIng {

    public static void main(String[] args) {
        
        Conexion.conectar();
                
        Control_Pantalla.AbrirVista_Solicitud();        
  



        
    }
}
