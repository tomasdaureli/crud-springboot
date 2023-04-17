package tomas.tasklist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tomas.tasklist.dto.TareaDTO;
import tomas.tasklist.service.TareaService;

@RestController
@RequestMapping("/tasks")
public class TareaControlador {

    @Autowired
    TareaService servicio;

    @GetMapping("/all-tasks")
    public ResponseEntity<List<TareaDTO>> showTasks() {
        List<TareaDTO> tareas = servicio.showTasks();
        return new ResponseEntity<>(tareas, HttpStatus.OK);
    }

    @PostMapping("new-task")
    public TareaDTO createTask(@RequestBody TareaDTO tarea) {
        return servicio.createTask(tarea);
    }

    @PatchMapping("modify-task/{id}")
    public TareaDTO updateTask(@RequestBody TareaDTO tarea, @PathVariable Long id) {
        return servicio.updateTask(tarea, id);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable Long id) {
        servicio.deleteTask(id);
        return new ResponseEntity<>("La tarea ha sido eliminada exitosamente.", HttpStatus.OK);
    }
    
}
