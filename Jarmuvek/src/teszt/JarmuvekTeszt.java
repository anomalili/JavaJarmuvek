/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teszt;

import jarmuvek.modell.Auto;
import jarmuvek.modell.Jarmu;

public class JarmuvekTeszt {

    public static void main(String[] args) {
        new JarmuvekTeszt();
    }

    public JarmuvekTeszt() {
        mintaTeszt();
        haladTeszt();
        haladbeinditassal();
        haladbeinditasNlk();
        benzinNelkulElindul();
        benzinnelElindul();
        defekttelNincsenhaladas();
        defektnelNemFogyElAzUzemanyag();
        MegerkezesnelElfogyAzUzemanyag();
        csakLeallitvaTankol();

    }

    public void mintaTeszt() {
        int kapott = 7;
        int vart = 4;
        assert kapott == vart : "nem egyeznek";
    }

    private void haladTeszt() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "nem tud haladni";

    }

    private void haladbeinditassal() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "nem tud menni beinditva";

    }

    private void haladbeinditasNlk() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "halad beinditas nelk.. ";
    }

    private void benzinNelkulElindul() {
        Auto auto = new Auto();
        auto.isUzemanyag();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "halad benzin nelkul";
    }

    private void benzinnelElindul() {
        Auto auto = new Auto();
        auto.isUzemanyag();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "halad benzinnel";
    }

    private void defekttelNincsenhaladas() {
        Auto auto = new Auto();
        auto.isDefekt();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "halad defekttel";

    }

    private void defektnelNemFogyElAzUzemanyag() {
        Auto auto = new Auto();
        auto.isDefekt();
        auto.isUzemanyag();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "halad benzin nélkül, defektesen";

    }

    private void MegerkezesnelElfogyAzUzemanyag() {
        Auto auto = new Auto();
        auto.isMegerkezett();
        auto.isUzemanyag();
        boolean kapott = auto.isUzemanyag();
        boolean vart = false;
        assert kapott == vart : "örök benzin, nem fogy el";

    }

    private void csakLeallitvaTankol() {
        Auto auto = new Auto();
        auto.isBeinditva();
        boolean kapott = auto.isBeinditva();
        boolean vart = false;
        assert kapott == vart : "nem tankolunk járó motorral";
    }

}
