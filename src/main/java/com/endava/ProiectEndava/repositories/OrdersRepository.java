package com.endava.ProiectEndava.repositories;

import com.endava.ProiectEndava.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer> {

    @Query
    List<Orders> findOrdersByUserUserId(Integer userId);

}
