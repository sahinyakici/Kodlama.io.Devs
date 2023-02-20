package sahin.Kodlama.io.Devs.core.utilities.mappers;

import org.modelmapper.ModelMapper;

public interface IModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
