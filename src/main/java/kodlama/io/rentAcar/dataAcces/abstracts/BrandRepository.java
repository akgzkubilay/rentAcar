package kodlama.io.rentAcar.dataAcces.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentAcar.entities.concretes.brand;

public interface BrandRepository extends JpaRepository<brand, Integer>{
    

}
