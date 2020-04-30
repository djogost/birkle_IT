package org.example.DAO;

import org.example.model.VehicleEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class VehicleDAO {

    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(VehicleEntity.class)
            .buildSessionFactory();

    public List<VehicleEntity> getVehicles() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<VehicleEntity> list = session.createQuery("from vehicle ").getResultList();
        return list;
    }

    public void addVehicle(VehicleEntity vehicle) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.save(vehicle);
        session.getTransaction().commit();
    }

    public void updateVehicle(VehicleEntity updateVehicle) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.update(updateVehicle);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteVehicle(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        VehicleEntity vehicle = session.get(VehicleEntity.class, id);
        session.delete(vehicle);
        session.getTransaction().commit();
    }

    public VehicleEntity getVehicle(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        VehicleEntity vehicle = session.get(VehicleEntity.class, id);
        return vehicle;
    }
}
