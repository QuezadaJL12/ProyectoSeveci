/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import Dominio.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("seveci");
        EntityManager entityManager = emFactory.createEntityManager();
        
        
        
        Cliente cliente = new Cliente("juan antonio", "Servicio");
        entityManager.getTransaction().begin();
                
        
        
        
    }
    
}
