package javiermartin.fullstack.examen2.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javiermartin.fullstack.examen2.model.AutorDTO;
import javiermartin.fullstack.examen2.persistence.entities.AutorEntity;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AutorMapper.class})
public interface AutorMapper {

	AutorDTO autorEntitytoAutorDto(AutorEntity autor);
	AutorEntity autorDTotoAutorEntity(AutorDTO autorDTO);
	
	List<AutorDTO> listToDTO(List<AutorEntity> listaEntity);
	
	
}
