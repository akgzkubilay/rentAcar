package kodlama.io.rentAcar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="brands")//veritabanında hangi tabloya karşılık geldiğini belirtir.
@Entity//bu class'ın bir entity olduğunu belirtir.
public class brand {
    //yaptığımız işlemler veritabanındaki tabloyu tasarlamak için yapılan işlemlerdir.   

    @Column(name="name")// veritabanında hangi kolona karşılık geldiğini belirtir.
    private String name;

    @Id//bu kolonun kay  olduğunu belirtir.
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id'nin otomatik artan bir değer olduğunu belirtir. 
    private int id;

    public brand() {
    }
    
    public brand(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    } 


}
