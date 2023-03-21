package dlte.spring.assgmt.one.dltespringsa001;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    @Autowired
    private CardRepository repository;

    public CreditCard implementationOfSave(CreditCard creditCard) {
        return repository.save(creditCard);

    }


    public List<CreditCard> implementationOfFindAll() {
        return (List<CreditCard>) repository.findAll();
    }

    public String implementOfDeleteById(int creditCardId) {
        repository.deleteById(creditCardId);
        return "Deleted";
    }

//    public Optional<CreditCard> implementOfFindAllByExpYear(int expYear) {
//        return repository.findAllByExpYear(expYear);
//   }

    public List<CreditCard> implementFindAllByLimit(int limit) {
        return repository.findAllByLimit(limit);
    }


//    public List<CreditCard> implementOfFindAllByExpiryYear(int expYear) {
//        return repository.findAllByExpiryYear(expYear);
//    }
}
