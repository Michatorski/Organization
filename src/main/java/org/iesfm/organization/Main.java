package org.iesfm.organization;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Organization medicosSinFronteras = new Ong(1, "Medicos Sin Fronteras", "C/B", new HashMap<>(), new LinkedList<>());

        medicosSinFronteras.showInfo();
    }
}
