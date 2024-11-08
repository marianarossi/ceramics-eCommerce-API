package mariana.thePotteryPlace.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import mariana.thePotteryPlace.model.User;

import java.util.Date;

@Data
public class OrderDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
