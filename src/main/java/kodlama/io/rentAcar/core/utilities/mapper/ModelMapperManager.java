package kodlama.io.rentAcar.core.utilities.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor



public class ModelMapperManager implements ModelMapperService{
   private ModelMapper modelMapper;
   
 
    // bu sınıfın amacı modelmapper sınıfını kullanarak nesneler arasında dönüşüm yapmaktır.
    @Override
    public ModelMapper forResponse() { 
        this.modelMapper.getConfiguration(). //bu kısımda gevşek bağlılık ile çalışıyoruz.yani bir nesne ile diğer nesne arasında bir alan farkı(id,name,(customer olsa daolur olmasasda)) varsa hata vermez.
        setAmbiguityIgnored(true)
        .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper;
    }

    @Override
    public ModelMapper forRequest() {
        this.modelMapper.getConfiguration()
        .setAmbiguityIgnored(true) //bu kısımda gevşek olmayan bağlılık ile çalışıyoruz.yani bir nesne ile diğer nesne arasında bir alan farkı(id,name,customer) varsa hata verir.
        .setMatchingStrategy(MatchingStrategies.STANDARD);
        return modelMapper;
    }
}
