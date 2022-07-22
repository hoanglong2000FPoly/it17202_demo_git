/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repostory;

/**
 *
 * @author T460
 */
import DomainModels.BaoHanh;
import Repostory.BaoHanhTruyVan;
import Ultilities.HibernateUti;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class BaoHanhTruyVan {
    
    public List<BaoHanh> getList(){
        List<BaoHanh> listBaoHanhs;
        try(Session session = HibernateUti.getSessionFactory().openSession()){
            TypedQuery<BaoHanh> query = session.createQuery("select c from BaoHanh c");
            listBaoHanhs = query.getResultList();
        }
        return listBaoHanhs;
    }
    public String save(BaoHanh bh){
        try(Session session = HibernateUti.getSessionFactory().openSession()){
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.save(bh);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return"That bai";
            }
        }
        return "Thanh cong";
    }
    public String update(BaoHanh bh){
        try(Session session = HibernateUti.getSessionFactory().openSession()){
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                session.update(bh);
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
                return"That bai";
            }
        }
        return "Thanh cong";
    }
    
}
