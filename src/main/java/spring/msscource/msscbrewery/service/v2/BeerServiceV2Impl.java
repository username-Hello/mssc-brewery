package spring.msscource.msscbrewery.service.v2;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import spring.msscource.msscbrewery.web.model.v2.BeerDtoV2;
import spring.msscource.msscbrewery.web.model.v2.BeerStyle;

import java.util.UUID;

@Service
@AllArgsConstructor
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID id) {
        return BeerDtoV2.builder()
                .id(id)
                .name("My beer")
                .style(BeerStyle.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .name("Purple man")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        //todo create realization
    }

    @Override
    public void deleteBeer(UUID beerId) {
        //todo create realization
    }
}
