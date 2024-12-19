package com.Formulario_BD_Thymeleaf.Repositorio;

import java.util.List;

import com.Formulario_BD_Thymeleaf.Modelo.Cliente;

 //SOLO ESTOY AGREGANDO COMENTARIOS EN LAS DIFERENTES PAGINAS PARA VERIFICAR QUE SE GUARDEN EN LA RAMA CAMBIO2

public interface ClienteSerInterface {
    public void guardarCliente(Cliente cliente);
    public List<Cliente> listarClientes();
}
