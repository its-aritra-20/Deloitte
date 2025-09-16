package com.core.deloitte.functional_interface_lambda;
//package com.core.deloitte.functional_interface_lambda;

public class Product {
    private int pId;
    private String pName;
    private int pPrice;
    private int pStock;

    // Constructor (id, name, price, stock)
    public Product(int pId, String pName, int pPrice, int pStock) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pStock = pStock;
    }

    public int getpId() {
        return pId;
    }
    public void setpId(int pId) {
        this.pId = pId;
    }
    public String getpName() {
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    public int getpPrice() {
        return pPrice;
    }
    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }
    public int getpStock() {
        return pStock;
    }
    public void setpStock(int pStock) {
        this.pStock = pStock;
    }

    @Override
    public String toString() {
        return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pStock=" + pStock + "]";
    }
}

//
//public class Product {
//	private int pId;
//	private String pName;
//	private int pPrice;
//	private int pStock;
//	
//	
//	public Product(int pId, String pName,int pStock,int pPrice) {
//		super();
//		this.pId = pId;
//		this.pName = pName;
//		this.pPrice = pPrice;
//		this.pStock = pStock;
//	}
//	public int getpId() {
//		return pId;
//	}
//	public void setpId(int pId) {
//		this.pId = pId;
//	}
//	public String getpName() {
//		return pName;
//	}
//	public void setpName(String pName) {
//		this.pName = pName;
//	}
//	public int getpPrice() {
//		return pPrice;
//	}
//	public void setpPrice(int pPrice) {
//		this.pPrice = pPrice;
//	}
//	public int getpStock() {
//		return pStock;
//	}
//	public void setpStock(int pStock) {
//		this.pStock = pStock;
//	}
//	@Override
//	public String toString() {
//		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pStock=" + pStock + "]";
//	}
//	
//	
//}
