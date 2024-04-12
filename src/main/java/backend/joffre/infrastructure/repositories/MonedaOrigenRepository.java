package backend.joffre.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import backend.joffre.domain.models.MonedaOrigen;


@Repository
public interface MonedaOrigenRepository extends  JpaRepository<MonedaOrigen, Integer>, PagingAndSortingRepository<MonedaOrigen, Integer> {

}
