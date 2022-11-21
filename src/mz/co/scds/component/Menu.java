package mz.co.scds.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import mz.co.scds.event.EventMenuSelected;
import mz.co.scds.model.Model_Menu;

public class Menu extends javax.swing.JPanel {

    private EventMenuSelected event;

    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }
    
    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }

    //Adicionado itens ao Menu
    private void init() {
        listMenu1.addItem(new Model_Menu("dashboard", "Área de Trabalho", Model_Menu.MenuType.MENU));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("notifi", "Notificações", Model_Menu.MenuType.MENU));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("logout", "Logout", Model_Menu.MenuType.MENU));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
//        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("config", "Configurações", Model_Menu.MenuType.MENU));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new mz.co.scds.swing.ListMenu<>();

        PanelMoving.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/co/scds/icons/OGM.png"))); // NOI18N

        javax.swing.GroupLayout PanelMovingLayout = new javax.swing.GroupLayout(PanelMoving);
        PanelMoving.setLayout(PanelMovingLayout);
        PanelMovingLayout.setHorizontalGroup(
            PanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        PanelMovingLayout.setVerticalGroup(
            PanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents
//Div do menu

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //cor da div menu
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#385980"), 0, getHeight(), Color.decode("#385980"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs); // 
    }

    private int x;
    private int y;

    //Movendo a Janela pelo Menu
    public void initMoving(JFrame fram) {
        PanelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        PanelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMoving;
    private javax.swing.JLabel jLabel1;
    private mz.co.scds.swing.ListMenu<String> listMenu1;
    // End of variables declaration//GEN-END:variables
}
