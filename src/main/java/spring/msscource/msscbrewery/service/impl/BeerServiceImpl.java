package spring.msscource.msscbrewery.service.impl;

import org.springframework.stereotype.Service;
import spring.msscource.msscbrewery.web.model.BeerDto;
import spring.msscource.msscbrewery.service.BeerService;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder()
                .id(id)
                .name("My beer")
                .style("Real cool style")
                .build();
    }

    @Override
    public BeerDto createBeer() {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .name("Purple man")
                .build();
    }
}
