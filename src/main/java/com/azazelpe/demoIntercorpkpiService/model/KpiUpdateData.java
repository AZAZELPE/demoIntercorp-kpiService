package com.azazelpe.demoIntercorpkpiService.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

public class KpiUpdateData {

    private List<Integer> edades;

    public List<Integer> getEdades() {
        return edades;
    }

    public void setEdades(List<Integer> edades) {
        this.edades = edades;
    }
}
