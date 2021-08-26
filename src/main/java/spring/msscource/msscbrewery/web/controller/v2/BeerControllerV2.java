package spring.msscource.msscbrewery.web.controller.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import spring.msscource.msscbrewery.service.v2.BeerServiceV2;
import spring.msscource.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

import static spring.msscource.msscbrewery.constant.WebConstants.BEER_ENDPOINT;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("api/v2/beer")
public class BeerControllerV2 {

    private BeerServiceV2 beerService;

    private Environment env;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createBeer(@RequestBody BeerDtoV2 beerDto) {
        BeerDtoV2 savedDto = beerService.saveBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", env.getProperty(BEER_ENDPOINT) + "/" + savedDto.getId());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> updateBeer(@PathVariable UUID beerId, @RequestBody BeerDtoV2 beerDto) {
        beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId) {
        beerService.deleteBeer(beerId);
    }
}
