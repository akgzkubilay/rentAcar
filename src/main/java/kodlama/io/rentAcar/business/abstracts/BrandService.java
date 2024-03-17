package kodlama.io.rentAcar.business.abstracts;

import java.util.List;

import kodlama.io.rentAcar.entities.concretes.brand;


public interface BrandService {
   List<brand> getAll();
}
