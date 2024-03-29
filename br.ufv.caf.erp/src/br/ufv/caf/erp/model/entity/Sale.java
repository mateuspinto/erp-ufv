/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufv.caf.erp.model.entity;

import br.ufv.caf.erp.model.enums.SaleStatus;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author aslan
 */
public class Sale {
    private final int code;
    private final int clientCode;
    private final int addressCode;
    private SaleStatus saleStatus;
    
    private final ArrayList<ProductSold> products;
    
    private final LocalDate date;
    
    /**
     *
     * @param code
     * @param clientCode
     * @param addressCode
     * @param date
     * @param products
     */
    public Sale(int code, int clientCode, int addressCode, LocalDate date, ArrayList<ProductSold> products){
        this.code = code;
        this.clientCode = clientCode;
        this.addressCode = addressCode;
        saleStatus = SaleStatus.pending;
        this.date = date;
        this.products = products;
    }
    
    public int getCode(){
        return code;
    }

    /**
     * @return the clientCode
     */
    public int getClientCode() {
        return clientCode;
    }

    /**
     * @return the addressCode
     */
    public int getAddressCode() {
        return addressCode;
    }

    /**
     * @return the saleStatus
     */
    public SaleStatus getSaleStatus() {
        return saleStatus;
    }

    /**
     * @param saleStatus the saleStatus to set
     */
    public void setSaleStatus(SaleStatus saleStatus) {
        this.saleStatus = saleStatus;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @return the products
     */
    public ArrayList<ProductSold> getProducts() {
        return products;
    }
    
    public String toString(){
        return this.code+"";
    }
    
    
}
