package kodlama.io.rentAcar.dataAcces.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentAcar.entities.concretes.brand;

public interface BrandRepository extends JpaRepository<brand, Integer>{
    List<brand> getAll();

}
