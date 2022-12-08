package mz.co.scds.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mz.co.scds.model.Model_Card;

public class CardN extends javax.swing.JPanel {

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

    public CardN(Color color1, Color color2, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel lbDataText, JLabel lbIconDisp, JLabel lbIconPraz, JLabel lbIconTime, JLabel lbPrazo, JLabel lbRg, JLabel lbTempo, JLabel lbValues) {
//        this.color1 = color1;
//        this.color2 = color2;
//        this.lbProcesso = jLabel1;
//        this.lbNomeDisponibilidade = jLabel2;
//        this.lbNomePrazo = jLabel3;
//        this.lbDataText = lbDataText;
//        this.lbIconDisp = lbIconDisp;
//        this.lbIconPraz = lbIconPraz;
//        this.lbIconTime = lbIconTime;
//        this.lbPrazo = lbPrazo;
//        this.lbNomeRegisto = lbRg;
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

    public CardN() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        button1 = new mz.co.scds.swing.Button();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/co/scds/icons/pasta1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 66, 100));
        jLabel2.setText("Alocação no projecto");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(142, 140, 140));
        jLabel3.setText("O Oficial de Reclamações (Justino) alocou-lhe uma nova reclamação ABC00005");

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 149, 149));
        jLabel5.setText("Edson Macaule");

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(192, 189, 189));
        jLabel6.setText("Hoje, 25 de Novembro");

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(192, 189, 189));
        jLabel7.setText("2 ficheiros anexos");

        button1.setBackground(new java.awt.Color(70, 103, 144));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Abrir o processo");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/co/scds/icons/anexo15.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
