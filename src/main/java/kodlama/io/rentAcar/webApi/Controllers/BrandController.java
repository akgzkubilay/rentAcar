package kodlama.io.rentAcar.webApi.Controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import kodlama.io.rentAcar.business.abstracts.BrandService;
import kodlama.io.rentAcar.business.requests.CreateBrandRequest;
import kodlama.io.rentAcar.business.responses.GetAllBrandResponse;
import kodlama.io.rentAcar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
@RestController //derleme işlemi sonucunda bu class'ın bir controller olduğunu belirtir.
@RequestMapping("/api/brands") //örn: pilot yukardaki kontrol merkezi ile burdan iletişim kurup erişecek /api/brands  adresi ile erişecek    
@AllArgsConstructor
//bu kısım business katmanını içerisinde kullanarak data acces katmanını barındıran business katmanını kullanır.ve data accese ulaşır.
public class BrandController {
    private BrandService brandService;

@Autowired // parametrelerine bak ve bu parametrelerden biri bunu implements ediyor  ise ona uygun sınıfı bulup enjekte et.
   // public BrandController(BrandService brandService) {
     //   this.brandService = brandService;
    //}

    @GetMapping() //getall isteği geldiğinde bu metodu çalıştırır.
    public List<GetAllBrandResponse> getAll(){
        System.out.println(this.brandService.getAll());
        return this.brandService.getAll();
    }

    @GetMapping("/{id}") //getById isteği geldiğinde bu metodu çalıştırır.  /{id}  bu yapıda herhangi  bir id istek geldiğinde bu metodu çalıştırır.  
    public GetByIdBrandResponse getById( int id){
        System.out.println(this.brandService.getAll());
        return this.brandService.getById(id);
    }

    @PostMapping() //add isteği geldiğinde bu metodu çalıştırır.
    @ResponseStatus(code=HttpStatus.CREATED)
     public void add(CreateBrandRequest request){
        this.brandService.add(request);
     }


}
// bu paketin özeti :istek controllere yapılıyor ve controller isteği karşılıyor ise bu isteği business taşıyo ve business isteği karşılıyor ise bu isteği dataAcces taşıyo ve dataAcces isteği karşılıyor ise veritabanına ulaşıyor. 
