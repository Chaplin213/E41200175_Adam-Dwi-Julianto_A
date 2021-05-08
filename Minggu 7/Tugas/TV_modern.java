/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7_1;

/**
 *
 * @author ADAM
 */
public class TV_modern extends tv {
        public TV_modern(String n, String deskripsi, int TChannel) {
        super(n, deskripsi, TChannel);
    }
    
    static String TELETxt = "Teletxt";
    static String TV = "Televisi";
    
    public void setModusTampilan(String t) {
        this.TELETxt = t;
    }
    
    public void getModusTampilan() {
        System.out.println("Modus tampilan : " + TV);
    }
    
    public void setHlmnTeletxt(int t) {
        System.out.println("Berpindah ke-teletext " + t);
    }
    
    //    CD
    
    String cd = "";
    public void setDiscTray(String d) {
        this.cd = d;
    }
    
    public void playcd() {
        if (cd.equals("")) {
            System.out.println("CD tidak ditemukan");
        } else {
            System.out.println("Memutar film " + cd);
        }
    }
    
    
    public static void main(String[] args) {
        
        TV_modern Panasonic = new TV_modern("Adam", "TV jumbo Panasonic, Warna Putih", 11);
 
        String[] channel = {"SCTV", "METROTV","TransTV" , "RCTI", "GlobalTV",
                             "KompasTV", "MNCTV", "JTV", "Adam punya", 
                             "Indosiar","ANTV"};
        
        
        Panasonic.getdeskripsi();
        Panasonic.getchannel();
        Panasonic.setchannel(channel);
        Panasonic.setCAktif(2);
        Panasonic.setvlm(80);
        Panasonic.setCAktif(6);
        Panasonic.setCAktif(8);
        Panasonic.setModusTampilan(TV_modern.TELETxt);
        Panasonic.setHlmnTeletxt(225);
        Panasonic.setModusTampilan(TV_modern.TV);
        Panasonic.playcd();
        Panasonic.setDiscTray("DIVERGENT");
        Panasonic.playcd();
        
    }
}

