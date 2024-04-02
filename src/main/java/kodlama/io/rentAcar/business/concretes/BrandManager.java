package kodlama.io.rentAcar.business.concretes;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentAcar.business.abstracts.BrandService;
import kodlama.io.rentAcar.business.requests.CreateBrandRequest;
import kodlama.io.rentAcar.business.requests.UpdateBrandRequest;
import kodlama.io.rentAcar.business.responses.GetAllBrandResponse;
import kodlama.io.rentAcar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentAcar.core.utilities.mapper.ModelMapperService;
import kodlama.io.rentAcar.dataAcces.abstracts.BrandRepository;
import kodlama.io.rentAcar.entities.concretes.brand;
import lombok.AllArgsConstructor;

@Service //bu class'ın bir business service olduğunu belirtir.
@AllArgsConstructor //bu annotation sayesinde alttaki constructor'ı yazmamıza gerek kalmaz.
public class BrandManager implements BrandService{
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
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
      //  List<GetAllBrandResponse> brandResponses= new ArrayList<GetAllBrandResponse>();
        //for (brand brand : brands) {
            //brandResponse brandResponse=new brandResponse();
            //brandResponse.setId(brand.getId());
            //brandResponse.setName(brand.getName());
            //brandResponses.add(brandResponse);
            //tek tek newlemek yerine modelMapperService.forResponse().map(brand, GetAllBrandResponse.class); kullanarak yapabiliriz.
        //}
        List<GetAllBrandResponse> brandResponses=brands.stream()
        .map(brand-> this.modelMapperService
        .forResponse().map(brand, GetAllBrandResponse.class)).collect(Collectors.toList());

        
        
        return brandResponses;
    }
    @Override
    public void add(CreateBrandRequest request) {
        //brand brand= new brand();
        //brand.setName(request.getName());         //alt map kısımında brand classındaki alanları request classı türündekileri brand clası türüne çeviririz.   
        // tek tek newlemek yerine modelMapperService.forRequest().map(request, brand.class); kullanarak yapabiliriz.   
    
        brand brand=modelMapperService.forRequest().map(request, brand.class);
        this.brandRepository.save(brand);
        
        
    }
    @Override
    public GetByIdBrandResponse getById(int id) {
        brand brand=brandRepository.findById(id).orElseThrow();
        GetByIdBrandResponse response=modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);  
        return  response;

    }
    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        brand brand=modelMapperService.forRequest().map(updateBrandRequest, brand.class);
        this.brandRepository.save(brand);
    }
    @Override
    public void delete(int id) {
       this.brandRepository.deleteById(id);
    }

}
// bu paketin özeti :istek controllere yapılıyor ve controller isteği karşılıyor ise bu isteği business taşıyo ve business isteği karşılıyor ise bu isteği dataAcces taşıyo ve dataAcces isteği karşılıyor ise veritabanına ulaşıyor.