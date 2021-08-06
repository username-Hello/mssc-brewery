package spring.msscource.msscbrewery.service;

import spring.msscource.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getById(UUID id);
}
