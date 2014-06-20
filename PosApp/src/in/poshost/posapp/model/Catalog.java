package in.poshost.posapp.model;

import java.util.List;

import com.activeandroid.Model;
import com.activeandroid.annotation.Table;

@Table(name="Catalog")
public class Catalog extends Model {

    //auto increment id automatically generated
   
    public float sku;
    public int attributeId1;
    public int attributeId2;
    public String description;
    public float unitCost;
    public float margin;
    public boolean taxable;
    public float sellPrice;
    public boolean mustInputPrice;
    public boolean isDiscount;
    public int captureSerial;
    public int UPC;
    public boolean isActive;
    
    public List<Item> items() {
        return getMany(Item.class, "Category");
    }
    
    public List<Tax> taxes() {
        return getMany(Tax.class, "Category");
    }
}
