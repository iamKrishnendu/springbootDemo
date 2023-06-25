package com.springboot.learning.springbootDemo.src.service;

import com.springboot.learning.springbootDemo.src.model.ItemModel;

import java.util.List;

public interface ItemService {

     String createItem(ItemModel itemModel);
     String updateItem(ItemModel itemModel);
     String deleteItem(String productCode);
     ItemModel getItem(String productCode);
     List<ItemModel> getAllItems();
}
