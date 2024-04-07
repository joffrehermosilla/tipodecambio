package backend.joffre.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import backend.joffre.model.Usuario;




@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>, PagingAndSortingRepository<Usuario, Integer> {



}
