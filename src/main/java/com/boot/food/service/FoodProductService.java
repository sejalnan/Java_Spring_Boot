package com.boot.food.service;

import com.boot.food.Exception.ProductNotFound;
import com.boot.food.model.FoodProduct;
import com.boot.food.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoodProductService {

    private final ProductRepository repository;

    public FoodProductService(ProductRepository repository) {
        this.repository = repository;
    }


    public List<FoodProduct> getAllProduct() {
        return repository.findAll();
    }

    public FoodProduct createProduct(FoodProduct foodProduct) {
        try
        {
            repository.save(foodProduct);

        }
        catch (Exception e) {
            System.out.println(e);
            throw e;
        }

        return foodProduct;
    }

    public FoodProduct findByid(int id) {
        try {
            return repository.findById(id);
        } catch (Exception e) {
            throw e;
        }
    }


    public boolean deleteById(int id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw e;

        }

    }


    public FoodProduct updateProduct(int id, FoodProduct product) {
        try
        {
            repository.updateById(id, product);

        }
        catch (ProductNotFound e)
        {
            throw e;
        }
        return product;
    }


    public List<FoodProduct> searchByName(String name) {
        try {
            return repository.searchByName(name);
        } catch (Exception e) {
            System.out.println(e);
            return List.of();
        }
    }

    public List<FoodProduct> filterByPrice(int min, int max) {
        return repository.findByPriceBetween(min, max);
    }
}