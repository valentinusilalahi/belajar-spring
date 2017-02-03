package com.skyworx.silalahi.valentinus.latihan.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.skyworx.silalahi.valentinus.latihan.entity.Product;

public interface ProductDao extends PagingAndSortingRepository<Product, String> {

}
