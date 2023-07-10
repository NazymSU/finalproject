package kz.bitlab.techorda.finalproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "source_account_id")
    private Long sourceAccountId;
    @Column(name = "target_account_id ")
    private  Long targetAccountId;
    @Column (name = "amount")
    private  double amount;
    @Column (name = "timestamp")
    private LocalDateTime timestamp;
    @OneToMany
    private List<Account> accounts;

}
