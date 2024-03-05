package com.garen.account_service.domain;
import com.garen.account_service.constant.AccountType;


import lombok.*;
import org.hibernate.annotations.Table;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="customers")
public class Customers extends AbstractBaseEntity {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "bvn", nullable = false)
    private String bvn;
}
