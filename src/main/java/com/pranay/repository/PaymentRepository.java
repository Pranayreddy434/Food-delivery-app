package com.pranay.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pranay.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
   


}
