/**
 * Copyright (c) Experian, 2009. All rights reserved.
 */
package ir.amv.os.vaseline.samples.books.dao.jpa;

import ir.amv.os.vaseline.data.jpa.apis.dao.server.crud.IBaseImplementedJpaCrudDao;
import ir.amv.os.vaseline.data.jpa.apis.dao.server.ro.vendorspecific.IVendorSpecificDaoHelper;
import ir.amv.os.vaseline.samples.books.model.server.AuthorEntity;

import javax.persistence.EntityManager;

/**
 * @author Amir
 */
public class AuthorDaoImpl implements IBaseImplementedJpaCrudDao<AuthorEntity, Long> {

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
}
