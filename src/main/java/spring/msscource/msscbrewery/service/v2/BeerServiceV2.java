package spring.msscource.msscbrewery.service.v2;

import spring.msscource.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID id);

    BeerDtoV2 saveBeer(BeerDtoV2 BeerDtoV2);

    void updateBeer(UUID beerId, BeerDtoV2 BeerDtoV2);

    void deleteBeer(UUID beerId);
}
