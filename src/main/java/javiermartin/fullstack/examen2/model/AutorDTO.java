package javiermartin.fullstack.examen2.model;

import java.util.ArrayList;
import java.util.List;

public class AutorDTO {
	
	private Long autorId;
	private String nombre;
	private String nacionalidad;
	private List<LibroDTO> libros = new ArrayList<>();
	
	public AutorDTO() {
		
	}
	
	public AutorDTO(Long autorId, String nombre, String nacionalidad, List<LibroDTO> libros) {
		super();
		this.autorId = autorId;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.libros = libros;
	}


	public Long getId() {
		return autorId;
	}

	public void setId(Long id) {
		this.autorId = autorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public List<LibroDTO> getLibros() {
		return libros;
	}

	public void setLibros(List<LibroDTO> libros) {
		this.libros = libros;
	}
	
	
	
	
}

	