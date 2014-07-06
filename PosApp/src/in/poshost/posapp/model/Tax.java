package in.poshost.posapp.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

public class Tax extends Model {
  //auto increment id automatically generated
    
	@Column(name="taxDesc")
    public String taxDesc;
	
	@Column(name="taxPrice")
    public double taxPrice;
	
	@Column(name="catalog")
    public Catalog catalog;
}
