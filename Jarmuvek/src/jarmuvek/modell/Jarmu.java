/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jarmuvek.modell;

/**
 *
 * @author makra
 */
public class Jarmu {

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        this.beinditva = beinditva;
        this.uzemanyag = uzemanyag;
        this.megerkezett = megerkezett;
    }

    public Jarmu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isBeinditva() {
        return beinditva;
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public boolean isMegerkezett() {
        return megerkezett;
    }

    boolean beinditva;
    boolean uzemanyag;
    private boolean megerkezett;

    public void beindit() {
        if (uzemanyag == true && beinditva == false) {
            beinditva = true;
        }
    }

    public void leallit() {
        if (beinditva = true || uzemanyag == false) {
            beinditva = false;
        }
    }

    public boolean tankol() {
        if (uzemanyag = false && beinditva == false) {
            uzemanyag = true;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Jarmu{" + "beinditva=" + beinditva + ", uzemanyag=" + uzemanyag + ", megerkezett=" + megerkezett + '}';
    }

    public boolean halad() {
        if (uzemanyag = true && beinditva == true) {
            return true;
        } else {
            return false;
        }
    }
}
