package com.example.czaszyciaaplikacji;

import androidx.lifecycle.ViewModel;

public class LicznikViewModel extends ViewModel {
    private int licznik = 0;

    public int getLicznik() {
        return licznik;
    }

    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }
    public void addLicznik(){
        licznik++;
    }
}
