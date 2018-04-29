package com.bee.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A BeeUserLoginHistory.
 */
@Entity
@Table(name = "bee_user_login_history")
public class BeeUserLoginHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "last_login_date")
    private Instant lastLoginDate;

    @Column(name = "last_login_ip")
    private String lastLoginIp;

    @Column(name = "remark")
    private String remark;

    @ManyToOne
    private User user;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public BeeUserLoginHistory login(String login) {
        this.login = login;
        return this;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Instant getLastLoginDate() {
        return lastLoginDate;
    }

    public BeeUserLoginHistory lastLoginDate(Instant lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
        return this;
    }

    public void setLastLoginDate(Instant lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public BeeUserLoginHistory lastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
        return this;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getRemark() {
        return remark;
    }

    public BeeUserLoginHistory remark(String remark) {
        this.remark = remark;
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public User getBeeUser() {
        return user;
    }

    public BeeUserLoginHistory beeUser(User beeUser) {
        this.user = beeUser;
        return this;
    }

    public void setBeeUser(User user) {
        this.user = user;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BeeUserLoginHistory beeUserLoginHistory = (BeeUserLoginHistory) o;
        if (beeUserLoginHistory.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), beeUserLoginHistory.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "BeeUserLoginHistory{" +
            "id=" + getId() +
            ", login='" + getLogin() + "'" +
            ", lastLoginDate='" + getLastLoginDate() + "'" +
            ", lastLoginIp='" + getLastLoginIp() + "'" +
            ", remark='" + getRemark() + "'" +
            "}";
    }
}
