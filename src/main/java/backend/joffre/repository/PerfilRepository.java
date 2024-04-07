package backend.joffre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import backend.joffre.model.Perfil;


@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer>, PagingAndSortingRepository<Perfil, Integer> {

}
