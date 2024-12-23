package mariana.thePotteryPlace.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_product")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 50)
    private String title;

    @NotNull
    private String text;

    @NotNull
    private String img;

    @NotNull
    private BigDecimal price;

    @NotNull
    private String installment;

    @NotNull
    private String color;

    @NotNull
    private BigDecimal height;

    @NotNull
    private BigDecimal width;

    @NotNull
    private String recommended_environment;

    @NotNull
    private String recommended_for_plants;

    @NotNull
    private String img1;

    @NotNull
    private String img2;

    @NotNull
    private String img3;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

}
