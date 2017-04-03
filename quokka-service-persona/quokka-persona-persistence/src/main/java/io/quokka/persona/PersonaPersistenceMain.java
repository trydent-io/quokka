package io.quokka.persona;

import io.quokka.persona.orm.Person;
import org.jooby.Jooby;
import org.jooby.hbm.Hbm;
import org.jooby.hbm.UnitOfWork;

import java.io.Serializable;
import java.time.LocalDate;

public class PersonaPersistenceMain extends Jooby {
  private static final String PERSONA = "db.persona";

  {
    use(new Hbm(PERSONA).classes(Person.class));

    get("/", request -> {
      try {
        return require(UnitOfWork.class).apply(session -> {
          final Person person = Person.builder()
            .birthName("Luca")
            .familyName("Guadagnini")
            .birthDate(LocalDate.of(1981, 4, 26))
            .birthPlace("Trento")
            .build();

          final Serializable saved = session.save(person);
          return saved;
        });
      } catch (Throwable throwable) {
        throwable.printStackTrace();
      }

      return "Hi there";
    });
  }

  public static void main(String[] args) {
    run(PersonaPersistenceMain::new);
  }
}
