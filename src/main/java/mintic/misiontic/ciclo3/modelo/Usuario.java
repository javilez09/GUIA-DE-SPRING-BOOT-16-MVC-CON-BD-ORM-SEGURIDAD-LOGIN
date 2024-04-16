/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3.modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "usuarios", catalog = "mi_base_de_datos_jamir")
@Data

public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotEmpty
    @Column(name = "cedula", nullable = false, length = 15)
    private String cedula;
    @NotEmpty
    private String clave;
    @NotEmpty
    private String nombre;
    @Email
    private String email;

}
