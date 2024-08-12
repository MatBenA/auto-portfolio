package com.matbena.auto_portfolio.controller;

import com.matbena.auto_portfolio.model.Asset;
import com.matbena.auto_portfolio.service.AssetServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetController {

    @Autowired
    AssetServiceImp assetService;

    @PostMapping("/create")
    public Asset createAsset(@RequestBody Asset asset){
        return assetService.createAsset(asset);
    }

    @GetMapping("/{id}")
    public Asset getAssetById(@PathVariable int id){
        return assetService.getAssetById(id);
    }

    @GetMapping
    public List<Asset> getAssetList() {
        return assetService.getAssetList();
    }

    @PutMapping("/update/{id}")
    public Asset updateAsset(@RequestBody Asset newAsset, @PathVariable int id){
        return assetService.updateAsset(newAsset, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAsset(@PathVariable int id){
        assetService.deleteAssetById(id);
        return "Asset deleted";
    }
}
