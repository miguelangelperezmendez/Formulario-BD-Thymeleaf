package com.Formulario_BD_Thymeleaf.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Formulario_BD_Thymeleaf.Modelo.Cliente;
import com.Formulario_BD_Thymeleaf.Repositorio.ClienteSerInterface;
import com.Formulario_BD_Thymeleaf.Repositorio.Repositorio;

@Service
public class ClienteServicio implements ClienteSerInterface{

    @Autowired
    private Repositorio repositorio;

    @Override
    public void guardarCliente(Cliente cliente) {
        repositorio.save(cliente);
    }

    @Override
    public List<Cliente> listarClientes() {
        return (List<Cliente>) repositorio.findAll();
    }
    
}
