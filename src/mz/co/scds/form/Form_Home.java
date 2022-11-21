package mz.co.scds.form;


import java.awt.Color;
import mz.co.scds.model.Model_Card;
import mz.co.scds.model.StatusType;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import mz.co.scds.swing.ScrollBar;


public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        //Preenchendo os cards do wordkspace
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/mz/co/scds/icons/Process/encerrados.png")),"40"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/mz/co/scds/icons/Process/andamento.png")),"20"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/mz/co/scds/icons/Process/atrasado.png")),"10"));
        // add Row table
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        JPanel p=new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        spTable.getViewport().setBackground(Color.WHITE);
        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Encerrado,"100%"});
        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Out,2022","04 Nov,2022", StatusType.Atrasado,"60%"});
        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Out,2022","04 Nov,2022", StatusType.Atrasado,"100%"});
        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Em_Progresso,"10%"});
        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Em_Progresso,"0%"});
        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Em_Progresso,"1%"});
        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Em_Progresso,"20%"});
        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Encerrado,"100%"});
        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Out,2022","04 Nov,2022", StatusType.Atrasado,"50%"});
        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Encerrado,"100%"});
        table.addRow(new Object[]{"AB0005-Montepuez","Secretariado","12 Nov,2022","20 Nov,2022", StatusType.Encerrado,"100%"});
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table1 = new mz.co.scds.swing.Table();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JLayeredPane();
        card1 = new mz.co.scds.component.Card();
        card2 = new mz.co.scds.component.Card();
        card3 = new mz.co.scds.component.Card();
        panelBorder1 = new mz.co.scds.swing.PanelBorder();
        jLabel3 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new mz.co.scds.swing.Table();

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 66, 84));
        jLabel1.setText("Processos");

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 98, 120));
        jLabel2.setText("Área de Trabalho");

        panel.setBackground(new java.awt.Color(245, 248, 250));
        panel.setLayout(new java.awt.GridLayout(1, 0, 20, 0));
        panel.add(card1);
        panel.add(card2);
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(127, 127, 127));
        jLabel3.setText("Processos");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Proc", "Proveniencia", "Data de Chegada", "Prazo", "Estado", "Percentagem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mz.co.scds.component.Card card1;
    private mz.co.scds.component.Card card2;
    private mz.co.scds.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane panel;
    private mz.co.scds.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private mz.co.scds.swing.Table table;
    private mz.co.scds.swing.Table table1;
    // End of variables declaration//GEN-END:variables
}
