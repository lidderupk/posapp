package in.poshost.posapp.model;

import java.util.List;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

public class Catalog extends Model {

    //auto increment id automatically generated
   
	@Column(name="sku")
    public float sku;
	
	@Column(name="attributeId1")
    public int attributeId1;
	
	@Column(name="attributeId2")
    public int attributeId2;
	
    @Column(name="description")
    public String description;
    
    @Column(name="unitCost")
    public float unitCost;
    
    @Column(name="margin")
    public float margin;
    
    @Column(name="taxable")
    public boolean taxable;
    
    @Column(name="sellPrice")
    public float sellPrice;
    
    @Column(name="mustInputPrice")
    public boolean mustInputPrice;
    
    @Column(name="isDiscount")
    public boolean isDiscount;
    
    @Column(name="captureSerial")
    public int captureSerial;
    
    @Column(name="UPC")
    public int UPC;
    
    @Column(name="isActive")
    public boolean isActive;
    
    public List<Item> items() {
        return getMany(Item.class, "Catalog");
    }
    
    public List<Tax> taxes() {
        return getMany(Tax.class, "Catalog");
    }
}
