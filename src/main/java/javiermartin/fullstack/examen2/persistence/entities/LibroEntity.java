package javiermartin.fullstack.examen2.persistence.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LibroEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long libroid;
	private String titulo;
	private String isbn;
	private BigDecimal precio;
	
	@ManyToOne
	@JoinColumn(name = "autor_id")
	private AutorEntity autor;

	
	public LibroEntity() {
		
	}
	
	
	public LibroEntity(Long libroid, String titulo, String isbn, BigDecimal precio, AutorEntity autor) {
		super();
		this.libroid = libroid;
		this.titulo = titulo;
		this.isbn = isbn;
		this.precio = precio;
		this.autor = autor;
	}


	public Long getLibroid() {
		return libroid;
	}

	public void setLibroid(Long libroid) {
		this.libroid = libroid;
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

	public AutorEntity getAutor() {
		return autor;
	}

	public void setAutor(AutorEntity autor) {
		this.autor = autor;
	}

	
	
	
	
	
}
