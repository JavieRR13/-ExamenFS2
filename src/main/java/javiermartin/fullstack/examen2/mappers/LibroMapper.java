package javiermartin.fullstack.examen2.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import javiermartin.fullstack.examen2.model.LibroDTO;
import javiermartin.fullstack.examen2.persistence.entities.LibroEntity;
import javiermartin.fullstack.examen2.persistence.entities.AutorEntity;


@Mapper(componentModel = "spring")
public interface LibroMapper {

		@Mapping(source = "autor", target = "autorId", qualifiedByName = "mapAutorId")
	LibroDTO toDto(LibroEntity libro);
	LibroEntity toEntity(LibroDTO libroDTO);
	
	@Named("mapAutorId")
	default Long mapAutorId(AutorEntity autor) {
		if(autor == null) {
			return null;
		}
		return autor.getId();
	}
	
	
}
