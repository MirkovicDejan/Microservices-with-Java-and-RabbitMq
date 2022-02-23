package com.mirkoviccode.app.fraud.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Fraud_Check_History")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FraudCheckHistory {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFraudCheckHistory",unique = true,nullable = false)
    private Integer idFraudCheckHistory;
    @Column(name = "idCustomer",nullable = false)
    private Integer idCustomer;
    @Column(name = "isFraudster",nullable = false)
    private boolean isFraudster;
    @Column(name = "createdAt",nullable = false)
    private LocalDateTime createdAt;
}
