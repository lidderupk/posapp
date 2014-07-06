package in.poshost.posapp.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

public class Item extends Model {
  //auto increment id automatically generated
	@Column(name="department")
    public Department department;
	
	@Column(name="dimID1")
    public int dimID1;
	
	@Column(name="dimID2")
    public int dimID2;
	
	@Column(name="item")
    public String item;
	
	@Column(name="itemPic")
    public String itemPic;
	
	@Column(name="name")
    public String name;
    
	@Column(name="Catalog")
    public Catalog catalog;
}
