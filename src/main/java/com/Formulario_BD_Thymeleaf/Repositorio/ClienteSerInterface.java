package com.Formulario_BD_Thymeleaf.Repositorio;

import java.util.List;

import com.Formulario_BD_Thymeleaf.Modelo.Cliente;

public interface ClienteSerInterface {
    public void guardarCliente(Cliente cliente);
    public List<Cliente> listarClientes();
}
