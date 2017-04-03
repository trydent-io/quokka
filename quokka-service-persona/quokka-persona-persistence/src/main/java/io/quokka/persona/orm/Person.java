package io.quokka.persona.orm;

import io.quokka.common.orm.AbstractUniqueEntity;
import io.quokka.common.orm.UniqueEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Data
@Entity
@Builder
@EqualsAndHashCode(callSuper = true)
@Accessors(fluent = true, chain = true)
public final class Person extends AbstractUniqueEntity implements UniqueEntity {
  @Column(length = 45)
  private String birthName;
  @Column(length = 45)
  private String middleName;
  @Column(length = 75)
  private String familyName;

  private LocalDate birthDate;
  private String birthPlace;
}
