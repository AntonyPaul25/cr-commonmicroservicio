package cr.microservicios.common.services;

import java.util.List;
import java.util.Optional;

public interface CommonService<E> {

	List<E> findAll();

	Optional<E> findById(Long id);

	E save(E entity);

	void saveAll(List<E> list);

	void deleteById(Long id);

}
