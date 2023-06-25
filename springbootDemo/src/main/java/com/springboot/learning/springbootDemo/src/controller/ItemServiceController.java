package com.springboot.learning.springbootDemo.src.controller;

import com.springboot.learning.springbootDemo.src.service.ItemServiceImpl;
import com.springboot.learning.springbootDemo.src.model.ItemModel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@AllArgsConstructor
public class ItemServiceController {

    @Autowired
    ItemServiceImpl itemService;

    @GetMapping("/getItems")
    public List<ItemModel> getItemDetails(){
        return itemService.getAllItems();
    }

    @GetMapping("{productCode}")
    public ItemModel getSpecificProductDetails(@PathVariable("productCode") String productCode){
        return itemService.getItem(productCode);
    }

    @PostMapping
    public String createItem(@RequestBody ItemModel itemModel){
        itemService.createItem(itemModel);
        return "Item is created"+itemModel;
    }

    @PutMapping("/update")
    public String updateItem(@RequestBody ItemModel itemModel){
       itemService.updateItem(itemModel);
        return "Item is updated successfully";
    }

    @DeleteMapping("/delete")
    public String deleteItem(@RequestParam ("productCode") String productCode){
        itemService.deleteItem(productCode);
        return "Item is deleted successfully";
    }
}
