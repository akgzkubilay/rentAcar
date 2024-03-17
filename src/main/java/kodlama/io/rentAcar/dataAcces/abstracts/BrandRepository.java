package kodlama.io.rentAcar.dataAcces.abstracts;

import java.util.List;

import kodlama.io.rentAcar.entities.concretes.brand;

public interface BrandRepository {
    List<brand> getAll();

}
