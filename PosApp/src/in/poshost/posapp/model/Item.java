package in.poshost.posapp.model;

import com.activeandroid.Model;

public class Item extends Model {
  //auto increment id automatically generated
    public Department department;
    public int dimID1;
    public int dimID2;
    public String item;
    public String itemPic;
    
    public Catalog catalog;
}
