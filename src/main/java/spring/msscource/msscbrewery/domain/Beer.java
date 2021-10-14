package spring.msscource.msscbrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.msscource.msscbrewery.web.model.v2.BeerStyle;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    private UUID id;
    private String name;
    private BeerStyle style;
    private Long upc;
}