package tomas.tasklist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tomas.tasklist.converter.TareaConvertidor;
import tomas.tasklist.dto.TareaDTO;
import tomas.tasklist.entity.TareaEntidad;
import tomas.tasklist.repository.TareaRepositorio;

@Service
public class TareaServiceImpl implements TareaService {

    @Autowired
    TareaRepositorio repositorio;
    @Autowired
    TareaConvertidor convertidor;

    @Override
    public List<TareaDTO> showTasks() {
        List<TareaEntidad> tareas = (List<TareaEntidad>) repositorio.findAll();
        List<TareaDTO> listaTareas = new ArrayList<>();
        for (TareaEntidad tarea : tareas) {
            TareaDTO dto = convertidor.convertEntidadaDTO(tarea);
            listaTareas.add(dto);
        }
        return listaTareas;
    }

    @Override
    public TareaDTO createTask(TareaDTO tarea) {
        TareaEntidad entidad = convertidor.convertDTOaEntidad(tarea);
        entidad = repositorio.save(entidad);
        return convertidor.convertEntidadaDTO(entidad);
    }

    @Override
    public TareaDTO updateTask(TareaDTO tarea, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateTask'");
    }

    @Override
    public void deleteTask(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTask'");
    }
    
}
