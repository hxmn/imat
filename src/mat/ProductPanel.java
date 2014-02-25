/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mat;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author Joakim
 */
public class ProductPanel extends javax.swing.JPanel {
    private Product product;

    /**
     * Creates new form ProductPanel
     */
    public ProductPanel() {
        initComponents();
    }
    
    public ProductPanel(Product product, ImageIcon image){
        this();
        this.product = product;
        productTitle.setText(product.getName());
        productImage.setIcon(image);
        productPrice.setText("" + product.getPrice());
        productUnit.setText(product.getUnit());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productTitle = new javax.swing.JLabel();
        productImage = new javax.swing.JLabel();
        productAmount = new javax.swing.JSpinner();
        buyButton = new javax.swing.JButton();
        productPrice = new javax.swing.JLabel();
        productUnit = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(230, 230, 230)));

        productTitle.setFont(new java.awt.Font("Proxima Nova Rg", 0, 24)); // NOI18N
        productTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productTitle.setText("PRODUKT");

        productImage.setBackground(new java.awt.Color(255, 255, 255));
        productImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productImage.setOpaque(true);

        productAmount.setFont(new java.awt.Font("Proxima Nova Rg", 0, 20)); // NOI18N
        productAmount.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), null, Integer.valueOf(50), Integer.valueOf(1)));

        buyButton.setBackground(new java.awt.Color(0, 102, 255));
        buyButton.setFont(new java.awt.Font("Proxima Nova Rg", 0, 18)); // NOI18N
        buyButton.setForeground(new java.awt.Color(240, 240, 240));
        buyButton.setText("Köp");
        buyButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 220, 220), 3));
        buyButton.setContentAreaFilled(false);
        buyButton.setOpaque(true);
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        productPrice.setFont(new java.awt.Font("Proxima Nova Rg", 0, 22)); // NOI18N
        productPrice.setText("100");

        productUnit.setFont(new java.awt.Font("Proxima Nova Rg", 0, 22)); // NOI18N
        productUnit.setText("kr/st");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productUnit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(productAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(productImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productImage, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productUnit)
                    .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productPrice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyButton;
    private javax.swing.JSpinner productAmount;
    private javax.swing.JLabel productImage;
    private javax.swing.JLabel productPrice;
    private javax.swing.JLabel productTitle;
    private javax.swing.JLabel productUnit;
    // End of variables declaration//GEN-END:variables

    public void addBuyListeners(ActionListener actionListener){
        buyButton.addActionListener(actionListener);
    }
    
    public double getAmount(){
        return (Double)productAmount.getValue();
    }
    
    public Product getProduct(){
        return product;
    }
}
