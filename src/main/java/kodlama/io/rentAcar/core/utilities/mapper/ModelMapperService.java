package kodlama.io.rentAcar.core.utilities.mapper;

import org.modelmapper.ModelMapper;

// bu strateji oluşturmak için lazım olan interface
public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();


}
