/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7_1;

public class tv {
    String deskripsi = "";
    int Totalchannel = 0;
    String[] channel = new String[Totalchannel];
    int CAktif = 0;
    int vlm = 0;
    String pembeli = "";
    
    // constructor (Method Khusus)
    tv(final String n, final String deskripsi, final int Totalchannel) {
        this.pembeli = n;
        this.deskripsi = deskripsi;
        this.Totalchannel = Totalchannel;
    }
    
    // set deskripsi
    public void getdeskripsi() { 
        System.out.println(pembeli + " membeli " + deskripsi);
    }
    
    // set channel
    public void setchannel(String[] channel) {
        if (channel.length > this.Totalchannel) {
            System.out.println("Tv ini hanya dapat menyimpan " + this.Totalchannel + " channel");
        } else {
            this.channel = channel;
            System.out.println("Informasi channel anda berhasil diupdate!");
        }
    }
    
    // channel aktif
    public void getchannel() {
        if(this.channel.length == 0) {
            System.out.println("Belum ada channel yang diseting!");
        } else {
            String data = "";
            for (String chnl : this.channel) {
                data += chnl + " ";
            }
            System.out.println("Channel yang ada : [ " + data + "]");
        }
    }
    
    // set channel aktif
    public void setCAktif(int x) {
        this.CAktif = x;
        int data = x;
        System.out.println("Pindah ke-channel : " + this.channel[x-1]);
    }
    
    // set volume
    public void setvlm(int v) {
        System.out.println("Volume sekarang : " + v);
    }
    
    
}
class User {
    public static void main(String[] args) {
        
        tv Panasonic = new tv("Adam", "TV jumbo Panasonic, Warna Putih", 11);
        String[]  channel = {"SCTV", "METROTV","TransTV" , "RCTI", "GlobalTV",
                             "KompasTV", "MNCTV", "JTV", "Adam punya", 
                             "Indosiar","ANTV"};
            
        Panasonic.getdeskripsi();
        Panasonic.getchannel();
        Panasonic.setchannel(channel);
        
        Panasonic.setCAktif(7);
        Panasonic.setvlm(80);
        Panasonic.setCAktif(10);
        
    }
}