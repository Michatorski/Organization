package org.iesfm.organization;

import java.util.Objects;

public class Member {
    private String name;
    private int nif;

    public Member(String name, int nif) {
        this.name = name;
        this.nif = nif;
    }

    public void showInfo() {
        System.out.println("Nombre: " + name + ". NIF " + nif);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member members = (Member) o;
        return nif == members.nif &&
                Objects.equals(name, members.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nif);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", nif=" + nif +
                '}';
    }


}
