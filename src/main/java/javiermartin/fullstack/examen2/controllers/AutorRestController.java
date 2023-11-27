package javiermartin.fullstack.examen2.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.util.List;

import javiermartin.fullstack.examen2.model.*;
import javiermartin.fullstack.examen2.service.*;

@RestController
@RequestMapping("/autores")
public class AutorRestController {
    
	@Autowired
    AutorService as;
	
	@PostMapping
	ResponseEntity<?> createAutor(@RequestBody AutorDTO autorDTO){
		AutorDTO autor = as.createAutor(autorDTO);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/" + autor.getId())
                .buildAndExpand(autor.getId()).toUri();
        
		return ResponseEntity.created(location).build();
    }
	
	@GetMapping
    ResponseEntity<?> listaDeAutores(){

        List<AutorDTO> autores = as.listAutores();

        if(!autores.isEmpty()) {
            return ResponseEntity.ok(autores);
        }

        return ResponseEntity.noContent().build();
    }
}