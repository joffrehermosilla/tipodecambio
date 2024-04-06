package backend.joffre.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import backend.joffre.model.Perfil;

@Repository
public interface PerfilRepository extends PagingAndSortingRepository<Perfil, Integer> {

}
