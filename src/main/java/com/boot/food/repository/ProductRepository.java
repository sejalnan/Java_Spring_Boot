package com.boot.food.repository;


import com.boot.food.Exception.ProductNotFound;
import com.boot.food.model.FoodProduct;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class ProductRepository {
   private final ArrayList<FoodProduct> list=new ArrayList<>();


   public List<FoodProduct> findAll(){
       return list;
   }

   public FoodProduct findById(int id){
       return list.stream().filter
               (p->p.getPid()== id).findFirst().orElse(null);

   }

   public void save(FoodProduct foodProduct){
       list.add(foodProduct);
   }

   public void deleteById(int id ) {

       //method 1

//       for (int i =0;i<list.size();i++){
//           if(list.get(i).getPid()==id){
//               list.remove(i);
//               break;
//           }
//       }


       //method 2--collection framework function for List
       list.removeIf(foodProduct -> foodProduct.getPid()==id);
   }

   public boolean updateById(int id,FoodProduct product){
       FoodProduct existingProduct=findById(id);
       if(existingProduct!=null){
           existingProduct.setPname(product.getPname());
           existingProduct.setPtype(product.getPtype());
           return true;
       }else{
           throw new ProductNotFound("Product Not Fouund");
       }
   }

   public List<FoodProduct> searchByName(String name){
           return list.stream()
                   .filter(p -> p.getPname().equalsIgnoreCase(name))
                   .toList();

   }

    public List<FoodProduct> findByPriceBetween(int min, int max) {
        return list.stream()
                .filter(p -> p.getPrice() >= min && p.getPrice() <= max)
                .collect(Collectors.toList());
    }
}
