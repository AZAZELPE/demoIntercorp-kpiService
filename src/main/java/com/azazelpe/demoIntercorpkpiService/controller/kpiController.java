package com.azazelpe.demoIntercorpkpiService.controller;

import com.azazelpe.demoIntercorpkpiService.model.Kpi;
import com.azazelpe.demoIntercorpkpiService.model.KpiUpdateData;
import com.azazelpe.demoIntercorpkpiService.repository.KpiRepository;
import com.azazelpe.demoIntercorpkpiService.service.KpiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class kpiController {

    @Autowired
    KpiRepository kpiRepository;
    @Autowired
    KpiService kpiService;


    @GetMapping("/kpideclientes")
    public Kpi getKpi() {
        return kpiRepository.findTopByOrderByIdDesc();
    }

    @PostMapping("/updateKpi")
    @ResponseBody
    public ResponseEntity<Object> updateKpi(@RequestBody KpiUpdateData kpiUpdateData) {
        if(kpiUpdateData.getEdades().isEmpty())
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);

        kpiService.updateKpi(kpiUpdateData);
        return ResponseEntity.ok().body(null);
    }

}
