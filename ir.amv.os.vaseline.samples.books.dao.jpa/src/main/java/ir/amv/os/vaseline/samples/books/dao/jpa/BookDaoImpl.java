package ir.amv.os.vaseline.samples.books.dao.jpa;

import ir.amv.os.vaseline.data.jpa.apis.dao.server.crud.IBaseImplementedJpaCrudDao;
import ir.amv.os.vaseline.data.jpa.apis.dao.server.ro.vendorspecific.IVendorSpecificDaoHelper;
import ir.amv.os.vaseline.samples.books.dao.api.IBookDao;
import ir.amv.os.vaseline.samples.books.model.server.BookEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Amir
 */
public class BookDaoImpl implements IBookDao, IBaseImplementedJpaCrudDao<BookEntity, Long> {

    @PersistenceContext(unitName = "amvPersistenceUnit")
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
