package tfip.paf.day21workshop.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tfip.paf.day21workshop.Model.Customer;
import tfip.paf.day21workshop.Model.Order;
import tfip.paf.day21workshop.Services.CustomerService;

@RestController
@RequestMapping(path="/api/customers")
public class CustomerController {
    
    @Autowired
    CustomerService customerSvc;

    @GetMapping
    public List<Customer> getSQLLimitOffset(@RequestParam("limit") int limit, @RequestParam("offset") int offset) {
        return customerSvc.getSQLLimitOffset(limit, offset);
    }

    @GetMapping(path="/{id}")
    public List<Customer> getSQLById(@PathVariable("id") Integer id) {
        return customerSvc.getSQLById(id);
    }

    @GetMapping(path="/{id}/orders")
    public List<Order> getSQLOrderByCustomerId(@PathVariable("id") Integer id) {
        return customerSvc.getSQLOrderByCustomerId(id);
    }

}
