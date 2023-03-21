package dlte.spring.assgmt.one.dltespringsa001;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardController {
    @Autowired
    private CardService creditService;

    @GetMapping("/retrieve")
    public List<CreditCard> callingFindAll(){
        return creditService.implementationOfFindAll();

    }

    @PostMapping("/insert")
    public CreditCard callingSave(@RequestBody CreditCard creditCard){
        return creditService.implementationOfSave(creditCard);
    }

    //deleting
    @DeleteMapping("/suspend/{creditCardId}")
    public String callDeleteById(@PathVariable("creditCardId") int creditCardId){
        return creditService.implementOfDeleteById(creditCardId);
    }

    //finding card by expiry year-userdefined method
//   @GetMapping("/year/{expYear}")
//    public  List<CreditCard> callingFindAllByExpiryYear(@PathVariable("expYear") int expYear){
//        return creditService.implementOfFindAllByExpiryYear(expYear);
//    }

    @GetMapping("/card/{limit}")
    public List<CreditCard> callFindAllByLimit(@PathVariable("limit") int limit) {
        return creditService.implementFindAllByLimit(limit);
    }
}
