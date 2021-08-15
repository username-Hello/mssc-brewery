package spring.msscource.msscbrewery.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.msscource.msscbrewery.service.CustomerService;
import spring.msscource.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getById(UUID id) {
        return CustomerDto.builder().id(id).name("Purple rush").build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        //todo implement
        return CustomerDto.builder().id(customerDto.getId()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo implement
        log.info("Updating customer...");
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        // todo implement
        log.info("Deleting customer...");
    }
}
