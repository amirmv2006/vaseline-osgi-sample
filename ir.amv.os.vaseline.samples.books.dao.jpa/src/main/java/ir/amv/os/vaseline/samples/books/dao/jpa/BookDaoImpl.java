package ir.amv.os.vaseline.samples.books.dao.jpa;

import ir.amv.os.vaseline.data.jpa.apis.dao.server.crud.IBaseImplementedJpaCrudDao;
import ir.amv.os.vaseline.data.jpa.apis.dao.server.ro.vendorspecific.IVendorSpecificDaoHelper;
import ir.amv.os.vaseline.samples.books.dao.api.IBookDao;
import ir.amv.os.vaseline.samples.books.model.server.BookEntity;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.persistence.EntityManager;

/**
 * @author Amir
 */
@Component(
        immediate = true,
        service = IBookDao.class
)
public class BookDaoImpl implements IBookDao, IBaseImplementedJpaCrudDao<BookEntity, Long> {

//    @PersistenceContext(unitName = "amvPersistenceUnit")
    @Reference(
            target = "(osgi.unit.name=amvPersistenceUnit)"
    )
    private EntityManager em;

    @Override
    public IVendorSpecificDaoHelper getVendorSpecificDaoHelper() {
        return null;
    }

    @Override
    public void setEntityClass(final Class<BookEntity> entityClass) {
    }

    @Override
    public Class<BookEntity> getEntityClass() {
        return BookEntity.class;
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }
}
