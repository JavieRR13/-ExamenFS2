package javiermartin.fullstack.examen2.model;

import java.math.BigDecimal;

public class LibroDTO {

	private Long libroId;
	private String titulo;
	private String isbn;
	private BigDecimal precio;
	private Long autorId;
	
	public LibroDTO() {
		
	}

	public LibroDTO(Long libroId, String titulo, String isbn, BigDecimal precio, Long autorId) {
		super();
		this.libroId = libroId;
		this.titulo = titulo;
		this.isbn = isbn;
		this.precio = precio;
		this.autorId = autorId;
	}

	public Long getId() {
		return libroId;
	}

	public void setId(Long libroId) {
		this.libroId = libroId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Long getAutorId() {
		return autorId;
	}

	public void setAutorId(Long autorId) {
		this.autorId = autorId;
	}
	
	
}
