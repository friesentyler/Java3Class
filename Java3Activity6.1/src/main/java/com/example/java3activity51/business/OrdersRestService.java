package com.example.java3activity51.business;

import com.example.java3activity51.model.OrderList;
import com.example.java3activity51.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service")
public class OrdersRestService {
    @Qualifier("ordersBusinessService")
    @Autowired
    OrdersBusinessInterface service;

    @GetMapping(path="/getjson", produces= {MediaType.APPLICATION_JSON_VALUE})
    public List<OrderModel> getOrdersAsJson() {
        return service.getOrders();
    }

    @GetMapping(path="/getxml", produces = {MediaType.APPLICATION_XML_VALUE})
    public OrderList getOrdersAsXml() {
        OrderList list = new OrderList();
        list.setOrders(service.getOrders());
        return list;
    }

    @GetMapping(path="/getorder/{id}")
    public ResponseEntity<?> getOrder(@PathVariable("id") String id) {
        try {
            OrderModel order = service.getOrderById(id);
            if (order == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(order, HttpStatus.OK);
            }
        } catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
