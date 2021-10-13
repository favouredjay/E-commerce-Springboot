package com.ecommerce.shop.data.repository;

import com.ecommerce.shop.data.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository <Feedback, Long> {
}
