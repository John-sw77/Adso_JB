/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.gestoring.Modelo;

/**
 *
 * @author John Bojacá
 */
public class Modelo_Solicitud {

// VARIABLES
// CONSTRUCTORS
// GET SET
// ToSTRING

//----------------------------*-------------------------------------------------
    
// VARIABLES

    
    private int Id_solicitud;
    private String Id_cliente;
    private String Id_gestion_s;
    private String Fecha;
    private String Contacto;
    private String Telefono;
    private String Correo;
    private String Orden_compra;
    private String Codigo_remision_cliente;
    private String Observacion;

// CONSTRUCTORES 

    public Modelo_Solicitud(int Id_solicitud, String Id_cliente, String Id_gestion_s, String Fecha, String Contacto, String Telefono, String Correo, String Orden_compra, String Codigo_remision_cliente, String Observacion) {
        this.Id_solicitud = Id_solicitud;
        this.Id_cliente = Id_cliente;
        this.Id_gestion_s = Id_gestion_s;
        this.Fecha = Fecha;
        this.Contacto = Contacto;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Orden_compra = Orden_compra;
        this.Codigo_remision_cliente = Codigo_remision_cliente;
        this.Observacion = Observacion;
    }

    public Modelo_Solicitud(String Contacto, String Telefono, String Correo, String Orden_compra, String Codigo_remision_cliente, String Observacion) {
        this.Contacto = Contacto;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Orden_compra = Orden_compra;
        this.Codigo_remision_cliente = Codigo_remision_cliente;
        this.Observacion = Observacion;
    }

    public Modelo_Solicitud(int Id_solicitud, String Contacto, String Telefono, String Correo, String Orden_compra, String Codigo_remision_cliente, String Observacion) {
        this.Id_solicitud = Id_solicitud;
        this.Contacto = Contacto;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Orden_compra = Orden_compra;
        this.Codigo_remision_cliente = Codigo_remision_cliente;
        this.Observacion = Observacion;
    }
    

    
// GET SET

    public int getId_solicitud() {
        return Id_solicitud;
    }

    public void setId_solicitud(int Id_solicitud) {
        this.Id_solicitud = Id_solicitud;
    }

    public String getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(String Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public String getId_gestion_s() {
        return Id_gestion_s;
    }

    public void setId_gestion_s(String Id_gestion_s) {
        this.Id_gestion_s = Id_gestion_s;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getOrden_compra() {
        return Orden_compra;
    }

    public void setOrden_compra(String Orden_compra) {
        this.Orden_compra = Orden_compra;
    }

    public String getCodigo_remision_cliente() {
        return Codigo_remision_cliente;
    }

    public void setCodigo_remision_cliente(String Codigo_remision_cliente) {
        this.Codigo_remision_cliente = Codigo_remision_cliente;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }



// ToSTRING

    @Override
    public String toString() {
        return "Modelo_Solicitud{" + "Id_solicitud=" + Id_solicitud + ", Id_cliente=" + Id_cliente + ", Id_gestion_s=" + Id_gestion_s + ", Fecha=" + Fecha + ", Contacto=" + Contacto + ", Telefono=" + Telefono + ", Correo=" + Correo + ", Orden_compra=" + Orden_compra + ", Codigo_remision_cliente=" + Codigo_remision_cliente + ", Observacion=" + Observacion + '}';
    }
    

    
    
    
    
    
    
}
