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
public class Repartidor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreRepartidor;
    private String informacionContacto; // Puede ser teléfono, correo electrónico, etc.

    public Repartidor() {
    }

    
    // Getters y setters para los atributos
    public String getNombreRepartidor() {
        return nombreRepartidor;
    }

    public void setNombreRepartidor(String nombreRepartidor) {
        this.nombreRepartidor = nombreRepartidor;
    }

    public String getInformacionContacto() {
        return informacionContacto;
    }

    public void setInformacionContacto(String informacionContacto) {
        this.informacionContacto = informacionContacto;
    }
    
    //cSID

    public Repartidor(String nombreRepartidor, String informacionContacto) {
        this.nombreRepartidor = nombreRepartidor;
        this.informacionContacto = informacionContacto;
    }
    
    //ccid

    public Repartidor(Long id, String nombreRepartidor, String informacionContacto) {
        this.id = id;
        this.nombreRepartidor = nombreRepartidor;
        this.informacionContacto = informacionContacto;
    }
    
    
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Repartidor)) {
            return false;
        }
        Repartidor other = (Repartidor) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "entidades.Repartidor[ id=" + id + " ]";
    }
}
