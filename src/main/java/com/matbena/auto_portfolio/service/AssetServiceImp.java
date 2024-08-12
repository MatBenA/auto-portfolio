package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.Asset;
import com.matbena.auto_portfolio.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetServiceImp implements AssetService{

    @Autowired
    private AssetRepository assetRepository;

    @Override
    public Asset createAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    @Override
    public List<Asset> getAssetList() {
        return assetRepository.findAll();
    }

    @Override
    public Asset getAssetById(int id) {
        return assetRepository.findById(id).orElse(null);
    }

    @Override
    public Asset updateAsset(Asset newAsset, int id) {
        Asset updateAsset = assetRepository.findById(id).orElse(null);

        assert updateAsset != null;
        updateAsset.setSymbol(newAsset.getSymbol());
        updateAsset.setPrice(newAsset.getPrice());
        updateAsset.setAssetType(newAsset.getAssetType());

        return assetRepository.save(updateAsset);
    }

    @Override
    public void deleteAssetById(int id) {
        assetRepository.deleteById(id);
    }
}
