/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mintic.misiontic.ciclo3.dao;

import mintic.misiontic.ciclo3.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface IUsuarioCrud extends CrudRepository<Usuario, String>{
    
    

}
