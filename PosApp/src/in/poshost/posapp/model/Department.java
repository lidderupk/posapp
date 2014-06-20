package in.poshost.posapp.model;

import java.util.List;

import com.activeandroid.Model;

public class Department extends Model {
  //auto increment id automatically generated
    
    public String name;
    public String pic;
    
    public List<Item> items() {
        return getMany(Item.class, "Category");
    }
    
}
