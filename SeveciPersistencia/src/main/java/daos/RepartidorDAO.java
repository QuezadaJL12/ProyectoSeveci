/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import Dominio.Repartidor;

public interface RepartidorDAO {
    Repartidor crear(Repartidor repartidor);
    Repartidor consultarPorId(Long id);
    Repartidor actualizar(Repartidor repartidor);
    void eliminar(Long id);
}
