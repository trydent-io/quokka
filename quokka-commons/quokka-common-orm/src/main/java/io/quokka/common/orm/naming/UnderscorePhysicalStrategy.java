package io.quokka.common.orm.naming;

import com.github.fluent.hibernate.cfg.strategy.NamingStrategyUtils;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class UnderscorePhysicalStrategy extends PhysicalNamingStrategyStandardImpl {

  @Override
  public Identifier toPhysicalTableName(Identifier identifier, JdbcEnvironment jdbc) {
    return jdbc
      .getIdentifierHelper()
      .toIdentifier(NamingStrategyUtils.classToName(identifier.getText()));
  }
}
