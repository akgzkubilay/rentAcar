package kodlama.io.rentAcar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentAcar.business.abstracts.BrandService;
import kodlama.io.rentAcar.dataAcces.abstracts.BrandRepository;
import kodlama.io.rentAcar.entities.concretes.brand;
@Service //bu class'ın bir business service olduğunu belirtir.
public class BrandManager implements BrandService{
    private BrandRepository brandRepository;
    //bu kısım data access katmanını içerisinde kullanmak istediğimiz sınıfı belirtir
    @Autowired // parametrelerine bak ve bu parametrelerden biri bunu implements ediyor  ise ona uygun sınıfı bulup enjekte et.
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
    
    @Override
    public List<brand> getAll() {
        return this.brandRepository.findAll();
    }

}
// bu paketin özeti :istek controllere yapılıyor ve controller isteği karşılıyor ise bu isteği business taşıyo ve business isteği karşılıyor ise bu isteği dataAcces taşıyo ve dataAcces isteği karşılıyor ise veritabanına ulaşıyor.