package com.matbena.auto_portfolio.controller;

import com.matbena.auto_portfolio.model.AssetType;
import com.matbena.auto_portfolio.service.AssetTypeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asset-types")
public class AssetTypeController {

    @Autowired
    AssetTypeServiceImp assetTypeService;

    @PostMapping("/create")
    public AssetType createAssetType(@RequestBody AssetType assetType){
        return assetTypeService.createAssetType(assetType);
    }

    @GetMapping("/{id}")
    public AssetType getAssetTypeById(@PathVariable int id){
        return assetTypeService.getAssetTypeById(id);
    }

    @GetMapping
    public List<AssetType> getAssetTypeList() {
        return assetTypeService.getAssetTypeList();
    }

    @PutMapping("/update/{id}")
    public AssetType updateAssetType(@RequestBody AssetType newAssetType, @PathVariable int id){
        return assetTypeService.updateAssetType(newAssetType, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAssetType(@PathVariable int id){
        assetTypeService.deleteAssetTypeById(id);
        return "AssetType deleted";
    }
}
