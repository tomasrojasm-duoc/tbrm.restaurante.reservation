package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TableResponseDto {

    Long id;
    Integer tableNumber;
    Integer capacity;
    String status;
}