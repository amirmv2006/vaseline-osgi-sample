/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.books.dao.jpa;

import ir.amv.os.vaseline.data.jpa.apis.dao.server.crud.IBaseImplementedJpaCrudDao;
import ir.amv.os.vaseline.data.jpa.apis.dao.server.ro.vendorspecific.IVendorSpecificDaoHelper;
import ir.amv.os.vaseline.samples.books.dao.api.IBookDao;
import ir.amv.os.vaseline.samples.books.model.server.BookEntity;
import org.apache.aries.blueprint.annotation.Bean;
import org.apache.aries.blueprint.annotation.Service;

import javax.persistence.EntityManager;

/**
 * @author Amir
 */
@Bean(id = "myBean")
@Service(interfaces = IBookDao.class)
public class BookDaoImpl implements IBookDao, IBaseImplementedJpaCrudDao<BookEntity, Long> {

    public IVendorSpecificDaoHelper getVendorSpecificDaoHelper() {
        return null;
    }

    public void setEntityClass(final Class<BookEntity> entityClass) {

    }

    public Class<BookEntity> getEntityClass() {
        return null;
    }

    public EntityManager getEntityManager() {
        return null;
    }
}
