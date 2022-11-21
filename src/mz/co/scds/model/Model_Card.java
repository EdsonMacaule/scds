
package mz.co.scds.model;

import javax.swing.Icon;


public class Model_Card {

    /**
     * @return the icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    /**
     * @return the Values
     */
    public String getValues() {
        return Values;
    }

    /**
     * @param Values the Values to set
     */
    public void setValues(String Values) {
        this.Values = Values;
    }

    public Model_Card(Icon icon, String Values) {
        this.icon = icon;
        this.Values = Values;
    }

    public Model_Card() {
    }

    private Icon icon;
    private String Values;
   
 
    
}
