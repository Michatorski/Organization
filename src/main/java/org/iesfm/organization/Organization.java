package org.iesfm.organization;

import java.util.HashMap;
import java.util.Objects;

public abstract class Organization {

    private int cif;
    private String name;
    private String direction;
    private HashMap<Integer, Member> members;

    public Organization(int cif, String name, String direction, HashMap<Integer, Member> members) {
        this.cif = cif;
        this.name = name;
        this.direction = direction;
        this.members = members;
    }

    public void showInfo() {
        showOrgType();
        System.out.println("El CIF es " + cif);
        System.out.println("El nombre de la organizacion es " + name);
        System.out.println("La direccion de la organizacion es " + direction);
        System.out.println("Socios: ");
        for (Member member : members.values()) {
            member.showInfo();
        }
        showSpecificInfo();
    }

    public abstract void showOrgType();

    public abstract void showSpecificInfo();

    public boolean isMember(int memberNif) {

        return members.containsKey(memberNif);
    }

    public void addMember(String name, int nif) {
        members.put(nif, new Member(name, nif));
    }

    public void removeMember(int nif) {

        members.remove(nif);
    }

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public HashMap<Integer, Member> getMembers() {
        return members;
    }

    public void setMembers(HashMap<Integer, Member> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return cif == that.cif &&
                Objects.equals(name, that.name) &&
                Objects.equals(direction, that.direction) &&
                Objects.equals(members, that.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cif, name, direction, members);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "cif=" + cif +
                ", name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                ", members=" + members +
                '}';
    }
}
