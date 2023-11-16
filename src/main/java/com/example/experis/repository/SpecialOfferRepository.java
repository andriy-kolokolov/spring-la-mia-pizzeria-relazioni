package com.example.experis.repository;

import com.example.experis.model.SpecialOffer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpecialOfferRepository extends JpaRepository<SpecialOffer, Long> {
    public SpecialOffer getOffersByPizzaId(Long offerId);

    List<SpecialOffer> findByPizzaId(Long pizzaId);
}
