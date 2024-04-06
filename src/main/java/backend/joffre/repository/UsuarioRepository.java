package backend.joffre.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import backend.joffre.model.Usuario;




@Repository
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Integer> {

}
