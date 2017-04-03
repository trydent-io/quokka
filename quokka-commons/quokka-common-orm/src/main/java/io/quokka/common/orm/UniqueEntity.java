package io.quokka.common.orm;

import java.util.UUID;

public interface UniqueEntity {
//  long id();

  UUID uuid();

  default String id() { return uuid().toString(); }
}
