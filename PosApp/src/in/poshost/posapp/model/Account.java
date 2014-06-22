package in.poshost.posapp.model;

import com.activeandroid.Model;

public class Account extends Model {
  //auto increment id automatically generated
    
    public String email;
    public String password;
    public String firstName;
    public String lastName;
    public int Status;
    public Role role;
    public String userPic;
}
