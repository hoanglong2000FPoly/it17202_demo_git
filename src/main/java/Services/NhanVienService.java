/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Repostory.NhanVienTruyVan;
import java.util.List;

/**
 *
 * @author admin
 */
public class NhanVienService {
    NhanVienTruyVan nhanVienTruyVan;

    public NhanVienService() {
        nhanVienTruyVan = new NhanVienTruyVan();
    }
    public List getList(){
      return nhanVienTruyVan.getList();
    }
}
