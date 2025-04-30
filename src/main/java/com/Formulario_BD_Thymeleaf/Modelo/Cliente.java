package com.Formulario_BD_Thymeleaf.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
    //SOLO ESTOY AGREGANDO COMENTARIOS EN LAS DIFERENTES PAGINAS PARA VERIFICAR QUE SE GUARDEN EN LA RAMA CAMBIO2

    /*
     * BIOGRAFIA DE CLAUDIA SHEINBAUM
     * Claudia Sheinbaum Pardo (Ciudad de México, 24 de junio de 1962) es una política, científica y académica mexicana. 
     * Es la presidenta de México desde el 1 de octubre de 2024, siendo la primera mujer en la historia de su país en ejercer
     *  el cargo.[7]​[8]​[9]​

    Antes de asumir la presidencia de México, Sheinbaum participó activamente en el servicio público, 
    ocupando diversos cargos de liderazgo. Fue jefa de Gobierno de la Ciudad de México de 2018 a 2023, 
    convirtiéndose en la primera alcaldesa electa de la ciudad.[10]​[11]​ Su administración priorizó la seguridad urbana, 
    las iniciativas ambientales y los programas sociales, incluidas notables expansiones en el transporte público y los sistemas 
    de apoyo educativo. Su mandato también incluyó respuestas a desafíos complejos, como el colapso de la Línea 12 del Metro de l
    a Ciudad de México y la gestión de la pandemia de COVID-19, que le valieron tanto reconocimiento como críticas.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String email;
    private int edad;
    private String direccion;
    
    public Cliente(Integer idCliente, String nombres, String apellidos, String telefono, String email, int edad,
            String direccion) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Cliente() {
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

}
