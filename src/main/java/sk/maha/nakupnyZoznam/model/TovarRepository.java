package sk.maha.nakupnyZoznam.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TovarRepository extends CrudRepository<Tovar, Long> {

	List<Tovar> findAll();
}
