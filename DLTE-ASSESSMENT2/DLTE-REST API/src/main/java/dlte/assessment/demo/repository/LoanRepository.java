package dlte.assessment.demo.repository;

import dlte.assessment.demo.entity.LoanEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface LoanRepository  extends CrudRepository<LoanEntity, Long> {
    //the below query is used to find the status of loan which are rejected
    @Query("from LoanEntity where statusOfApproval='rejected' ")
    List<LoanEntity> findAllRejected();
    @Modifying
    @Transactional
    //the below query is used to check the loan approved status that is approved and cibil score >700 along with profession
    @Query("update LoanEntity set statusOfApproval='approved' where cibilScore>700 and professionName in('Salaried','self-employeed') and incomePerAnnum>=3*requestedAmount" )
    void newStatus();


}
