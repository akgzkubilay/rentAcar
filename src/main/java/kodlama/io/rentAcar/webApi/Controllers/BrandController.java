package kodlama.io.rentAcar.webApi.Controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import kodlama.io.rentAcar.business.abstracts.BrandService;
import kodlama.io.rentAcar.entities.concretes.brand;
@RestController //derleme işlemi sonucunda bu class'ın bir controller olduğunu belirtir.
@RequestMapping("/api/brands") //örn: pilot yukardaki kontrol merkezi ile burdan iletişim kurup erişecek /api/brands  adresi ile erişecek    
public class BrandController {
    private BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }
    public List<brand> getAll(){
        return this.brandService.getAll();
    }

}
// bu paketin özeti :istek controllere yapılıyor ve controller isteği karşılıyor ise bu isteği business taşıyo ve business isteği karşılıyor ise bu isteği dataAcces taşıyo ve dataAcces isteği karşılıyor ise veritabanına ulaşıyor. 
