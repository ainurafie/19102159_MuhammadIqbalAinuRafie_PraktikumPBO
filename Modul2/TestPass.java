package com.nama.praktikumpbo.pertemuan2.guided;

public class TestPass {
    int nomer1, nomer2;

    public TestPass(int nomer1, int nomer2) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }
    
    void calculate (int m, int n) {
        m = n * 10;
        n = n / 2;
    }
    
    void calculate (TestPass pass) {
        pass.nomer1 = pass.nomer1 * 10;
        pass.nomer2 = pass.nomer2 / 2;
    }
}
