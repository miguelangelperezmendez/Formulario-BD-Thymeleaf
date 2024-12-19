package com.Formulario_BD_Thymeleaf.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Formulario_BD_Thymeleaf.Modelo.Cliente;
import com.Formulario_BD_Thymeleaf.Servicio.ClienteServicio;

@Controller
@RequestMapping("/formulario")
public class ControllerCliente {
    
     //SOLO ESTOY AGREGANDO COMENTARIOS EN LAS DIFERENTES PAGINAS PARA VERIFICAR QUE SE GUARDEN EN LA RAMA CAMBIO2
    @Autowired
    private ClienteServicio servicio;

    // Endpoint: http://localhost:7575/formulario/agregar
    //Metodo para mostrar el formulario
    @GetMapping("/agregar")
    public String mostrarFormulario(Model model){
    model.addAttribute("cliente", new Cliente());
    return "registroCliente";
}



    // Endpoint: http://localhost:7575/formulario/Guardado
    // JSON: {"nombres":"Jair Ram", "Apellidos":"Tepoz Castillo", "telefono":"1234567", "email":"Carboncito@Gmail.com", "edad":35, "direccion":"Calle 78 poniente #457"}
    //Metodo para guardar el cliente en la base de datos
    @PostMapping("/guardado") 
    public ResponseEntity<String> guardarCliente(@RequestBody Cliente cliente) { 
        servicio.guardarCliente(cliente); 
        return new ResponseEntity<>("Cliente guardado exitosamente", HttpStatus.CREATED);
    }

    //Metodo para obtener los datos en la base de datos y mostrarlos en la vista
    //URL http://localhost:7575/formulario/listar
    @GetMapping("/listar")
    public String datosClientes(Model model){
        model.addAttribute("clientes", servicio.listarClientes());
        return "listaClientes"; // Asegúrate de que este es el nombre correcto de tu archivo HTML
    }
    
}
