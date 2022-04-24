package com.rd.co.class2di.domain;

public class InvoiceRows {
    private Product product;
    private Integer quantity;
    private Integer finalPrice;

    public InvoiceRows(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Integer finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Integer calcFinalPrice(){
        setFinalPrice(product.getPrice()*quantity);
        return product.getPrice()*quantity;
    }
}
