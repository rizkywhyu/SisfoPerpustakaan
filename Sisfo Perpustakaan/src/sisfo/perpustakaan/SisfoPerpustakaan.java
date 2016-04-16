/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfo.perpustakaan;

import Controller.ControllerHome;
import Controller.ControllerLoginAnggota;



/**
 *
 * @author DK
 */
public class SisfoPerpustakaan {

    public static void main(String[] args)  {
        Aplikasi apk = new Aplikasi();
        apk.addPetugas("a", " a", " a", 1);
        apk.addAnggota("b", "b", "b", "2", "04", "if", 2014);
        apk.addBuku("coa", "starling", 1990, "pelajaran", "3", true);
        apk.addBuku("rpl", "pressman", 2000, "pelajaran", "4", true);
//        apk.mainMenu();
        ControllerLoginAnggota controller = new ControllerLoginAnggota(apk);
        //ControllerHome controller = new ControllerHome(apk);
        
    }
}
