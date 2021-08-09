package org.facboy.mapstruct;

import java.util.Optional;

@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
public class OptionalLongBean {

  private Optional<Long> val;

  public Optional<Long> getVal() {
    return val;
  }

  public void setVal(Optional<Long> val) {
    this.val = val;
  }
}
