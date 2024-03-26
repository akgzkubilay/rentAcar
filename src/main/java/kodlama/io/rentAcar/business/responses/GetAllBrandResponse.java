package kodlama.io.rentAcar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//bu kısımda brand tablosundan tüm verileri çekmek için oluşturulmuş bir response sınıfıdır.     
@Data// bu annotation sayesinde getter ve setter metodları oluşturulmuş olur.
@AllArgsConstructor // bu annotation sayesinde tüm parametreleri içeren bir constructor oluşturulmuş olur.
@NoArgsConstructor// bu annotation sayesinde parametresiz bir constructor oluşturulmuş olur.

public class GetAllBrandResponse {
    private int id;
    private String name; 


}
