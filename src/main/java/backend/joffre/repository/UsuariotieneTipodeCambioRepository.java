package backend.joffre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import backend.joffre.model.UsuariotieneTipodeCambio;


@Repository
public interface UsuariotieneTipodeCambioRepository
		extends  JpaRepository<UsuariotieneTipodeCambio, Integer>, PagingAndSortingRepository<UsuariotieneTipodeCambio, Integer> {

}
