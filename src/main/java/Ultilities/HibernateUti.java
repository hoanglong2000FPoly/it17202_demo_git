/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ultilities;

import DomainModels.PhuKien;
import DomainModels.SanPham;
import DomainModels.TheLoai;
import DomainModels.NhanVien;
import DomainModels.BaoHanh;
import DomainModels.KhachHang;



import com.sun.xml.fastinfoset.sax.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.criterion.Property;

/**
 *
 * @author admin
 */
public class HibernateUti {
    private final static SessionFactory FACTORY;
    static {
        
        Configuration configuration = new Configuration();
        java.util.Properties properties = new java.util.Properties();
        configuration.setProperties(properties);
        properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
        properties.put(Environment.DRIVER,"com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL,"jdbc:sqlserver://localhost:1433;databaseName=DuAn1_QLSP_Pod");
        properties.put(Environment.USER,"chuongnv1");
        properties.put(Environment.PASS,"123456");       
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(SanPham.class);
        configuration.addAnnotatedClass(TheLoai.class);
        configuration.addAnnotatedClass(PhuKien.class);
        configuration.addAnnotatedClass(NhanVien.class);
        configuration.addAnnotatedClass(BaoHanh.class);
        configuration.addAnnotatedClass(KhachHang.class);
        
        org.hibernate.service.ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        
        FACTORY = configuration.buildSessionFactory(registry);
    }
    public static SessionFactory getSessionFactory(){
        return FACTORY;
    }
     

}
