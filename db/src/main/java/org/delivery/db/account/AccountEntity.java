package org.delivery.db.account;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.delivery.db.account.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "account")
@Entity
public class AccountEntity extends BaseEntity {

}
