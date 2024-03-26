package kodlama.io.rentAcar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//bu kısımda brand tablosuna veri  göstermek için oluşturulmuş bir request  sınıfıdır.
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateBrandRequest {
    private String name;

}
