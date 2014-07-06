package in.poshost.posapp.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

public class Attribute extends Model {
  //auto increment id automatically generated
    
	@Column(name="dimension")
    public Dimension dimension;
    
	@Column(name="name")
	public String name;
}
