package in.poshost.posapp.model;

import java.util.List;

import com.activeandroid.Model;

public class Dimension extends Model {
  //auto increment id automatically generated
    
    public String name;
    
    public Item item;
    
    public List<Attributes> getAttributes(){
        return getMany(Attributes.class, "Dimension");
    }
}
