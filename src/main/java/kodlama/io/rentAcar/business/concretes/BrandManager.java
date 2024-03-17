package kodlama.io.rentAcar.business.concretes;

import java.util.List;

import kodlama.io.rentAcar.business.abstracts.BrandService;
import kodlama.io.rentAcar.dataAcces.abstracts.BrandRepository;
import kodlama.io.rentAcar.entities.concretes.brand;

public class BrandManager implements BrandService{
    private BrandRepository brandRepository;
    // BU KISIMDA SPRING FRAMEWORK KULLANILDIĞI İÇİN CONSTRUCTOR INJECTION YAPILDI
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
    
    @Override
    public List<brand> getAll() {
        return this.brandRepository.getAll();
    }

}
