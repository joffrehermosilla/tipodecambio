package backend.joffre.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import backend.joffre.domain.models.TipodeCambio;


@Repository
public interface TipodeCambioRepository extends  JpaRepository<TipodeCambio, Integer>, PagingAndSortingRepository<TipodeCambio, Integer> {

}
