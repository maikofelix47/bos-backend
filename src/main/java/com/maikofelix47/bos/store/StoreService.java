package com.maikofelix47.bos.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public Iterable<Store> findAll(){
        return  storeRepository.findAll();
    }

    public Store insertOne(Store store){
        return storeRepository.save(store);
    }

    public Optional<Store> findOne(Integer id){
        return  storeRepository.findById(id);
    }

    public Optional<Store> updateOne(Integer id, Store store){
          return Optional.of(storeRepository.findById(id).map(st -> {
              st.setName(store.getName());
              return storeRepository.save(st);
          }).orElseGet(() -> {
              return storeRepository.save(store);
          }));
    }
}
