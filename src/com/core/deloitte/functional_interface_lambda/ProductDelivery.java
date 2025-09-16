package com.core.deloitte.functional_interface_lambda;

import java.util.Arrays;
import java.util.List;

interface ProdDelivery {
    public boolean fDelv(Product p);
}

public class ProductDelivery {
    public static void main(String[] args) {
        List<Product> pr = Arrays.asList(
            new Product(101, "Marker", 300, 10),
            new Product(102, "Pen", 30, 15),
            new Product(103, "Pencil", 20, 4),
            new Product(104, "Ink", 50, 0),
            new Product(105, "Scale", 30, 10),
            new Product(106, "Book", 500, 20),
            new Product(107, "Copy", 100, 2),
            new Product(108, "Eraser", 3, 8)
        );

        ProdDelivery outOfStock = (p) -> p.getpStock() == 0;
        ProdDelivery lowOnStock = (p) -> p.getpStock() > 0 && p.getpStock() <= 5;
        ProdDelivery isOnStock = (p) -> p.getpStock() > 5;

        System.out.println("Out of Stock:");
        for (Product prd : pr) {
            if (outOfStock.fDelv(prd)) {
                System.err.println(prd);
            }
        }

        System.out.println("\nLow on Stock:");
        for (Product prd : pr) {
            if (lowOnStock.fDelv(prd)) {
                System.err.println(prd);
            }
        }

        System.err.println("\nStock Available:");
        for (Product p : pr) {
            if (isOnStock.fDelv(p)) {
                System.out.println(p);
            }
        }
    }
}

//package com.core.deloitte.functional_interface_lambda;
//
//import java.util.Arrays;
//import java.util.List;
//
//interface ProdDelivery{
//	public boolean fDelv(Product p);
//}
//
//public class ProductDelivery {
//	public static void main(String[] args) {
//		List<Product> pr=Arrays.asList(
//				new Product(101,"Marker",10,300),  // should be (id, name, stock, price)
//				new Product(102,"Pen",15,30),
//				new Product(103,"Pencil",4,20),
//				new Product(104,"Ink",0,50),
//				new Product(105,"Scale",10,30),
//				new Product(106,"Book",20,500),
//				new Product(107,"Copy",2,100),
//				new Product(108,"Eraser",8,3));
//
//		ProdDelivery outOfStock=(p)->{
//			return p.getpStock()==0;
//		};
//		ProdDelivery lowOnStock=(p)->{
//		    return p.getpStock()>0 && p.getpStock()<=5; 
//		};
//		ProdDelivery isOnStock=(p)->{
//		    return p.getpStock()>5;
//		};
//
//		System.err.println("Out of Stock:");
//		for(Product prd:pr) {
//			if(outOfStock.fDelv(prd)) {
//				System.out.println(prd);
//			}
//		}
//		System.err.println("Low on Stock:");
//		for(Product prd:pr) {
//			if(lowOnStock.fDelv(prd)) {
//				System.out.println(prd);
//			}
//		}
//		System.err.println("Stock Available:");
//		for(Product p:pr) {
//			if(isOnStock.fDelv(p)) {
//				System.out.println(p);
//			}
//		}
//	}
//}
