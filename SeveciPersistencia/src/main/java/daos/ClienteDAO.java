/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidades.Cliente;

public interface ClienteDAO {
    Cliente crear(Cliente cliente);
    Cliente consultarPorId(Long id);
    Cliente actualizar(Cliente cliente);
    void eliminar(Long id);
}

