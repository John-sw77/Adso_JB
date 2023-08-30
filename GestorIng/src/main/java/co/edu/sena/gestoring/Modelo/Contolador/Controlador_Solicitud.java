/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.gestoring.Modelo.Contolador;
import co.edu.sena.gestoring.Modelo.Modelo_Solicitud;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author John Bojacá
 */
public class Controlador_Solicitud {

// REGISTRAR 
// EDITAR
// CONSULTAR    
// *1*
// *2*  
// PINTAR TABLA     
// ELIMINAR   
  

//----------------------------*-------------------------------------------------
            
 // REGISTRAR   
    public void RegistrarSolicitud(Modelo_Solicitud e){    
        try {
            
            Statement st = Conexion.getConect().createStatement();
            st.execute("INSERT INTO Solicitudes (Codigo_remision_cliente, Orden_compra, Contacto, Telefono, Correo, Observacion) VALUES ('"+e.getCodigo_remision_cliente()+"', '"+e.getOrden_compra()+"', '"+e.getContacto()+"', '"+e.getTelefono()+"', '"+e.getCorreo()+"', '"+e.getObservacion()+"')");
            JOptionPane.showMessageDialog(null, "Solicitud registrada");
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Solicitud.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
// EDITAR
    public void EditarSolicitud(Modelo_Solicitud e){
        
            try {
            
            Statement st = Conexion.getConect().createStatement();
            st.execute("UPDATE Solicitudes SET Codigo_remision_cliente = '"+e.getCodigo_remision_cliente()+"', Orden_compra = '"+e.getOrden_compra()+"', Contacto = '"+e.getContacto()+"', Telefono = '"+e.getTelefono()+"', Correo = '"+e.getCorreo()+"', Observacion = '"+e.getObservacion()+"' WHERE Id_solicitud = '"+e.getId_cliente()+"'");
            JOptionPane.showMessageDialog(null, "Actualizado");
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Solicitud.class.getName()).log(Level.SEVERE,null,ex);
        }          
        
    }    
    
// CONSULTAR    
// *1*
    public ResultSet ConsultarSolicitud(){
     ResultSet rs = null;
        try {
            
            Statement st=Conexion.getConect().createStatement();
            rs = st.executeQuery("SELECT * From Solicitudes");
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Solicitud.class.getName()).log(Level.SEVERE,null,ex);
        }
    
        return rs;
    }
// *2*  
    public ResultSet ConsultarSolicitud_Id(int Id_solicitud){
        
        ResultSet rs = null;
        try {
            
            Statement st=Conexion.getConect().createStatement();
            rs = st.executeQuery("SELECT * From Solicitudes WHERE Id_solicitud = '"+Id_solicitud+"'");
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Solicitud.class.getName()).log(Level.SEVERE,null,ex);
        }
    
        return rs;
    }
    
 // PINTAR TABLA   
    public void PintarTabla (JTable tabla, ResultSet rs){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Id_Solicitud");
        modelo.addColumn("Fecha");
        modelo.addColumn("Contacto");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Orden Compra");
        modelo.addColumn("Código Remisión");
        modelo.addColumn("Observacion");
        
        try {
            while (rs.next()) {
                String [] fila = {rs.getString("Id_solicitud"),rs.getString("Fecha"), rs.getString("Contacto"), rs.getString("Telefono"),rs.getString("Correo"), rs.getString("Orden_compra"), rs.getString("Codigo_remision_cliente"), rs.getString("Observacion")};
                modelo.addRow(fila);                           
            }
            tabla.setModel(modelo);
        } catch (Exception ex) {
            Logger.getLogger(Controlador_Solicitud.class.getName()).log(Level.SEVERE,null,ex);     
        }
        
    
    }    
    
// ELIMINAR   
    public void EliminarRecepcion(int Id_solicitud){
            try {
            
            Statement st=Conexion.getConect().createStatement();
            st.execute("DELETE FROM Solicitudes WHERE Id_solicitud = '"+Id_solicitud+"'");
            JOptionPane.showMessageDialog(null, "Solicitud eliminada");
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_Solicitud.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    

    
    
}
