/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jarmuvek.modell;

/**
 *
 * @author makra
 */
public class Auto extends Jarmu {

    public Auto(boolean defekt, boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        super(beinditva, uzemanyag, megerkezett);
        this.defekt = defekt;
    }

    public Auto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isDefekt() {
        return defekt;
    }

    private boolean defekt;

    public void kereketCserel() {
        if (defekt = true) {
            defekt = false;
        }
    }

    @Override
    public boolean halad() {
        super.halad();
        return true;
    }

}
