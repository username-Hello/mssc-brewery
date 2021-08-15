package spring.msscource.msscbrewery.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring.msscource.msscbrewery.web.model.BeerDto;

import java.util.UUID;

@Service
@AllArgsConstructor
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
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .name("Purple man")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo create realization
    }

    @Override
    public void deleteBeer(UUID beerId) {
        //todo create realization
    }
}
