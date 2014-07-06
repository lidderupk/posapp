package in.poshost.posapp.model;

import java.util.List;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

public class Department extends Model {
  //auto increment id automatically generated

	@Column(name="name")
    public String name;
	
	@Column(name="pic")
    public String pic;
    
    public List<Item> items() {
        return getMany(Item.class, "Department");
    }
    
}
