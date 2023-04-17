package tomas.tasklist.service;

import java.util.List;

import tomas.tasklist.dto.TareaDTO;

public interface TareaService {

    List<TareaDTO> showTasks();
    TareaDTO createTask(TareaDTO tarea);
    TareaDTO updateTask(TareaDTO tarea, Long id);
    void deleteTask(Long id);
    
}
