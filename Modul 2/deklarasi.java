package com.nama.praktikumpbo.pertemuan2.unguided;

public class deklarasi {
    String nama, vision;
    
    public deklarasi() {}

    
    public deklarasi(String nama) {
        this.nama = nama;
    }

    public deklarasi(String nama, String vision) {
        this.nama = nama;
        this.vision = vision;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {

        if(nama.isEmpty() || nama == null){
            this.nama = "no name";
        }else{
            this.nama = nama;
        }
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        if(vision.isEmpty() || vision == null){
            this.vision = "no vision";
        }else{
            this.vision = vision;
        } 
    }
}
