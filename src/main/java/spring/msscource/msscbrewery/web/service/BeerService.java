package spring.msscource.msscbrewery.web.service;

import spring.msscource.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID id);
}
