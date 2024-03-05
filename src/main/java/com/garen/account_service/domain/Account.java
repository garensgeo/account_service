package com.garen.account_service.domain;

import com.garen.account_service.constant.AccountType;
//import jakarta.*;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="account")
public class Account extends AbstractBaseEntity{

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customers customer ;


    @Enumerated(EnumType.STRING)
    @Column(name = "account_type")
    private AccountType accountType;

    @Column(name = "clr_bal")
    private BigDecimal clrBal;

}
