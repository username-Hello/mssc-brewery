package spring.msscource.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import spring.msscource.msscbrewery.domain.Beer;
import spring.msscource.msscbrewery.web.model.BeerDto;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
