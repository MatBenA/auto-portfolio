package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.Asset;
import com.matbena.auto_portfolio.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AssetServiceImp implements AssetService{

    @Autowired
    private AssetRepository assetRepository;

    @Override
    public Asset createAsset(Asset asset) {
        return null;
    }

    @Override
    public List<Asset> getAssetList() {
        return List.of();
    }

    @Override
    public Asset getAssetById(int id) {
        return null;
    }

    @Override
    public Asset updateAsset(Asset newAsset, int id) {
        return null;
    }

    @Override
    public void deleteAssetById(int id) {

    }
}
