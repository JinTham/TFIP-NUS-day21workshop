package tfip.paf.day21workshop.Repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import tfip.paf.day21workshop.Model.Customer;
import tfip.paf.day21workshop.Model.Order;

@Repository
public class CustomerRepository {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final String findSQLLimitOffset = "select * from customers limit ? offset ?";

    private final String findSQLById = "select * from customers where id = ?";

    private final String findSQLOrderByCustomerId = "select id, customer_id, order_date, shipped_date, ship_city from orders where customer_id = ?";

    public List<Customer> getSQLLimitOffset(int limit, int offset) {
        final List<Customer> customerList = new ArrayList<>();
        final SqlRowSet rs = jdbcTemplate.queryForRowSet(findSQLLimitOffset,limit,offset);
        
        while (rs.next()) {
            Customer customer = new Customer();
            customer.setId(rs.getInt("id"));
            customer.setCompany(rs.getString("company"));
            customer.setFirstName(rs.getString("first_name"));
            customer.setLastName(rs.getString("last_name"));
            customer.setEmailAddress(rs.getString("email_address"));
            customer.setJobTitle(rs.getString("job_title"));
            customer.setBusinessPhone(rs.getString("business_phone"));
            customer.setHomePhone(rs.getString("home_phone"));
            customer.setMobilePhone(rs.getString("mobile_phone"));
            customer.setFaxNumber(rs.getString("fax_number"));
            customer.setAddress(rs.getString("address"));
            customer.setCity(rs.getString("city"));
            customer.setStateProvince(rs.getString("state_province"));
            customer.setZipPostalCode(rs.getString("zip_postal_code"));
            customer.setCountryRegion(rs.getString("country_region"));
            customer.setWebPage(rs.getString("web_page"));
            customer.setNotes(rs.getString("notes"));
            customer.setAttachments(rs.getString("attachments"));
            customerList.add(customer);
        }
        return Collections.unmodifiableList(customerList);
    }

    public List<Customer> getSQLById(Integer id) {
        final List<Customer> customerList = new ArrayList<>();
        final SqlRowSet rs = jdbcTemplate.queryForRowSet(findSQLById,id);
        
        while (rs.next()) {
            Customer customer = new Customer();
            customer.setId(rs.getInt("id"));
            customer.setCompany(rs.getString("company"));
            customer.setFirstName(rs.getString("first_name"));
            customer.setLastName(rs.getString("last_name"));
            customer.setEmailAddress(rs.getString("email_address"));
            customer.setJobTitle(rs.getString("job_title"));
            customer.setBusinessPhone(rs.getString("business_phone"));
            customer.setHomePhone(rs.getString("home_phone"));
            customer.setMobilePhone(rs.getString("mobile_phone"));
            customer.setFaxNumber(rs.getString("fax_number"));
            customer.setAddress(rs.getString("address"));
            customer.setCity(rs.getString("city"));
            customer.setStateProvince(rs.getString("state_province"));
            customer.setZipPostalCode(rs.getString("zip_postal_code"));
            customer.setCountryRegion(rs.getString("country_region"));
            customer.setWebPage(rs.getString("web_page"));
            customer.setNotes(rs.getString("notes"));
            customer.setAttachments(rs.getString("attachments"));
            customerList.add(customer);
        }
        return Collections.unmodifiableList(customerList);
    }

    public List<Order> getSQLOrderByCustomerId(Integer customer_id) {
        final List<Order> orderList = new ArrayList<>();
        final SqlRowSet rs = jdbcTemplate.queryForRowSet(findSQLOrderByCustomerId ,customer_id);
        
        while (rs.next()) {
            Order order = new Order();
            order.setId(rs.getInt("id"));
            order.setCustomerId(customer_id);
            order.setOrderDate(rs.getTime("order_date"));
            order.setShippedDate(rs.getTime("shipped_date"));
            order.setShipCity(rs.getString("ship_city"));
            orderList.add(order);
        }
        return Collections.unmodifiableList(orderList);
    }
}
