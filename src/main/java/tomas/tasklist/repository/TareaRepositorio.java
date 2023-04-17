package tomas.tasklist.repository;

import org.springframework.data.repository.CrudRepository;

import tomas.tasklist.entity.TareaEntidad;

public interface TareaRepositorio extends CrudRepository<TareaEntidad, Long> {
    
}
