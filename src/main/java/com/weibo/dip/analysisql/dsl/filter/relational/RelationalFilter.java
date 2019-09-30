package com.weibo.dip.analysisql.dsl.filter.relational;

import com.weibo.dip.analysisql.dsl.filter.Filter;

/** RelationalFilter. */
public abstract class RelationalFilter extends Filter {
  public static final String STRING = "string";
  public static final String LONG = "long";
  public static final String DOUBLE = "double";

  protected String name;
  protected String type;

  public RelationalFilter() {}

  /**
   * Initializes a instance with operator, name and type.
   *
   * @param operator operator
   * @param name name
   * @param type type
   */
  public RelationalFilter(String operator, String name, String type) {
    super(operator);

    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
