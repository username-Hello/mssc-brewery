package spring.msscource.msscbrewery.web.service.impl;

import spring.msscource.msscbrewery.web.model.BeerDto;
import spring.msscource.msscbrewery.web.service.BeerService;

import java.util.UUID;

public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder().id(id).name("My beer").style("Real cool style").build();
    }
}
