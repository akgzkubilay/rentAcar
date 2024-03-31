package kodlama.io.rentAcar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentAcar.business.abstracts.BrandService;
import kodlama.io.rentAcar.business.requests.CreateBrandRequest;
import kodlama.io.rentAcar.business.responses.GetAllBrandResponse;
import kodlama.io.rentAcar.dataAcces.abstracts.BrandRepository;
import kodlama.io.rentAcar.entities.concretes.brand;
import lombok.AllArgsConstructor;

@Service //bu class'ın bir business service olduğunu belirtir.
@AllArgsConstructor //bu annotation sayesinde alttaki constructor'ı yazmamıza gerek kalmaz.
public class BrandManager implements BrandService{
    private BrandRepository brandRepository;
    //bu kısım data access katmanını içerisinde kullanmak istediğimiz sınıfı belirtir
    @Autowired // parametrelerine bak ve bu parametrelerden biri bunu implements ediyor  ise ona uygun sınıfı bulup enjekte et.

     //bu kısım veri tabanını  katmanını(brandrepository ) enjete ediyoruz
     //bu kısımı yazmak yerine @AllArgsConstructor annotation kullanılabilir.   
    // public BrandManager(BrandRepository brandRepository) {
    //     this.brandRepository = brandRepository;
    // }
    
    @Override
    public List<GetAllBrandResponse> getAll() {
        //brand tablosundan tüm verileri GetAllBrandResponse türünde  çekmek için oluşturulmuş bir response sınıfıdır.
        

        List<brand> brands=brandRepository.findAll();
        List<GetAllBrandResponse> brandResponses= new ArrayList<GetAllBrandResponse>();
        for (brand brand : brands) {
            GetAllBrandResponse brandResponse=new GetAllBrandResponse();
            brandResponse.setId(brand.getId());
            brandResponse.setName(brand.getName());
            brandResponses.add(brandResponse);
        }
        
        
        return brandResponses;
    }
    @Override
    public void add(CreateBrandRequest request) {
        brand brand= new brand();
        brand.setName(request.getName());
        this.brandRepository.save(brand);
        
        
    }

}
// bu paketin özeti :istek controllere yapılıyor ve controller isteği karşılıyor ise bu isteği business taşıyo ve business isteği karşılıyor ise bu isteği dataAcces taşıyo ve dataAcces isteği karşılıyor ise veritabanına ulaşıyor.