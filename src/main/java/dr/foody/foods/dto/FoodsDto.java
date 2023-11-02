package dr.foody.foods.dto;

import lombok.Data;

@Data
public class FoodsDto {
    private Integer food_idx;
    private String food_name;
    private Integer food_weight;
    private Integer food_season;
}
