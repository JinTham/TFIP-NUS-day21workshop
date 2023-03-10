package tfip.paf.day21workshop.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Order implements Serializable{
    
    private Integer id;
    private Integer customerId;
    private LocalDateTime orderDate;
    private LocalDateTime shippedDate;
    private String shipCity;

    public Order(Integer id, Integer customerId, LocalDateTime orderDate, LocalDateTime shippedDate, String shipCity) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.shippedDate = shippedDate;
        this.shipCity = shipCity;
    }

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(LocalDateTime shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }
    
    
    

}
