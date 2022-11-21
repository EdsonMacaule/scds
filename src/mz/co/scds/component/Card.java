
package mz.co.scds.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mz.co.scds.model.Model_Card;


public class Card extends javax.swing.JPanel {

    /**
     * @return the color1
     */
    public Color getColor1() {
        return color1;
    }

    /**
     * @param color1 the color1 to set
     */
    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    /**
     * @return the color2
     */
    public Color getColor2() {
        return color2;
    }

    /**
     * @param color2 the color2 to set
     */
    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Card(Color color1, Color color2, JLabel lbIcon, JLabel lbValues) {
        this.color1 = color1;
        this.color2 = color2;
        this.lbIcon = lbIcon;
        this.lbValues = lbValues;
    }

    

   private Color color1;
   private Color color2;
   
    public Card() {
        initComponents();
        setOpaque(false);
        color1 = Color.WHITE;
        color2 = Color.WHITE;
    }
    
    public void setData(Model_Card data){
   lbIcon.setIcon(data.getIcon());
   lbValues.setText(data.getValues());
    //falta o label do contador do processo
    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbValues = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/co/scds/icons/Process/encerrados.png"))); // NOI18N

        lbValues.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lbValues.setForeground(new java.awt.Color(94, 98, 120));
        lbValues.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbValues.setText("56");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbValues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(lbValues, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //cor da div menu
        GradientPaint g = new GradientPaint(0, 0,color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        
        super.paintComponent(grphcs); 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbValues;
    // End of variables declaration//GEN-END:variables
}
