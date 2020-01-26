package csvserv.DAO;

import csvserv.Entities.PriceitemsEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PriceitemsEntityDAO {

    public PriceitemsEntity findByID(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(PriceitemsEntity.class, id);
    }

    public void save(PriceitemsEntity pe) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(pe);
        transaction.commit();
        session.close();
    }

    public void update(PriceitemsEntity pe) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(pe);
        transaction.commit();
        session.close();
    }

    public void delete(PriceitemsEntity pe) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(pe);
        transaction.commit();
        session.close();
    }

    public List<PriceitemsEntity> findAll() {
        List<PriceitemsEntity> priceitems =
                (List<PriceitemsEntity>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("FROM PriceitemsEntity");
        return priceitems;
    }

}
