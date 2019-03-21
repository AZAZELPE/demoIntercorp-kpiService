package com.azazelpe.demoIntercorpkpiService.service;

import com.azazelpe.demoIntercorpkpiService.Utils.MathUtils;
import com.azazelpe.demoIntercorpkpiService.model.Kpi;
import com.azazelpe.demoIntercorpkpiService.model.KpiUpdateData;
import com.azazelpe.demoIntercorpkpiService.repository.KpiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KpiService{

    @Autowired
    KpiRepository kpiRepository;


    public Kpi updateKpi(KpiUpdateData kpiUpdateData) {

        List<Integer> edades = kpiUpdateData.getEdades();
        Double averageEdades = MathUtils.calculateAverage(edades);
        Double SDEdades = MathUtils.calculateAverage(edades);

        Kpi kpi = new Kpi();
        kpi.setPromedioEdadTodosClientes(averageEdades);
        kpi.setDesvEstandarEdadTodosClientes(SDEdades);

        return kpiRepository.save(kpi);
    }


}
