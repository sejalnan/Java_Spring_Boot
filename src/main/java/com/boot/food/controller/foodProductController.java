package com.boot.food.controller;
import com.boot.food.Exception.ProductNotFound;
import com.boot.food.model.FoodProduct;
import com.boot.food.service.FoodProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foodProducts")
public class foodProductController {
    private final FoodProductService service;

    public foodProductController(FoodProductService productService){
        this.service=productService;
    }

    @GetMapping
    public ResponseEntity<List<FoodProduct>> getAll() {
        try {
            return new ResponseEntity<>(service.getAllProduct(), HttpStatus.OK);
        }                                // Get the List as response
        catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping
    public ResponseEntity<FoodProduct> createProduct(@RequestBody FoodProduct product) {


        return new ResponseEntity <> (service.createProduct(product),HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<FoodProduct>  getById(@PathVariable int id){
     return new ResponseEntity<>(service.findByid(id),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public String deleteById(@PathVariable int id){
        try
        {
            service.deleteById(id);
            return "deleted Successfully";
        }catch (ProductNotFound e) {
            return "Fail to delete";

        }

    }
    @PutMapping("{id}")
    public ResponseEntity<FoodProduct> updateById(@PathVariable int id,@RequestBody FoodProduct p){
        try{

            return ResponseEntity.ok(service.updateProduct(id,p));
        } catch (ProductNotFound e) {

            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/search/{name}")
    public List<FoodProduct> searchByName(@PathVariable String name) throws ProductNotFound {
        return service.searchByName(name);
    }

    //function for filter the min and max price
    @GetMapping("/filter")
    public List<FoodProduct> filterProduct(@RequestParam int min,
                                           @RequestParam int max) {
        return service.filterByPrice(min, max);
    }

    
    @GetMapping("/{search}")
    public List<FoodProduct> search(){
        return service.getAllProduct();

    }
}
