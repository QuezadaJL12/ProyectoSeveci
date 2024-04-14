/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;


/**
 *
 * @author caarl
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Extintor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String numeroSerie;
    private String tipoExtintor; // Puede ser agua, polvo, CO2, etc.
    private String fechaUltimaRecarga; // Pueden usar tipos de datos como java.util.Date o java.time.LocalDate.

    public Extintor() {
    }


// Getters y setters para los atributos

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFechaUltimaRecarga() {
        return fechaUltimaRecarga;
    }

    public void setFechaUltimaRecarga(String fechaUltimaRecarga) {
        this.fechaUltimaRecarga = fechaUltimaRecarga;
    }

    //contructor sin id

    public Extintor(String numeroSerie, String tipoExtintor, String fechaUltimaRecarga) {
        this.numeroSerie = numeroSerie;
        this.tipoExtintor = tipoExtintor;
        this.fechaUltimaRecarga = fechaUltimaRecarga;
    }
    
    //contruscotr con id

    public Extintor(Long id, String numeroSerie, String tipoExtintor, String fechaUltimaRecarga) {
        this.id = id;
        this.numeroSerie = numeroSerie;
        this.tipoExtintor = tipoExtintor;
        this.fechaUltimaRecarga = fechaUltimaRecarga;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Extintor)) {
            return false;
        }
        Extintor other = (Extintor) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "entidades.Extintor[ id=" + id + " ]";
    }
}
