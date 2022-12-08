package mz.co.scds.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mz.co.scds.model.Model_Card;

public class CardPr extends javax.swing.JPanel {

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

    public CardPr(Color color1, Color color2, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel lbDataText, JLabel lbIconDisp, JLabel lbIconPraz, JLabel lbIconTime, JLabel lbPrazo, JLabel lbRg, JLabel lbTempo, JLabel lbValues) {
        this.color1 = color1;
        this.color2 = color2;
        this.lbProcesso = jLabel1;
        this.lbNomeDisponibilidade = jLabel2;
//        this.lbNomePrazo = jLabel3;
//        this.lbDataText = lbDataText;
        this.lbIconDisp = lbIconDisp;
//        this.lbIconPraz = lbIconPraz;
        this.lbIconTime = lbIconTime;
//        this.lbPrazo = lbPrazo;
        this.lbNomeRegisto = lbRg;
//        this.lbTempo = lbTempo;
//        this.lbValues = lbValues;
    }

//    public CardP(Color color1, Color color2, JLabel lbIcon, JLabel lbValues) {
//        this.color1 = color1;
//        this.color2 = color2;
//        this.lbIcon = lbIcon;
//        this.lbValues = lbValues;
//    }
    private Color color1;
    private Color color2;

    public CardPr() {
        initComponents();
        setOpaque(false);
        color1 = Color.WHITE;
        color2 = Color.WHITE;
    }

    public void setData(Model_Card data) {
//        lbPrazo.setText(data.getValues());
//        lbDataText.setText(data.getValues());
//        lbTempo.setText(data.getValues());
//        lbValues.setText(data.getValues());
        //falta o label do contador do processo

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbProcesso = new javax.swing.JLabel();
        lbIconTime = new javax.swing.JLabel();
        lbIconDisp = new javax.swing.JLabel();
        lbNomeRegisto = new javax.swing.JLabel();
        lbNomeDisponibilidade = new javax.swing.JLabel();
        button1 = new mz.co.scds.swing.Button();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        lbProcesso.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lbProcesso.setForeground(new java.awt.Color(139, 133, 133));
        lbProcesso.setText("Processo");

        lbIconTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/co/scds/icons/Process/calendario.png"))); // NOI18N

        lbIconDisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/co/scds/icons/Process/clock20.png"))); // NOI18N

        lbNomeRegisto.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbNomeRegisto.setForeground(new java.awt.Color(125, 122, 122));
        lbNomeRegisto.setText("Registo:");

        lbNomeDisponibilidade.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbNomeDisponibilidade.setForeground(new java.awt.Color(125, 122, 122));
        lbNomeDisponibilidade.setText("Disponibilidade:");

        button1.setBackground(new java.awt.Color(70, 103, 144));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Ver mais informações");
        button1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(157, 154, 154));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIconDisp)
                            .addComponent(lbIconTime, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeRegisto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNomeDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbProcesso))
                .addGap(188, 188, 188)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbProcesso)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbNomeRegisto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbIconTime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lbIconDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbNomeDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //cor da div menu
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

        super.paintComponent(grphcs);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mz.co.scds.swing.Button button1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbIconDisp;
    private javax.swing.JLabel lbIconTime;
    private javax.swing.JLabel lbNomeDisponibilidade;
    private javax.swing.JLabel lbNomeRegisto;
    private javax.swing.JLabel lbProcesso;
    // End of variables declaration//GEN-END:variables
}
