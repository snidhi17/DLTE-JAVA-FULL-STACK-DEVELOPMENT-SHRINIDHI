package dlte.spring.assgmt.one.dltespringsa001;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CardRepository extends CrudRepository<CreditCard,Integer> {
//   @Query(" from CreditCard where expYear=:expYear")
 //  Optional<CreditCard> findAllByExpiryYear(int expYear);
    @Query("from CreditCard where limit=:limit")
    List<CreditCard> findAllByLimit(int limit);


   // Optional<CreditCard> findAllByExpiryYear(int expYear);
}
//expiry year commented