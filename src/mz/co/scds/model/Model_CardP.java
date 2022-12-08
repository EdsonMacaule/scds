package mz.co.scds.model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Model_CardP {

    /**
     * @return the DataRegisto
     */
    public String getDataRegisto() {
        return DataRegisto;
    }

    /**
     * @param DataRegisto the DataRegisto to set
     */
    public void setDataRegisto(String DataRegisto) {
        this.DataRegisto = DataRegisto;
    }

    /**
     * @return the DiasDisponiveis
     */
    public String getDiasDisponiveis() {
        return DiasDisponiveis;
    }

    /**
     * @param DiasDisponiveis the DiasDisponiveis to set
     */
    public void setDiasDisponiveis(String DiasDisponiveis) {
        this.DiasDisponiveis = DiasDisponiveis;
    }

    /**
     * @return the DataPrazo
     */
    public String getDataPrazo() {
        return DataPrazo;
    }

    /**
     * @param DataPrazo the DataPrazo to set
     */
    public void setDataPrazo(String DataPrazo) {
        this.DataPrazo = DataPrazo;
    }

    public Model_CardP(String DataRegisto, String DiasDisponiveis, String DataPrazo) {
        this.DataRegisto = DataRegisto;
        this.DiasDisponiveis = DiasDisponiveis;
        this.DataPrazo = DataPrazo;
    }

    public Model_CardP() {
    }

    private String DataRegisto;
    private String DiasDisponiveis;
    private String DataPrazo;

//    public Icon toIcon() {
//        return new ImageIcon(getClass().getResource("/mz/co/scds/icons/Sidebar/" + iconR + ".png"));
//// return new ImageIcon(getClass().getResource("/mz/co/scds/icons/Sidebar/" + icon + ".png"));
//// return new ImageIcon(getClass().getResource("/mz/co/scds/icons/Sidebar/" + icon + ".png"));
//    }
}
