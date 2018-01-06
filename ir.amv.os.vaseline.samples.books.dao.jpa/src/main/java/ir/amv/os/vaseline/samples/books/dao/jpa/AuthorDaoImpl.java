/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.books.dao.jpa;

import ir.amv.os.vaseline.data.jpa.apis.dao.server.crud.IBaseImplementedJpaCrudDao;
import ir.amv.os.vaseline.data.jpa.apis.dao.server.ro.vendorspecific.IVendorSpecificDaoHelper;
import ir.amv.os.vaseline.samples.books.dao.api.IAuthorDao;
import ir.amv.os.vaseline.samples.books.model.server.AuthorEntity;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.persistence.EntityManager;

/**
 * @author Amir
 */
@Component(
        immediate = true,
        service = IAuthorDao.class
)
public class AuthorDaoImpl implements IAuthorDao, IBaseImplementedJpaCrudDao<AuthorEntity, Long> {

    private EntityManager em;

    public IVendorSpecificDaoHelper getVendorSpecificDaoHelper() {
        return null;
    }

    public void setEntityClass(final Class<AuthorEntity> entityClass) {

    }

    public Class<AuthorEntity> getEntityClass() {
        return null;
    }

    public EntityManager getEntityManager() {
        return null;
    }

    @Reference(
            target = "(osgi.unit.name=amvPersistenceUnit)"
    )
    public void setEm(final EntityManager em) {
        this.em = em;
    }
}
