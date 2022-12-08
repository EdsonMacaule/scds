package mz.co.scds.form;


import java.awt.Color;
import mz.co.scds.model.Model_CardP;
import mz.co.scds.model.StatusType;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import mz.co.scds.swing.ScrollBar;


public class Form_HProcess extends javax.swing.JPanel {

    public Form_HProcess() {
        initComponents();
        //Preenchendo os cards do wordkspace
//        card1.setData(new ModelCard("New Student", 5100, 20, icon1));
//        card1.setData(new Model_CardP("20 Nov 2022", "null", "null"));
//        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/mz/co/scds/icons/Process/calendar.png",))));
//        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/mz/co/scds/icons/Process/encerrados.png")),"40"));
//        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/mz/co/scds/icons/Process/andamento.png")),"20"));
//        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/mz/co/scds/icons/Process/atrasado.png")),"10"));
//        // add Row table
//        spTable.setVerticalScrollBar(new ScrollBar());
//        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
//        JPanel p=new JPanel();
//        p.setBackground(Color.WHITE);
//        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
//        spTable.getViewport().setBackground(Color.WHITE);
//        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Encerrado,"100%"});
//        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Out,2022","04 Nov,2022", StatusType.Atrasado,"60%"});
//        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Out,2022","04 Nov,2022", StatusType.Atrasado,"100%"});
//        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Em_Progresso,"10%"});
//        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Em_Progresso,"0%"});
//        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Em_Progresso,"1%"});
//        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Em_Progresso,"20%"});
//        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Encerrado,"100%"});
//        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Out,2022","04 Nov,2022", StatusType.Atrasado,"50%"});
//        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Encerrado,"100%"});
//        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Encerrado,"100%"});
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table1 = new mz.co.scds.swing.Table();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JLayeredPane();
        cardP1 = new mz.co.scds.component.CardP();
        cardPr1 = new mz.co.scds.component.CardPr();
        panelBorder1 = new mz.co.scds.swing.PanelBorder();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        button1 = new mz.co.scds.swing.Button();
        button2 = new mz.co.scds.swing.Button();
        button3 = new mz.co.scds.swing.Button();
        button4 = new mz.co.scds.swing.Button();
        button5 = new mz.co.scds.swing.Button();
        button7 = new mz.co.scds.swing.Button();
        button8 = new mz.co.scds.swing.Button();
        button9 = new mz.co.scds.swing.Button();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 245, 247));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 66, 84));
        jLabel1.setText("Processos");

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 98, 120));
        jLabel2.setText("Área de Trabalho");

        panel.setBackground(new java.awt.Color(245, 248, 250));
        panel.setLayout(new java.awt.GridLayout(1, 0, 20, 0));
        panel.add(cardP1);
        panel.add(cardPr1);

        panelBorder1.setBackground(new java.awt.Color(181, 179, 179));
        panelBorder1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 150, 150));
        jLabel3.setText("Tarefas");

        button1.setBackground(new java.awt.Color(70, 103, 144));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Verificação");
        button1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(70, 103, 144));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("1ª Entrevista");
        button2.setEnabled(false);
        button2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        button3.setBackground(new java.awt.Color(70, 103, 144));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Entrevista de Testemunhas");
        button3.setEnabled(false);
        button3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        button4.setBackground(new java.awt.Color(70, 103, 144));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("2ª Entrevista");
        button4.setEnabled(false);
        button4.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        button5.setBackground(new java.awt.Color(70, 103, 144));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("Apoio de Salvaguardas");
        button5.setEnabled(false);
        button5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        button7.setBackground(new java.awt.Color(70, 103, 144));
        button7.setForeground(new java.awt.Color(255, 255, 255));
        button7.setText("Matriz de Equilibrio e Probalidades");
        button7.setEnabled(false);
        button7.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        button8.setBackground(new java.awt.Color(70, 103, 144));
        button8.setForeground(new java.awt.Color(255, 255, 255));
        button8.setText("Relatório de Averiguação");
        button8.setEnabled(false);
        button8.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        button9.setBackground(new java.awt.Color(70, 103, 144));
        button9.setForeground(new java.awt.Color(255, 255, 255));
        button9.setText("Relatório de Averiguação");
        button9.setEnabled(false);
        button9.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(495, 495, 495))
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 66, 84));
        jLabel4.setText("Linha de Tempo");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(125, 124, 124));
        jLabel5.setText("Histórico das tarefas executadas neste processo.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mz.co.scds.swing.Button button1;
    private mz.co.scds.swing.Button button2;
    private mz.co.scds.swing.Button button3;
    private mz.co.scds.swing.Button button4;
    private mz.co.scds.swing.Button button5;
    private mz.co.scds.swing.Button button7;
    private mz.co.scds.swing.Button button8;
    private mz.co.scds.swing.Button button9;
    private mz.co.scds.component.CardP cardP1;
    private mz.co.scds.component.CardPr cardPr1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLayeredPane panel;
    private mz.co.scds.swing.PanelBorder panelBorder1;
    private mz.co.scds.swing.Table table1;
    // End of variables declaration//GEN-END:variables
}
