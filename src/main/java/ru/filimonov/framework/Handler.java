package ru.filimonov.framework;

import java.io.OutputStream;

@FunctionalInterface
public interface Handler {
  void handle(final ru.filimonov.framework.Request request, final OutputStream response);
}
