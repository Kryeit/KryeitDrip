package com.kryeit.kryeitdrip.entity;

import com.kryeit.kryeitdrip.Clothe;
import eu.pb4.polymer.virtualentity.api.elements.MarkerElement;

public class ClotheEntity extends MarkerElement {

    public Clothe clothe;

    public ClotheEntity(Clothe clothe) {
        super();

        this.clothe = clothe;
    }
}
