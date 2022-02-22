package com.mirkoviccode.app.fraud.service;
import com.mirkoviccode.app.fraud.models.FraudCheckHistory;
import com.mirkoviccode.app.fraud.repository.FraudCheckHistoryRepository;
import com.mirkoviccode.app.fraud.util.FraudCheckResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class FraudCheckHistoryService {

    @Autowired
    private final FraudCheckHistoryRepository repository;

    public boolean isFraudulentCustomer(Integer idCustomer){
        repository.save(FraudCheckHistory.builder()
                .idCustomer(idCustomer)
                .isFraudster(false)
                .createdAt(LocalDateTime.now())
                .build());
        return false;
    }

}
