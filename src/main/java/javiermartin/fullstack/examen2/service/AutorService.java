package javiermartin.fullstack.examen2.service;

import javiermartin.fullstack.examen2.model.AutorDTO;
import java.util.List;

public interface AutorService {

	AutorDTO createAutor(AutorDTO autor);
	List<AutorDTO> listAutores();
	
}
