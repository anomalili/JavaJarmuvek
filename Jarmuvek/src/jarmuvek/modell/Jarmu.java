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

    public boolean isBeinditva() {
        return beinditva;
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public boolean isMegerkezett() {
        return megerkezett;
    }

    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;

    public void beindit() {
    }

    public void leallit() {
    }

    public void tankol() {
    }

    @Override
    public String toString() {
        return "Jarmu{" + "beinditva=" + beinditva + ", uzemanyag=" + uzemanyag + ", megerkezett=" + megerkezett + '}';
    }

    public boolean halad() {
        return true;
    }
}
