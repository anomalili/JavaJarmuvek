/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jarmuvek.modell;

/**
 *
 * @author makra
 */
public abstract class Auto extends Jarmu {

    public Auto(boolean defekt, boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        super(beinditva, uzemanyag, megerkezett);
        this.defekt = defekt;
    }

    private boolean defekt;

    public void kereketCserel() {
        if (defekt = true) {
            defekt = false;
        }
    }

    public boolean halad() {
        if (uzemanyag = true && beinditva == true) {
            return true;
        } else {
            return false;
        }

    }
    
     public void leallit() {
        if (beinditva = true || uzemanyag == false) {
            beinditva = false;
        }
    }

}
