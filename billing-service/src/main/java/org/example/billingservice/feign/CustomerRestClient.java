package org.example.billingservice.feign;

import lombok.Builder;
import org.example.billingservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer-service") 
public interface CustomerRestClient {
    @GetMapping("/api/customers/{id}")
    public Customer findCustomerById(@PathVariable Integer id);
    @GetMapping("/api/customers/")
    PagedModel<Customer> getAllCustomer();
}
