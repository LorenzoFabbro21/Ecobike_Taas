package microservice.bookingservice.dto;

import lombok.*;


@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BikeUser {
    private User user;
    private Bike bike;
}