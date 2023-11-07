package example.cashcard;


import java.util.function.IntPredicate;

// import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CashCard {

    @Id
    private Long id;
    private Double amount;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public CashCard(Long id, Double amount) {
        this.id = id;
        this.amount = amount;
    }
    
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
