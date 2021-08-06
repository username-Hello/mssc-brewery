package spring.msscource.msscbrewery.web.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.msscource.msscbrewery.web.model.BeerDto;
import spring.msscource.msscbrewery.service.BeerService;

import java.util.UUID;

import static spring.msscource.msscbrewery.constant.WebConstants.BEER_ENDPOINT;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("api/v1/beer")
public class BeerController {

    private BeerService beerService;

    private Environment env;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> handlePost() {
        BeerDto savedDto = beerService.createBeer();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", env.getProperty(BEER_ENDPOINT) + "/" + savedDto.getId());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

}




