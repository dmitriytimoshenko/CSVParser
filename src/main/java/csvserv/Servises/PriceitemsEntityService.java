package csvserv.Servises;

import csvserv.DAO.PriceitemsEntityDAO;
import csvserv.Entities.PriceitemsEntity;

import java.util.List;

public class PriceitemsEntityService {

    private PriceitemsEntityDAO peDAO = new PriceitemsEntityDAO();

    public PriceitemsEntityService() {}

    public PriceitemsEntity findByIdPriceitem(int id) {
       return peDAO.findByID(id);
    }

    public void savePriceitem(PriceitemsEntity pe) {
        peDAO.save(pe);
    }

    public void updatePriceitem(PriceitemsEntity pe) {
        peDAO.update(pe);
    }

    public void deletePriceitem(PriceitemsEntity pe) {
        peDAO.delete(pe);
    }

    public List<PriceitemsEntity> findAllPriceitems() {
        return peDAO.findAll();
    }



}
