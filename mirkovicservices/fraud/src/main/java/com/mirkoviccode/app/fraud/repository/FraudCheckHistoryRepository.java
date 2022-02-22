package com.mirkoviccode.app.fraud.repository;
import com.mirkoviccode.app.fraud.models.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory,Integer>{

}
