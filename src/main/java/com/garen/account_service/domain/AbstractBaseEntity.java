package com.garen.account_service.domain;



import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;


@Getter
@Setter
@MappedSuperclass
public class AbstractBaseEntity implements Serializable {

    private static final long serialVersionUID = -8976037087499915098L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Version
    protected Long version = 0L;

    @CreatedDate
    @Column(name = "created_date")
    protected LocalDateTime createdDate;

    @CreatedBy
    @Column(name = "created_by")
    protected String createdBy = "SYSTEM";

    @LastModifiedDate
    @Column(name = "last_modified_by", nullable = false)
    protected String lastModifiedBy = "SYSTEM";

    @LastModifiedDate
    @Column(name = "last_modified_date")
    protected LocalDateTime lastModifiedDate;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractBaseEntity that = (AbstractBaseEntity) o;
        return Objects.equals(id, that.id)
                && Objects.equals(version, that.version)
                && Objects.equals(createdDate, that.createdDate)
                && Objects.equals(createdBy, that.createdBy)
                && Objects.equals(lastModifiedDate, that.lastModifiedDate)
                && Objects.equals(lastModifiedBy, that.lastModifiedBy);

    }
        @Override
        public int hashCode() {
            return Objects.hash(id, version, createdDate, createdBy, lastModifiedDate, lastModifiedBy);
        }
}
