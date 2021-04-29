package com.iqbal.praktikumpbo.pertemuan2.guided;

public class mahasiswa {
    String nama;
    int nim;
    
    public mahasiswa() {}
    
    public mahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
