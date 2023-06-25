package com.springboot.learning.springbootDemo.src.service;

import com.springboot.learning.springbootDemo.src.model.ItemModel;
import com.springboot.learning.springbootDemo.src.repository.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ItemServiceImpl implements ItemService {
    ItemRepository itemRepo;
    @Override
    public String createItem(ItemModel itemModel) {
        itemRepo.save(itemModel);
        return "Success";
    }

    @Override
    public String updateItem(ItemModel itemModel) {
        itemRepo.save(itemModel);
        return "Updated Successfully";
    }

    @Override
    public String deleteItem(String productCode) {
        itemRepo.deleteById(productCode);
        return "deleted";
    }

    @Override
    public ItemModel getItem(String productCode) {
        return itemRepo.findById(productCode).get();
    }

    @Override
    public List<ItemModel> getAllItems() {
        return itemRepo.findAll();
    }
}
