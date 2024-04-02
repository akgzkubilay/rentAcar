package kodlama.io.rentAcar.business.abstracts;

import java.util.List;

import kodlama.io.rentAcar.business.requests.CreateBrandRequest;
import kodlama.io.rentAcar.business.requests.UpdateBrandRequest;
import kodlama.io.rentAcar.business.responses.GetAllBrandResponse;
import kodlama.io.rentAcar.business.responses.GetByIdBrandResponse;


public interface BrandService {
   List<GetAllBrandResponse> getAll();
   GetByIdBrandResponse getById(int id);
   void add(CreateBrandRequest request);
   void update(UpdateBrandRequest updateBrandRequest);
   void delete(int id);


}
