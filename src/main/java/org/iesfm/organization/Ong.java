package org.iesfm.organization;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Ong extends Organization{
    private List<String> projetcs;

    public Ong(int cif, String name, String direction, HashMap<Integer, Member> members, List<String> projetcs) {
        super(cif, name, direction, members);
        this.projetcs = projetcs;
    }

    @Override
    public void showSpecificInfo() {




        System.out.println("Estos son los siguientes proyectos:");
        for (String project: projetcs){
            System.out.println(project);
        }

    }

    public void showOrgType(){
        System.out.println("Esta organizacion es una ONG");
    }

    public List<String> getProjetcs() {
        return projetcs;
    }

    public void setProjetcs(List<String> projetcs) {
        this.projetcs = projetcs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ong ong = (Ong) o;
        return Objects.equals(projetcs, ong.projetcs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), projetcs);
    }
}
