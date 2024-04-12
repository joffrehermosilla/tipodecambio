package backend.joffre.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import backend.joffre.domain.models.UsuariotieneTipodeCambio;


@Repository
public interface UsuariotieneTipodeCambioRepository
		extends  JpaRepository<UsuariotieneTipodeCambio, Integer>, PagingAndSortingRepository<UsuariotieneTipodeCambio, Integer> {

}
