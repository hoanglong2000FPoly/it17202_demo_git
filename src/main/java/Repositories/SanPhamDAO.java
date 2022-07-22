/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import DomainModels.SanPham;
import Ultilities.HibernateUltis;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Dell
 */
public class SanPhamDAO {
    
    
    public String themSanPham(SanPham sp){
        try(Session ss = HibernateUltis.getSessionFactory().openSession()){
            Transaction tran = ss.getTransaction();
            tran.begin();
            try {
                ss.save(sp);
                tran.commit();
            } catch (Exception e) {
                tran.rollback();
                return "Thêm không thành công";
            }
        }
        return "Thêm thành công nhé!";
        }
        public String suaSanPham(SanPham sp){
        try(Session ss = HibernateUltis.getSessionFactory().openSession()){
            Transaction tran = ss.getTransaction();
            tran.begin();
            try {
                ss.update(sp);
                tran.commit();
            } catch (Exception e) {
                tran.rollback();
                return "Sửa không thành công";
            }
        }
        return "Sửa thành công nhé!";
        }
    
    public List<SanPham> listSanPham(){
        List<SanPham> list;
        try(Session ss = HibernateUltis.getSessionFactory().openSession()){
            String sql = "select x from SanPham x";
            TypedQuery<SanPham> type = ss.createQuery(sql,SanPham.class);
            list = type.getResultList();
        }
        return list;
    }
    public String tenSanPham(String masp){
        String name;
        try(Session ss = HibernateUltis.getSessionFactory().openSession()){
            String sql = "select TenSanPham from SanPham where MaSanPham =: masp";
            Query qr = ss.createQuery(sql);
            qr.setParameter("masp", masp);
            name = String.valueOf( qr.getSingleResult());
        }
        return name;
    }
    
    public int soLuongSanPham(String masp){
        int soluong;
        try(Session ss = HibernateUltis.getSessionFactory().openSession()){
            String sql = "select SoLuong from SanPham where MaSanPham =: masp";
            Query qr = ss.createQuery(sql);
            qr.setParameter("masp", masp);
            soluong = (int) qr.getSingleResult();
        }
        return soluong;
    }
    
    }
    

