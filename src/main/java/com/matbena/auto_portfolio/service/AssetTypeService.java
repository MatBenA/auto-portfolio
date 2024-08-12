package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.AssetType;

import java.util.List;

public interface AssetTypeService {
    public AssetType createAssetType(AssetType assetType);

    public List<AssetType> getAssetTypeList();

    public AssetType getAssetTypeById(int id);

    public AssetType updateAssetType(AssetType newAssetType, int id);

    public void deleteAssetTypeById(int id);
}
