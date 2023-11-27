package javiermartin.fullstack.examen2.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javiermartin.fullstack.examen2.service.*;
import javiermartin.fullstack.examen2.model.*;

@RestController
@RequestMapping("/libros")
public class LibroRestController {
	
	@Autowired
	LibroService ls;
	
	@PostMapping("/crear")
	ResponseEntity<?> crearLibro(@RequestBody LibroDTO libroDTO){
		
		LibroDTO libro = ls.createLibro(libroDTO);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+libro.getId()).buildAndExpand(libro.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
}
