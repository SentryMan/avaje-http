package io.avaje.http.generator.core;

import java.util.Map;

public final class PrimitiveUtil {

  private PrimitiveUtil() {}

  static final Map<String, String> wrapperMap =
      Map.of(
          "char", "Character",
          "byte", "Byte",
          "int", "Integer",
          "long", "Long",
          "short", "Short",
          "double", "Double",
          "float", "Float",
          "boolean", "Boolean",
          "void", "Void");

  public static String wrap(String shortName) {
    final var wrapped = wrapperMap.get(shortName);
    return wrapped != null ? wrapped : shortName;
  }
}
