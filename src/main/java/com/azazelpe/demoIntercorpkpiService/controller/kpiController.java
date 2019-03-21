package com.azazelpe.demoIntercorpkpiService.controller;

import com.azazelpe.demoIntercorpkpiService.model.Kpi;
import com.azazelpe.demoIntercorpkpiService.model.KpiUpdateData;
import com.azazelpe.demoIntercorpkpiService.repository.KpiRepository;
import com.azazelpe.demoIntercorpkpiService.service.KpiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class kpiController {

    @Autowired
    KpiRepository kpiRepository;
    @Autowired
    KpiService kpiService;


    @GetMapping("/kpideclientes")
    public List<Kpi> getAllKpi() {
        return kpiRepository.findAll();
    }

    @PostMapping("/updateKpi")
    @ResponseBody
    public ResponseEntity<Void> updateKpi(@RequestBody KpiUpdateData kpiUpdateData) {
        kpiService.updateKpi(kpiUpdateData);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
