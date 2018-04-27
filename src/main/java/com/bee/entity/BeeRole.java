package com.bee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A BeeRole.
 */
@Entity
@Table(name = "bee_role")
public class BeeRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 50)
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    private Set<BeeUser> users = new HashSet<>();

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

    public BeeRole name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public BeeRole description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<BeeUser> getUsers() {
        return users;
    }

    public BeeRole users(Set<BeeUser> beeUsers) {
        this.users = beeUsers;
        return this;
    }

    public BeeRole addUser(BeeUser beeUser) {
        this.users.add(beeUser);
        beeUser.getRoles().add(this);
        return this;
    }

    public BeeRole removeUser(BeeUser beeUser) {
        this.users.remove(beeUser);
        beeUser.getRoles().remove(this);
        return this;
    }

    public void setUsers(Set<BeeUser> beeUsers) {
        this.users = beeUsers;
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
        BeeRole beeRole = (BeeRole) o;
        if (beeRole.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), beeRole.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "BeeRole{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }
}
