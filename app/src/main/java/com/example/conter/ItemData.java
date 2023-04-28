package com.example.conter;

public class ItemData {
    private String nama_game;
    private  int logo_game;

    public ItemData(String nama_game, int logo_game) {
        this.nama_game = nama_game;
        this.logo_game = logo_game;
    }

    public String getNama_game() {
        return nama_game;
    }

    public void setNama_game(String nama_game) {
        this.nama_game = nama_game;
    }

    public int getLogo_game() {
        return logo_game;
    }

    public void setLogo_game(int logo_game) {
        this.logo_game = logo_game;
    }
}
