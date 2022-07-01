/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concierto.demo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Fabiola Mora
 */
@Entity
@Table(name="artistas")
public class Artista implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nombreGira;
    private String nombreArtista;
    private String costo;
    private String fecha;
    private String capacidadMax;
    
    @ManyToOne
    @JoinColumn(name="lugares_id")
    private Lugar lugar; 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreGira() {
        return nombreGira;
    }

    public void setNombreGira(String nombreGira) {
        this.nombreGira = nombreGira;
    }

    public String getnombreArtista() {
        return nombreArtista;
    }

    public void setnombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getcosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getfecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(String capacidadMax) {
        this.capacidadMax= capacidadMax;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
    
}