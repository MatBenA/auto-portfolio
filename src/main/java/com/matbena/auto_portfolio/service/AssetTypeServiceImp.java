package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.AssetType;
import com.matbena.auto_portfolio.repository.AssetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AssetTypeServiceImp implements AssetTypeService{
    @Autowired
    private AssetTypeRepository assetTypeRepository;

    @Override
    public AssetType createAssetType(AssetType assetTypeType) {
        return assetTypeRepository.save(assetTypeType);
    }

    @Override
    public List<AssetType> getAssetTypeList() {
        return assetTypeRepository.findAll();
    }

    @Override
    public AssetType getAssetTypeById(int id) {
        return assetTypeRepository.findById(id).orElse(null);
    }

    @Override
    public AssetType updateAssetType(AssetType newAssetType, int id) {
        AssetType updateAssetType = assetTypeRepository.findById(id).orElse(null);

        assert updateAssetType != null;
        updateAssetType.setName(newAssetType.getName());

        return assetTypeRepository.save(updateAssetType);
    }

    @Override
    public void deleteAssetTypeById(int id) {
        assetTypeRepository.deleteById(id);
    }
}
