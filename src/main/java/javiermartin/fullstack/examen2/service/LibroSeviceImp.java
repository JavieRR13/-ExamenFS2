package javiermartin.fullstack.examen2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import javiermartin.fullstack.examen2.model.LibroDTO;
import javiermartin.fullstack.examen2.persistence.entities.AutorEntity;
import javiermartin.fullstack.examen2.persistence.entities.LibroEntity;
import javiermartin.fullstack.examen2.persistence.repositories.LibroRepository;
import javiermartin.fullstack.examen2.mappers.LibroMapper;
import javiermartin.fullstack.examen2.persistence.repositories.AutorRepository;


@Service
public class LibroSeviceImp implements LibroService{

	@Autowired
	LibroRepository lr;
	@Autowired
	LibroMapper lm;
	@Autowired
	AutorRepository ar;
	
	
	@Override
	public LibroDTO createLibro(LibroDTO libroDTO) {

		Long Autorid = libroDTO.getAutorId();

		Optional<AutorEntity> autor = ar.findById(Autorid);

		if (autor.isPresent()) {
			LibroEntity libroEntity = lm.toEntity(libroDTO);
			libroEntity.setAutor(autor.get());
			lr.save(libroEntity);

			return lm.toDto(libroEntity);
		}

		throw new RuntimeException("El autor no está registrado");
}
}