package com.matbena.auto_portfolio.service;

import com.matbena.auto_portfolio.model.Asset;

import java.util.List;

public interface AssetService {
    public Asset createAsset(Asset asset);

    public List<Asset> getAssetList();

    public Asset getAssetById(int id);

    public Asset updateAsset(Asset newAsset, int id);

    public void deleteAssetById(int id);
}
