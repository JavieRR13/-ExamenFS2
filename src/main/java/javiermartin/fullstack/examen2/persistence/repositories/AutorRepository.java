package javiermartin.fullstack.examen2.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import javiermartin.fullstack.examen2.persistence.entities.AutorEntity;

public interface AutorRepository extends JpaRepository<AutorEntity, Long> {

}
