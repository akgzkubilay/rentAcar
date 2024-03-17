package kodlama.io.rentAcar.dataAcces.concretes;

import java.util.List;

import kodlama.io.rentAcar.entities.concretes.brand;
 
import kodlama.io.rentAcar.dataAcces.abstracts.BrandRepository;


public class InMemoryBrandRepository implements BrandRepository{
 //bu kısımda uyduruktan ön bellekte markalar oluşturucaz data base olmadığı için 

 List<brand> brands;
public InMemoryBrandRepository() {
    brand brand1 = new brand("Audi", 1);
    brand brand2 = new brand("BMW", 2);
    brand brand3 = new brand("Mercedes", 3);
    brand brand4 = new brand("Fiat", 4);
    brand brand5 = new brand("Renault", 5);
    brand brand6 = new brand("Toyota", 6);
    brand brand7 = new brand("Hyundai", 7);
    brand brand8 = new brand("Peugeot", 8);
    brand brand9 = new brand("Citroen", 9);
    brand brand10 = new brand("Opel", 10);
    brand brand11 = new brand("Ford", 11);
    brand brand12 = new brand("Chevrolet", 12);
    brand brand13 = new brand("Dacia", 13);
    brand brand14 = new brand("Volkswagen", 14);
    brand brand15 = new brand("Skoda", 15);
    brand brand16 = new brand("Seat", 16);
    brand brand17 = new brand("Kia", 17);
    brand brand18 = new brand("Nissan", 18);
    brand brand19 = new brand("Mazda", 19);
    brand brand20 = new brand("Honda", 20);
    brand brand21 = new brand("Subaru", 21);
    brand brand22 = new brand("Suzuki", 22);
    brand brand23 = new brand("Mitsubishi", 23);
    brand brand24 = new brand("Jeep", 24);
    brand brand25 = new brand("Land Rover", 25);
    brand brand26 = new brand("Jaguar", 26);
    brand brand27 = new brand("Volvo", 27);
    brand brand28 = new brand("Mini", 28);
    brand brand29 = new brand("Porsche", 29);
    brand brand30 = new brand("Ferrari", 30);
    brand brand31 = new brand("Lamborghini", 31);
    brand brand32 = new brand("Maserati", 32);
    brand brand33 = new brand("Bentley", 33);
    brand brand34 = new brand("Rolls Royce", 34);
    brand brand35 = new brand("Aston Martin", 35);
    brand brand36 = new brand("Bugatti", 36);
    brand brand37 = new brand("Alfa Romeo", 37);
}





    @Override
    public java.util.List<brand> getAll() {
        return brands;
        
    }
   
   


}
