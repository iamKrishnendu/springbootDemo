package com.springboot.learning.springbootDemo.service;

import com.springboot.learning.springbootDemo.src.model.ItemModel;

import java.util.List;

public interface ItemService {

    public String createItem(ItemModel itemModel);
    public String updateItem(ItemModel itemModel);
    public String deleteItem(String productCode);
    public ItemModel getItem(String productCode);
    public List<ItemModel> getAllItems();
}
