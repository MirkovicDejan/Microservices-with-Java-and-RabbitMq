package com.mirkoviccode.app.fraud.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class FraudCheckResponse {
    boolean isFraudster;

}
