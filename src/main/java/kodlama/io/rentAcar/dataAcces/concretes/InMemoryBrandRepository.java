package kodlama.io.rentAcar.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import kodlama.io.rentAcar.entities.concretes.brand;
 
import kodlama.io.rentAcar.dataAcces.abstracts.BrandRepository;

@Repository //bu class'ın data access görevi göreceğini belirtir.
public class InMemoryBrandRepository implements BrandRepository{
 //bu kısımda uyduruktan ön bellekte markalar oluşturucaz data base olmadığı için 

 List<brand> brands;
 //bu kısımda uyduruktan ön bellekte markalar oluşturucaz data base olmadığı için
public InMemoryBrandRepository() {
    brands =new ArrayList<brand>();
    brands.add(new brand("Audi",1));
    brands.add(new brand("BMW",2));
    brands.add(new brand("Mercedes",3));
    brands.add(new brand("Fiat",4));
    brands.add(new brand("Renault",5));
    brands.add(new brand("Toyota",6));
    
   

}







    @Override
    public List<brand> getAll() {
        return brands;
        
    }
   
   


}
