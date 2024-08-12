package com.matbena.auto_portfolio.repository;

import com.matbena.auto_portfolio.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Integer> {
}
