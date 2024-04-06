package backend.joffre.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import backend.joffre.model.TipodeCambio;


@Repository
public interface TipodeCambioRepository extends PagingAndSortingRepository<TipodeCambio, Integer> {

}
