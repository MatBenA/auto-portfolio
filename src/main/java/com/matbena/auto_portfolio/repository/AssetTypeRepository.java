package com.matbena.auto_portfolio.repository;

import com.matbena.auto_portfolio.model.AssetType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetTypeRepository extends JpaRepository<AssetType, Integer> {
}
