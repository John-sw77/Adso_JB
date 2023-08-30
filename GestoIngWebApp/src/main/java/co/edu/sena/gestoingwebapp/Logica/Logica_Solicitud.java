/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.gestoingwebapp.Logica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author John Bojacá
 */

@Entity
@Table (name = "Solicitudes")
public class Logica_Solicitud {
    
// VARIABLES
// CONSTRUCTORS
// GET SET
// ToSTRING

//----------------------------*-------------------------------------------------
    
// VARIABLES
  
    @Id
    @Column (name = "Id_solicitud")
    private int Id_solicitud;
    @Column (name = "Id_cliente")
    private String Id_cliente;
    @Column (name = "Id_gestion_s")
    private String Id_gestion_s;
    @Column (name = "Codigo_remision_cliente")
    private String Codigo_remision_cliente;
    @Column (name = "Fecha")
    private String Fecha;  
    @Column (name = "Orden_compra")
    private String Orden_compra;
    @Column (name = "Contacto")
    private String Contacto;
    @Column (name = "Telefono")
    private String Telefono;
    @Column (name = "Correo")
    private String Correo;
    @Column (name = "Observacion")
    private String Observacion;

// CONSTRUCTORES 

    public Logica_Solicitud() {
    }

    public Logica_Solicitud(int Id_solicitud, String Id_cliente, String Id_gestion_s, String Codigo_remision_cliente, String Fecha, String Orden_compra, String Contacto, String Telefono, String Correo, String Observacion) {
        this.Id_solicitud = Id_solicitud;
        this.Id_cliente = Id_cliente;
        this.Id_gestion_s = Id_gestion_s;
        this.Codigo_remision_cliente = Codigo_remision_cliente;
        this.Fecha = Fecha;
        this.Orden_compra = Orden_compra;
        this.Contacto = Contacto;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Observacion = Observacion;
    }

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

    public String getCodigo_remision_cliente() {
        return Codigo_remision_cliente;
    }

    public void setCodigo_remision_cliente(String Codigo_remision_cliente) {
        this.Codigo_remision_cliente = Codigo_remision_cliente;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getOrden_compra() {
        return Orden_compra;
    }

    public void setOrden_compra(String Orden_compra) {
        this.Orden_compra = Orden_compra;
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

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    @Override
    public String toString() {
        return "Logica_Solicitud{" + "Id_solicitud=" + Id_solicitud + ", Id_cliente=" + Id_cliente + ", Id_gestion_s=" + Id_gestion_s + ", Codigo_remision_cliente=" + Codigo_remision_cliente + ", Fecha=" + Fecha + ", Orden_compra=" + Orden_compra + ", Contacto=" + Contacto + ", Telefono=" + Telefono + ", Correo=" + Correo + ", Observacion=" + Observacion + '}';
    }
    
    
}