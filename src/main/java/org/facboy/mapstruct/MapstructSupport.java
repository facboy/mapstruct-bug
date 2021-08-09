package org.facboy.mapstruct;

import java.util.Optional;

import org.checkerframework.checker.nullness.qual.Nullable;

final class MapstructSupport {

  private MapstructSupport() {
  }

  static <T> Optional<T> toOptional(@Nullable T value) {
    return Optional.ofNullable(value);
  }
}
