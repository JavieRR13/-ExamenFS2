package javiermartin.fullstack.examen2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import javiermartin.fullstack.examen2.model.AutorDTO;
import javiermartin.fullstack.examen2.persistence.entities.*;
import javiermartin.fullstack.examen2.persistence.repositories.*;
import javiermartin.fullstack.examen2.mappers.*;

public class AutorServiceImp implements AutorService{

	@Autowired
	AutorRepository ar;
	
	@Autowired
	AutorMapper am;
	
	@Override
	public AutorDTO createAutor(AutorDTO autor) {
		
		AutorEntity autorEntity = ar.save(am.autorDTotoAutorEntity(autor));
		return am.autorEntitytoAutorDto(autorEntity);
	}
	
	@Override
	public List<AutorDTO> listAutores(){
		List<AutorEntity> listAutores = ar.findAll();
		List<AutorDTO> listaAutoresDTO = am.listToDTO(listAutores);
		
		return listaAutoresDTO;
	}

	
}
