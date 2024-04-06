/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidades.Registro_de_Entrega;

public interface RegistroDeEntregaDAO {
    Registro_de_Entrega crear(Registro_de_Entrega registro);
    Registro_de_Entrega consultarPorId(Long id);
    Registro_de_Entrega actualizar(Registro_de_Entrega registro);
    void eliminar(Long id);
}
