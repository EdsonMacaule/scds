
package mz.co.scds.swing ;

import mz.co.scds.model.StatusType;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class TableStatus extends JLabel{

    /**
     * @return the type
     */
    public StatusType getType() {
        return type;
    }

    public TableStatus() {
        setForeground(Color.WHITE);
        
    }
    private StatusType type;
    
    public void setType(StatusType type){
        this.type=type;
        setText(type.toString());
        repaint();
}

    @Override
    protected void paintComponent(Graphics grphcs) {
       if(type!=null){
           Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g ;
        if(type==StatusType.Encerrado){
           g = new GradientPaint(0, 0, new Color(71, 190, 125), 0, getHeight(), new Color(71, 190, 125));
        }else if(type==StatusType.Atrasado){
            g = new GradientPaint(0, 0, new Color(241, 188, 0), 0, getHeight(), new Color(241, 188, 0));
        
        }else{
        g = new GradientPaint(0, 0, new Color(255, 20, 58), 0, getHeight(), new Color(255, 20, 58));
        }
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 1, 1);
       }
        super.paintComponent(grphcs); 
    }
    
    
}
//