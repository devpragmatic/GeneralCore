package pl.devpragmatic.generalcore.factory;

import java.util.List;
import pl.devpragmatic.generalcore.dto.BaseDTO;
import pl.devpragmatic.generalcore.entity.BaseEntity;

/**
 * Base interface for factory using DTO 
 * @author devpragmatic
 * 
 * @param <T> entity object
 * @param <K> data transfer object
 */
public interface FactoryDTO<T extends BaseEntity ,K extends BaseDTO> {
    
    /**
     * Creating DTO by entity
     * @param entity entity object
     * @return DTO object
     */
    public K createDTO(T entity);
    
    /**
     * Creating entity by DTO
     * @param dto DTO object
     * @return entity object
     */
    public T createEntity(K dto);
    
    /**
     * Creating list DTO by entity list
     * @param entityList entity object
     * @return DTO list
     */
    public List<K> createDTOList(List<T> entityList);
    
    /**
     * Creating list entity by DTO list
     * @param dtoList DTO object
     * @return entity list
     */
    public List<T> createEntityList(List<K> dtoList);
}
