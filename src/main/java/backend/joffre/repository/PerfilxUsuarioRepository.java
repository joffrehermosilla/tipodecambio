package backend.joffre.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import backend.joffre.model.PerfilxUsuario;


@Repository
public interface PerfilxUsuarioRepository extends PagingAndSortingRepository<PerfilxUsuario, Integer> {

}
