package tomas.tasklist.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TareaDTO {
    
    Long id;
    String titulo;
    String descripcion;
    boolean hecho;
    Date fechaCreacion;
}
