package dlte.spring.assgmt.one.dltespringsa001;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int creditCardId;
    @Column(nullable = false)
    private String cardType;
    @Column(nullable = false)
    private String expMonth;
    @Column(nullable = false)
    private int expYear;
    @Column(nullable = false)
    private int limit;
    @Column(nullable = false)
    private String cardHolders;
}
