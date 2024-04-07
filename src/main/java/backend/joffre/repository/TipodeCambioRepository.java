package backend.joffre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import backend.joffre.model.TipodeCambio;


@Repository
public interface TipodeCambioRepository extends  JpaRepository<TipodeCambio, Integer>, PagingAndSortingRepository<TipodeCambio, Integer> {

}
