
package mz.co.scds.swing;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
//import mz.co.scds.form.Form_HProcess;
import mz.co.scds.model.StatusType;


public class Table extends JTable{
//     private Form_HProcess process;

    public Table() {
//        process = new Form_HProcess();
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header=new TableHeader(o + "");
                if(i1==4){
                header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
            
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                if(i1!=4){
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if(selected){
                    com.setForeground(new Color(56, 89, 128));
//                        System.out.println("Olá");
                   
                    }else{
//                        System.out.println("Olá");
                    com.setForeground(new Color(102, 102, 102));
                    }
                    return com;
                    
                }else{
                    StatusType type=(StatusType)o;
                    CellStatus cell=new CellStatus(type);
                    return cell;
                    
                } 
                
                
                
            }
            
            
        
        });
    }
    
    public void addRow(Object[]row ){
        DefaultTableModel model = (DefaultTableModel)getModel();
        model.addRow(row);
    }
    
    
    
}
