package dlte.assessment.demo.controls;

import dlte.assessment.demo.entity.LoanEntity;
import dlte.assessment.demo.services.LoanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanController {
    @Autowired
    private LoanServices loanServices;

//This is loan controller class where we will map the methods which autowired from services

    @GetMapping("/rejected")
    public List<LoanEntity> callingFindAllRejected(){
        return loanServices.implementOfFindAllRejected();
    }

    @PutMapping("/status")
    public void callStatus(){
        loanServices.implementNewStatus();
    }

}
