/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidades.CitaEntregaExtintor;

public interface CitaEntregaExtintorDAO {
    CitaEntregaExtintor crear(CitaEntregaExtintor cita);
    CitaEntregaExtintor consultarPorId(Long id);
    CitaEntregaExtintor actualizar(CitaEntregaExtintor cita);
    void eliminar(Long id);
}
