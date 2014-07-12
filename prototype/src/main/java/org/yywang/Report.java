package org.yywang;

/**
 * @author yywang
 */
public class Report implements Cloneable{

    private String name;

    private Product product;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    protected Object clone()  {
        Report report;
        try {
            report=(Report) super.clone();
            report.setProduct((Product)product.clone());
            return report;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
