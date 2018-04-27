package com.bee.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A BeeMenu.
 */
@Entity
@Table(name = "bee_menu")
public class BeeMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "url")
    private String url;

    @Column(name = "pid")
    private Long pid;

    @ManyToMany
    @JoinTable(name = "bee_menu_privilege",
               joinColumns = @JoinColumn(name="menu_id", referencedColumnName="id"),
               inverseJoinColumns = @JoinColumn(name="privilege_id", referencedColumnName="id"))
    private Set<BeePrivilege> privileges = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public BeeMenu name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public BeeMenu description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public BeeMenu url(String url) {
        this.url = url;
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getPid() {
        return pid;
    }

    public BeeMenu pid(Long pid) {
        this.pid = pid;
        return this;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Set<BeePrivilege> getPrivileges() {
        return privileges;
    }

    public BeeMenu privileges(Set<BeePrivilege> beePrivileges) {
        this.privileges = beePrivileges;
        return this;
    }

    public BeeMenu addPrivilege(BeePrivilege beePrivilege) {
        this.privileges.add(beePrivilege);
        return this;
    }

    public BeeMenu removePrivilege(BeePrivilege beePrivilege) {
        this.privileges.remove(beePrivilege);
        return this;
    }

    public void setPrivileges(Set<BeePrivilege> beePrivileges) {
        this.privileges = beePrivileges;
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
        BeeMenu beeMenu = (BeeMenu) o;
        if (beeMenu.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), beeMenu.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "BeeMenu{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", url='" + getUrl() + "'" +
            ", pid=" + getPid() +
            "}";
    }
}
