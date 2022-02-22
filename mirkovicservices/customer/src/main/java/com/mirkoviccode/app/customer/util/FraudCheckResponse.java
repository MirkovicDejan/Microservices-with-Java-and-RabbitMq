package com.mirkoviccode.app.customer.util;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class FraudCheckResponse {
    boolean isFraudster;
}
