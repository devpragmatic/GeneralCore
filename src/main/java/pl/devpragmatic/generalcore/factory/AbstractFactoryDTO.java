package pl.devpragmatic.generalcore.factory;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import pl.devpragmatic.generalcore.dto.BaseDTO;
import pl.devpragmatic.generalcore.entity.BaseEntity;

/**
 * Base abstract for factory using DTO 
 * @author devpragmatic
 * 
 * @param <T> entity object
 * @param <K> data transfer object
 */
public abstract class AbstractFactoryDTO<T extends BaseEntity ,K extends BaseDTO> implements FactoryDTO<T, K>{

    /**
    * {@inheritDoc}
    */
    @Override
    public List<K> createDTOList(List<T> entityList){
        List<K> dtos = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(entityList)){
            entityList.stream().forEach((entity) -> {
                dtos.add(createDTO(entity));
            });
        }
        return dtos;
    }
    
    /**
    * {@inheritDoc}
    */
    @Override
    public List<T> createEntityList(List<K> dtoList){
        List<T> entities = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(dtoList)){
            dtoList.stream().forEach((dto) -> {
                entities.add(createEntity(dto));
            });
        }
        return entities;
    }
}
