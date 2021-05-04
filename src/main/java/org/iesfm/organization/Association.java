package org.iesfm.organization;

import java.util.HashMap;
import java.util.List;

public class Association extends  Organization{


    public Association(int cif, String name, String direction, HashMap<Integer, Member> members) {
        super(cif, name, direction, members);
    }

    @Override
    public void showOrgType() {
        System.out.println("Esto es una Asociacion");
    }

    @Override
    public void showSpecificInfo() {

    }


}
