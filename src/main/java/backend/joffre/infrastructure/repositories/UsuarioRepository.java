package backend.joffre.infrastructure.repositories;




import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import backend.joffre.domain.models.Usuario;




@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>, PagingAndSortingRepository<Usuario, Integer> {





}
