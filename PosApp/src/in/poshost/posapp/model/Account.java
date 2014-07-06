package in.poshost.posapp.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

public class Account extends Model {
  //auto increment id automatically generated
    
	@Column(name="email")
    public String email;
	
	@Column(name="password")
    public String password;
	
	@Column(name="firstName")
    public String firstName;
	
	@Column(name="lastName")
    public String lastName;
	
	@Column(name="Status")
    public int Status;
	
	@Column(name="role")
    public Role role;
	
	@Column(name="userPic")
    public String userPic;
}
