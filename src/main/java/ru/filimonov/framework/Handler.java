package ru.filimonov.framework;

import java.io.OutputStream;

@FunctionalInterface
public interface Handler {
  void handle(final org.example.http.framework.Request request, final OutputStream response);
}
