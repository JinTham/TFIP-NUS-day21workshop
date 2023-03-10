package tfip.paf.day21workshop.Model;

import java.sql.Time;

public class Order {
    
    private Integer id;
    private Integer customerId;
    private Time orderDate;
    private Time shippedDate;
    private String shipCity;

    public Order(Integer id, Integer customerId, Time orderDate, Time shippedDate, String shipCity) {
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

    public Time getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Time orderDate) {
        this.orderDate = orderDate;
    }

    public Time getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Time shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }
    
    
    

}
