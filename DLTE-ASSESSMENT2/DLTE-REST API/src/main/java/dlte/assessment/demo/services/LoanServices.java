package dlte.assessment.demo.services;

import dlte.assessment.demo.entity.LoanEntity;
import dlte.assessment.demo.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanServices {
    @Autowired
    private LoanRepository loanRepository;

    public List<LoanEntity> implementOfFetch(){
        return (List<LoanEntity>) loanRepository.findAll();
    }

    public List<LoanEntity> implementOfFindAllRejected(){
        return loanRepository.findAllRejected();
    }
    public void implementNewStatus(){
        loanRepository.newStatus();
    }


}
