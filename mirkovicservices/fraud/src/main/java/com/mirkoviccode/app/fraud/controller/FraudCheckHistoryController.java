package com.mirkoviccode.app.fraud.controller;
import com.mirkoviccode.app.fraud.service.FraudCheckHistoryService;
import com.mirkoviccode.app.fraud.util.FraudCheckResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FraudCheckHistoryController {
    @Autowired
    private final FraudCheckHistoryService service;

    @GetMapping("/is-fraudster")
    public FraudCheckResponse isFraudster(@RequestParam Integer idCustomer){
           boolean isFraudulentCustomer = service.isFraudulentCustomer(idCustomer);
           return new FraudCheckResponse(isFraudulentCustomer);
    }

}
