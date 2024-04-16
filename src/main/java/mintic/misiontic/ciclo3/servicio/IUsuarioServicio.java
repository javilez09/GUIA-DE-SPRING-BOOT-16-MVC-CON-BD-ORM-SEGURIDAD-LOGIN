/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mintic.misiontic.ciclo3.servicio;

import java.util.List;
import mintic.misiontic.ciclo3.modelo.Usuario;

/**
 *
 * @author USUARIO
 */
public interface IUsuarioServicio {

    public List<Usuario> listarUsuarios();

    public void guardar(Usuario user);

    public void eliminar(Usuario user);

    public Usuario buscar(Usuario user);

}
