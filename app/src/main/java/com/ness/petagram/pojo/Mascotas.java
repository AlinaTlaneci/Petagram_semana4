package com.ness.petagram.pojo;

public class Mascotas {
    private String nombre;
    private int    imgMascota;
    private String txtvVotos;

    public Mascotas(int imgMascota, String nombre){
        this.imgMascota = imgMascota;
        this.nombre     = nombre;
    }
    
    public Mascotas(int imgMascota, String nombre, String txtvVotos){
        this.imgMascota = imgMascota;
        this.nombre     = nombre;
        this.txtvVotos  = txtvVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImgMascota() {
        return imgMascota;
    }

    public void setImgMascota(int imgMascota) {
        this.imgMascota = imgMascota;
    }
    public String getTxtvVotos() {
        return txtvVotos;
    }

    public String setTxtvVotos(String txtvVotos) {
        this.txtvVotos = txtvVotos;
        return txtvVotos;
    }
}
