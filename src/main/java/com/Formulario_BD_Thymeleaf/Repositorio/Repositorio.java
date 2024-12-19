package com.Formulario_BD_Thymeleaf.Repositorio;

import org.springframework.data.repository.CrudRepository;

import com.Formulario_BD_Thymeleaf.Modelo.Cliente;

 //SOLO ESTOY AGREGANDO COMENTARIOS EN LAS DIFERENTES PAGINAS PARA VERIFICAR QUE SE GUARDEN EN LA RAMA CAMBIO2

public interface Repositorio extends CrudRepository<Cliente, Integer> {

    //Al extender de la clase CrudRepository de Spring Framework contiene todos los metodos CRUD
    
}
