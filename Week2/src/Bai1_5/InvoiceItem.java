package Bai1_5;

public class InvoiceItem {
	String id,desc;
	int qty;
	double unitPrice;
	
	public InvoiceItem(String i,String desc,int qty,double unitPrice) {
		this.id=i;
		this.desc=desc;
		this.qty=qty;
		this.unitPrice=unitPrice;
	}
	
	public String getId() {
		return id;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getTotal() {
		return this.unitPrice*qty;
	}
	
	public String toString() {
		return "InvoiceItem[id="+this.id+",desc="+this.desc+",qty="+this.qty+",unitPrice="+this.unitPrice+"]";
	}
	
}
