package spring.msscource.msscbrewery.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring.msscource.msscbrewery.service.CustomerService;
import spring.msscource.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getById(UUID id) {
        return CustomerDto.builder().id(id).name("Purple rush").build();
    }
}
