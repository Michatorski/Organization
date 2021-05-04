package org.iesfm.organization;

import java.util.HashMap;
import java.util.Objects;


public class Company extends Organization {

    private int benefits;

    public Company(int cif, String name, String direction, HashMap<Integer, Member> members, int benefits) {
        super(cif, name, direction, members);
        this.benefits = benefits;
    }

    @Override
    public void showOrgType() {
        System.out.println("Esta organizacion es una Compania");
    }

    @Override
    public void showSpecificInfo() {

        System.out.println("Tiene este numero de beneficios " + benefits);

    }

    public int getBenefits() {
        return benefits;
    }

    public void setBenefits(int benefits) {
        this.benefits = benefits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Company company = (Company) o;
        return benefits == company.benefits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), benefits);
    }
}
