/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufv.caf.erp.view.register;

import br.ufv.caf.erp.model.entity.Address;
import br.ufv.caf.erp.model.entity.Customer;
import br.ufv.caf.erp.model.entity.Product;
import br.ufv.caf.erp.model.entity.ProductSold;
import br.ufv.caf.erp.controller.ControllerCustomer;
import br.ufv.caf.erp.controller.ControllerProduct;
import br.ufv.caf.erp.controller.ControllerSales;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author aslan
 */
public class RegisterSale extends javax.swing.JFrame {
    private ControllerProduct ControllerProduct;
    private ControllerCustomer ControllerCustomer;
    private ControllerSales ControllerSales;
    private ArrayList<ProductSold> listProductSold;
    /**
     * Creates new form RegisterVenda
     */
    public RegisterSale(ControllerProduct ControllerProduct, ControllerCustomer ControllerCustomer, ControllerSales ControllerSales) {
        this.ControllerProduct=ControllerProduct;
        this.ControllerCustomer=ControllerCustomer;
        this.ControllerSales=ControllerSales;
        this.listProductSold=new ArrayList();
        initComponents();
        updateJComboBoxProducts();
        updateJComboBoxCustomers();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxCustomers = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxProducts = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSaleProducts = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxAddress = new javax.swing.JComboBox<>();
        jTextFieldQuantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro de Venda");

        jComboBoxCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCustomersActionPerformed(evt);
            }
        });

        jLabel2.setText("Clientes:");

        jLabel3.setText("Produtos:");

        jScrollPane1.setViewportView(jListSaleProducts);

        jLabel4.setText("Quantidade:");

        jLabel5.setText("Endereços:");

        jButton1.setText("Concluir Venda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Adicionar ao Carrinho");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Carrinho:");

        jLabel7.setText("Codigo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCode)
                    .addComponent(jComboBoxCustomers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxProducts, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxAddress, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldQuantity)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(jComboBoxProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCustomersActionPerformed
        this.updateJComboBoxAddress();
    }//GEN-LAST:event_jComboBoxCustomersActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultListModel lista = new DefaultListModel();
        Product selectedProduct=(Product)this.jComboBoxProducts.getSelectedItem();
        ProductSold productSale=new ProductSold(selectedProduct.getCode(), Integer.parseInt(this.jTextFieldQuantity.getText()));
        this.listProductSold.add(productSale);
        
        for(ProductSold productSold:this.listProductSold){
            lista.addElement(this.ControllerProduct.search(productSold.getProductCode()));
        }
   
        this.jListSaleProducts.setModel(lista);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.ControllerSales.sell(Integer.parseInt(this.jTextFieldCode.getText()), ((Customer)this.jComboBoxCustomers.getSelectedItem()).getCode(), 
                ((Address)this.jComboBoxAddress.getSelectedItem()).getCode(), ((Customer)this.jComboBoxCustomers.getSelectedItem()).getPassword(), 
                LocalDate.now(), this.listProductSold, this.ControllerCustomer, this.ControllerProduct);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void updateJComboBoxCustomers(){
        for(Customer customer: this.ControllerCustomer.getAllCustomers()){
            this.jComboBoxCustomers.addItem(customer);
        }
        
    }
    
    public void updateJComboBoxAddress(){
        for(Address address: ((Customer)this.jComboBoxCustomers.getSelectedItem()).getAllAddress()){
            this.jComboBoxAddress.addItem(address);
        }
        
    }
    
    public void updateJComboBoxProducts(){
        for(Product product: this.ControllerProduct.getAllProducts()){
            System.out.println(product);
            this.jComboBoxProducts.addItem(product);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Object> jComboBoxAddress;
    private javax.swing.JComboBox<Object> jComboBoxCustomers;
    private javax.swing.JComboBox<Object> jComboBoxProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<Object> jListSaleProducts;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCode;
    private javax.swing.JTextField jTextFieldQuantity;
    // End of variables declaration//GEN-END:variables
}
