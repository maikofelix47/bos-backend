package com.maikofelix47.bos.rider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RiderService {
    @Autowired
    private RiderRepository riderRepository;

    public Iterable<Rider> findAll(){
        return  riderRepository.findAll();
    }
    public Optional<Rider> findOne(Integer id){
        return  riderRepository.findById(id);
    }
    public Rider insertOne(Rider rider){
        return  riderRepository.save(rider);
    }
    public Rider updateOne(Integer id,Rider rider){
        return riderRepository.findById(id).map(rider1 -> {
            rider1.setFirstName(rider.getFirstName());
            rider1.setLastName(rider.getLastName());
            rider1.setPhoneNo(rider.getPhoneNo());
            return riderRepository.save(rider1);
        }).orElseGet(()->{
            return riderRepository.save(rider);
        });
    }
}
