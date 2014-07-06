package in.poshost.posapp.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

public class StoreLocation extends Model {
    
  //auto increment id automatically generated
    
	@Column(name="storeType")
    public int storeType;
	
	@Column(name="storeName")
    public String storeName;
	
	@Column(name="address1")
    public String address1;
	
	@Column(name="address2")
    public String address2;
	
	@Column(name="city")
    public String city;
	
	@Column(name="state")
    public String state;
	
	@Column(name="zip")
    public String zip;
	
	@Column(name="taxId")
    public String taxId;
}
