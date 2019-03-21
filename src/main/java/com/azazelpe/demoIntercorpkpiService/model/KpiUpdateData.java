package com.azazelpe.demoIntercorpkpiService.model;

import java.util.List;


public class KpiUpdateData {

    private List<Integer> edades;

    public KpiUpdateData(List<Integer> edades) {
        this.edades = edades;
    }

    public List<Integer> getEdades() {
        return edades;
    }

    public void setEdades(List<Integer> edades) {
        this.edades = edades;
    }
}
