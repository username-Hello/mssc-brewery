package spring.msscource.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import spring.msscource.msscbrewery.domain.Customer;
import spring.msscource.msscbrewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
