package ir.amv.os.vaseline.samples.books.model;

import ir.amv.os.vaseline.security.apis.authentication.modelimpl.server.base.VaselineBaseUserEntity;

/**
 * @author Amir
 */
public class INeedBaseUser {

    private VaselineBaseUserEntity vaselineBaseUserEntity;

    public VaselineBaseUserEntity getVaselineBaseUserEntity() {
        return vaselineBaseUserEntity;
    }

    public void setVaselineBaseUserEntity(final VaselineBaseUserEntity vaselineBaseUserEntity) {
        this.vaselineBaseUserEntity = vaselineBaseUserEntity;
    }
}
