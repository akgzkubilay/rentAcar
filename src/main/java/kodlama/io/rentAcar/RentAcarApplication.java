package kodlama.io.rentAcar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentAcarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentAcarApplication.class, args);
	}
    // bu newleme işlemi yapılmazsa bçyle bir hata ile karşılaşırsın.
	// aşşağıdaki hata ile beraber ICO hatası alırsın. ve mantığını anlarsın.
	//Parameter 0 of constructor in kodlama.io.rentAcar.core.utilities.mapper.ModelMapperManager required a bean of type 'org.modelmapper.ModelMapper' that could not be found.
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
