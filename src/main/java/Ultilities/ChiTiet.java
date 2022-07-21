/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ultilities;

/**
 *
 * @author Dell
 */
public class ChiTiet {

    private String soluong;

    private String tensanpham;

    public ChiTiet() {
    }

    public ChiTiet(String soluong, String tensanpham) {
        this.soluong = soluong;
        this.tensanpham = tensanpham;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }
    
}
