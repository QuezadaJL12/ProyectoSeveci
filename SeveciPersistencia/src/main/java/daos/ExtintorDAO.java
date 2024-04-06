/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidades.Extintor;

public interface ExtintorDAO {
    Extintor crear(Extintor extintor);
    Extintor consultarPorId(Long id);
    Extintor actualizar(Extintor extintor);
    void eliminar(Long id);
}
