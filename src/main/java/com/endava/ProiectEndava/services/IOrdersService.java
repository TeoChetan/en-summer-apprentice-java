package com.endava.ProiectEndava.services;

import com.endava.ProiectEndava.DTOs.OrdersDTO;
import com.endava.ProiectEndava.models.Orders;

import java.util.List;

public interface IOrdersService {
    public List<OrdersDTO> getOrders(Integer userId);
}
