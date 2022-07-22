/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import Repostory.KhachHangTruyVan;
import java.util.List;
/**
 *
 * @author admin
 */
public class KhachHangService {
    KhachHangTruyVan khachHangTruyVan;

    public KhachHangService() {
        khachHangTruyVan = new KhachHangTruyVan();
    }
    public List getList(){
        return khachHangTruyVan.getList();
    }
}
