package ru.filimonov.framework.argument;


import ru.filimonov.framework.Request;

import java.io.OutputStream;
import java.lang.reflect.Parameter;

public interface HandlerMethodArgumentResolver {
  boolean supportsParameter(Parameter parameter);
  Object resolveArgument(Parameter parameter, Request request, OutputStream response);
}
