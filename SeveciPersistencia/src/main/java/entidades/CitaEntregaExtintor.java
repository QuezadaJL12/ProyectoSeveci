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
public class CitaEntregaExtintor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fechaHoraCita;
    private String direccionEntrega;
    private String estadoEntrega;
    private String informacionCliente; 
// contructor vacio
    public CitaEntregaExtintor() {
    }

     // Getters y setters para los atributos
    
    public String getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(String fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public String getInformacionCliente() {
        return informacionCliente;
    }

   
    public void setInformacionCliente(String informacionCliente) {
        this.informacionCliente = informacionCliente;
    }
    
    // contructor sin ID

    public CitaEntregaExtintor(String fechaHoraCita, String direccionEntrega, String estadoEntrega, String informacionCliente) {
        this.fechaHoraCita = fechaHoraCita;
        this.direccionEntrega = direccionEntrega;
        this.estadoEntrega = estadoEntrega;
        this.informacionCliente = informacionCliente;
    }
    
     // contructor con ID

    public CitaEntregaExtintor(Long id, String fechaHoraCita, String direccionEntrega, String estadoEntrega, String informacionCliente) {
        this.id = id;
        this.fechaHoraCita = fechaHoraCita;
        this.direccionEntrega = direccionEntrega;
        this.estadoEntrega = estadoEntrega;
        this.informacionCliente = informacionCliente;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CitaEntregaExtintor)) {
            return false;
        }
        CitaEntregaExtintor other = (CitaEntregaExtintor) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "entidades.CitaEntregaExtintor[ id=" + id + " ]";
    }
}
