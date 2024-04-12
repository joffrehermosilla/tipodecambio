package backend.joffre.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import backend.joffre.domain.models.PerfilxUsuario;



@Repository
public interface PerfilxUsuarioRepository extends JpaRepository<PerfilxUsuario, Integer>, PagingAndSortingRepository<PerfilxUsuario, Integer> {

}
