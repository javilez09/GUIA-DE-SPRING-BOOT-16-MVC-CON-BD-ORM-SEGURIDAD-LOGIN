/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3.controladores;

import jakarta.validation.Valid;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mintic.misiontic.ciclo3.modelo.Usuario;
import mintic.misiontic.ciclo3.servicio.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author USUARIO
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    IUsuarioServicio userServicio;

    @GetMapping("/")
    public String inicio(Model modelo) {
//      List<Usuario> listaUsuarios = (List<Usuario>) crudUsuario.findAll();
        List<Usuario> listaUsuarios = (List<Usuario>) userServicio.listarUsuarios();

        modelo.addAttribute("usuarios", listaUsuarios);
        log.info("Ejecutando el controlador Inicio MVC");
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Usuario usuario) {
        return "modificar";

    }

    @PostMapping("/guardar")
    public String Guardar(@Valid Usuario usuario, Errors errores) {
        if(errores.hasErrors()){
        return "modificar";
        }
        userServicio.guardar(usuario);
        return "redirect:/";

    }

    @GetMapping("/editar/{cedula}")
    public String editar(Usuario usuario, Model modelo) {
        log.info("Invocando el metodo EDITAR");
        usuario = userServicio.buscar(usuario);
        modelo.addAttribute("usuario", usuario);
        return "modificar";

    }

    @GetMapping("/eliminar/{cedula}")
    public String eliminar (Usuario usuario, Model modelo) {
        userServicio.eliminar(usuario);
        return "redirect:/";

    }

}
