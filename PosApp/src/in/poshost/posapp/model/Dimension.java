package in.poshost.posapp.model;

import java.util.List;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

public class Dimension extends Model {
  //auto increment id automatically generated
    
	@Column(name="name")
    public String name;
	
	@Column(name="item")
    public Item item;
    
    public List<Attribute> getAttributes(){
        return getMany(Attribute.class, "Dimension");
    }
}
