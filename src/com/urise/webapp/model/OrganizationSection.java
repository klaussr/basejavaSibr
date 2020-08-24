package com.urise.webapp.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by iStyle on 17.08.2020.
 */
public class OrganizationSection extends Section {

    private static final long serialVersionUID = 1L;

    private final List<Organization> organizations;

    public OrganizationSection(Organization...organizations) {this(Arrays.asList(organizations));}

    public OrganizationSection(List<Organization> organizations) {
        Objects.requireNonNull(organizations, "organization must not be null");
        this.organizations = organizations;
    }

    @Override
    public String toString() {
        return organizations.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrganizationSection that = (OrganizationSection) o;

        return organizations.equals(that.organizations);

    }

    @Override
    public int hashCode() {
        return organizations.hashCode();
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }
}
