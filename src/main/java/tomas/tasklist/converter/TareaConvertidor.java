package tomas.tasklist.converter;

import org.springframework.stereotype.Component;

import tomas.tasklist.dto.TareaDTO;
import tomas.tasklist.entity.TareaEntidad;

@Component
public class TareaConvertidor {
    
    public TareaEntidad convertDTOaEntidad(TareaDTO dto) {
        TareaEntidad entidad = new TareaEntidad();
        entidad.setTitulo(dto.getTitulo());
        entidad.setDescripcion(dto.getDescripcion());
        entidad.setHecho(dto.isHecho());
        entidad.setFechaCreacion(dto.getFechaCreacion());
        return entidad;
    }

    public TareaDTO convertEntidadaDTO(TareaEntidad entidad) {
        TareaDTO dto = new TareaDTO();
        dto.setId(entidad.getId());
        dto.setTitulo(entidad.getTitulo());
        dto.setDescripcion(entidad.getDescripcion());
        dto.setHecho(entidad.isHecho());
        dto.setFechaCreacion(entidad.getFechaCreacion());
        return dto;
    }



}
