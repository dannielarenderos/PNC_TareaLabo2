package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.domain.Usuario;

@Controller
public class MainController {

	String user = "danni";
	String contra = "hola";
	
	@GetMapping("/login")
		public String enviarForm(Usuario usuario) {
			return "login";
	}
	
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		
		if(usuario.getNombre().equals(user) && usuario.getContra().equals(contra))
			{
			return "MostrarMensajeV"; 
			}
		
		else {
			return "MostrarMensajeF"; }
			}
}

