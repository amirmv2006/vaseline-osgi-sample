package ir.amv.os.vaseline.samples.books.model;

import ir.amv.os.vaseline.security.apis.authentication.modelimpl.server.base.VaselineBaseUserEntity;
import ir.amv.os.vaseline.security.apis.authorization.rbac.modelimpl.server.action.SecurityActionEntity;
import ir.amv.os.vaseline.security.apis.authorization.rbac.modelimpl.server.role.SecurityRoleEntity;
import ir.amv.os.vaseline.security.apis.authorization.rbac.modelimpl.server.user.SecurityUserEntity;

/**
 * @author Amir
 */
public class INeedTheseEntitiesToo {

    private VaselineBaseUserEntity vaselineBaseUserEntity;
    private SecurityActionEntity securityActionEntity;
    private SecurityRoleEntity securityRoleEntity;
    private SecurityUserEntity securityUserEntity;

    public SecurityActionEntity getSecurityActionEntity() {
        return securityActionEntity;
    }

    public void setSecurityActionEntity(final SecurityActionEntity securityActionEntity) {
        this.securityActionEntity = securityActionEntity;
    }

    public SecurityRoleEntity getSecurityRoleEntity() {
        return securityRoleEntity;
    }

    public void setSecurityRoleEntity(final SecurityRoleEntity securityRoleEntity) {
        this.securityRoleEntity = securityRoleEntity;
    }

    public SecurityUserEntity getSecurityUserEntity() {
        return securityUserEntity;
    }

    public void setSecurityUserEntity(final SecurityUserEntity securityUserEntity) {
        this.securityUserEntity = securityUserEntity;
    }

    public VaselineBaseUserEntity getVaselineBaseUserEntity() {
        return vaselineBaseUserEntity;
    }

    public void setVaselineBaseUserEntity(final VaselineBaseUserEntity vaselineBaseUserEntity) {
        this.vaselineBaseUserEntity = vaselineBaseUserEntity;
    }
}
