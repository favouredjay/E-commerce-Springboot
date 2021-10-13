package com.ecommerce.shop.data.repository;

import com.ecommerce.shop.data.model.Newsletter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsletterRepository extends JpaRepository<Newsletter, Long> {
}
