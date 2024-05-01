package com.ltnc.be.domain;

import lombok.Getter;
import lombok.NonNull;

@Getter
public abstract class BaseException extends Exception {
  private @NonNull final String code;

  public BaseException(@NonNull final String message, @NonNull final String code) {
    super(message);
    this.code = code;
  }
}
