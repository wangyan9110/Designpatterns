package org.yywang;

public class App {
    public static void main( String[] args ){
       Report report=new Report();
        Product product=new Product();
        product.setModel(1);
        product.setName("productName");
        report.setName("某某产品报表");
        report.setProduct(product);
        System.out.println(report.getName()+"|"+report.getProduct().getName());
        Report report1=(Report)report.clone();
        report1.setName("某某产品报表组1");
        report1.getProduct().setName("产品1");
        System.out.println(report1.getName()+"|"+report1.getProduct().getName());
        System.out.println(report.getName()+"|"+report.getProduct().getName());
    }
}
