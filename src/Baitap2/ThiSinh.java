package Baitap2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ThiSinh {
    protected String Sobaodanh;
    protected String Hoten;
    protected String Diachi;
    protected int Mucuutien;

    public ThiSinh(String sobaodanh, String hoten, String diachi, int mucuutien) {
        this.Sobaodanh = sobaodanh;
        this.Hoten = hoten;
        this.Diachi = diachi;
        this.Mucuutien = mucuutien;
    }
    public String getSobaodanh() {
        return Sobaodanh;
    }
    public void setSobaodanh(String sobaodanh) {
        this.Sobaodanh = sobaodanh;
    }
    public String getHoten() {
        return Hoten;
    }
    public void setHoten(String hoten) {
        this.Hoten = hoten;
    }
    public String getDiachi() {
        return Diachi;
    }
    public void setDiachi(String diachi) {
        this.Diachi = diachi;
    }
    public int getMucuutien() {
        return Mucuutien;
    }
    public void setMucuutien(int mucuutien) {
        this.Mucuutien = mucuutien;
    }
}
