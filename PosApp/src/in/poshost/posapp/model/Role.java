package in.poshost.posapp.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

public class Role extends Model {
    
  //auto increment id automatically generated
    
	@Column(name="roleDescription")
    public String roleDescription;

}
