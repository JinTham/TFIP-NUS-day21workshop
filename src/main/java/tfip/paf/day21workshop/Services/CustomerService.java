package tfip.paf.day21workshop.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfip.paf.day21workshop.Model.Customer;
import tfip.paf.day21workshop.Model.Order;
import tfip.paf.day21workshop.Repositories.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepository customerRepo;

    public List<Customer> getSQLLimitOffset(int limit, int offset) {
        return customerRepo.getSQLLimitOffset(limit, offset);
    }

    public List<Customer> getSQLById(Integer id) {
        return customerRepo.getSQLById(id);
    }

    public List<Order> getSQLOrderByCustomerId(Integer customer_id) {
        return customerRepo.getSQLOrderByCustomerId(customer_id);
    }

}
