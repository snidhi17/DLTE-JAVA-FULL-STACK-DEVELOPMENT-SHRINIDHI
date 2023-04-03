package dlte.assessment.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

//we will use the lombok dependencies
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class LoanEntity {
    @Id
    //to give name for sequence we create
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "loan_seq")
    //define data members
    private long loanRequestNumber;
    @Column(nullable = false) //value should not be null
    private long requestedAmount;
    @Column(nullable = false)
    private Integer cibilScore;
    @Column(nullable = false)
    private long aadharNumber;
    @Column(nullable = false)
    private String  panNumber;
    @Column(nullable = false)
    private String professionName;
    @Column(nullable = false)
    private Integer incomePerAnnum;
    @Column(nullable = false)
    private String statusOfApproval;
    @Temporal(TemporalType.DATE)
    private Date dateOfApproval;

}
