package org.eichstaedt.finance;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.UUID;

/**
 * Created by konrad.eichstaedt@gmx.de on 11.07.22.
 */
@RegisterForReflection
public class Outcome {

  private String id;

  private String name;

  private float amount;

  public Outcome() {
  }

  public Outcome(String name, float amount) {
    this.id = UUID.randomUUID().toString();
    this.name = name;
    this.amount = amount;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public float getAmount() {
    return amount;
  }
}
