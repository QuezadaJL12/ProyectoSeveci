/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


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
public class Registro_de_Entrega implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fechaHoraEntrega;
    private String estadoEntrega; // Puede ser "entregado", "no entregado", etc.
    private String observaciones; // Observaciones adicionales sobre la entrega.

    public Registro_de_Entrega() {
    }

    // Getters y setters para los atributos
    
    public String getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }

    public void setFechaHoraEntrega(String fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Registro_de_Entrega(String fechaHoraEntrega, String estadoEntrega, String observaciones) {
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.estadoEntrega = estadoEntrega;
        this.observaciones = observaciones;
    }

    public Registro_de_Entrega(Long id, String fechaHoraEntrega, String estadoEntrega, String observaciones) {
        this.id = id;
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.estadoEntrega = estadoEntrega;
        this.observaciones = observaciones;
    }

    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Registro_de_Entrega)) {
            return false;
        }
        Registro_de_Entrega other = (Registro_de_Entrega) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "entidades.Registro_de_Entrega[ id=" + id + " ]";
    }
}
