package com.example.carshowroom.Data.Repositories;

import androidx.lifecycle.LiveData;

import com.example.carshowroom.Data.DataSource.BrandDataSource;
import com.example.carshowroom.Data.Models.Brand;
import com.example.carshowroom.Data.Protocols.BrandProtocol;

import java.util.List;

public class BrandRepository implements BrandProtocol {

    private final BrandDataSource brandDataSource = new BrandDataSource();

    @Override
    public LiveData<List<Brand>> getBrandList() {
        return brandDataSource.getBrandList();
    }
}