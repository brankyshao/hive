/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hive.ql.plan.api;


import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

public class OperatorType {
  public static final int JOIN = 0;
  public static final int MAPJOIN = 1;
  public static final int EXTRACT = 2;
  public static final int FILTER = 3;
  public static final int FORWARD = 4;
  public static final int GROUPBY = 5;
  public static final int LIMIT = 6;
  public static final int SCRIPT = 7;
  public static final int SELECT = 8;
  public static final int TABLESCAN = 9;
  public static final int FILESINK = 10;
  public static final int REDUCESINK = 11;
  public static final int UNION = 12;
  public static final int UDTF = 13;
  public static final int LATERALVIEWJOIN = 14;
  public static final int LATERALVIEWFORWARD = 15;
  public static final int JDBMDUMMY = 16;
  public static final int JDBMSINK = 17;

  public static final IntRangeSet VALID_VALUES = new IntRangeSet(
    JOIN,
    MAPJOIN,
    EXTRACT,
    FILTER,
    FORWARD,
    GROUPBY,
    LIMIT,
    SCRIPT,
    SELECT,
    TABLESCAN,
    FILESINK,
    REDUCESINK,
    UNION,
    UDTF,
    LATERALVIEWJOIN,
    LATERALVIEWFORWARD,
    JDBMDUMMY,
    JDBMSINK);

  public static final Map<Integer, String> VALUES_TO_NAMES = new HashMap<Integer, String>() {{
    put(JOIN, "JOIN");
    put(MAPJOIN, "MAPJOIN");
    put(EXTRACT, "EXTRACT");
    put(FILTER, "FILTER");
    put(FORWARD, "FORWARD");
    put(GROUPBY, "GROUPBY");
    put(LIMIT, "LIMIT");
    put(SCRIPT, "SCRIPT");
    put(SELECT, "SELECT");
    put(TABLESCAN, "TABLESCAN");
    put(FILESINK, "FILESINK");
    put(REDUCESINK, "REDUCESINK");
    put(UNION, "UNION");
    put(UDTF, "UDTF");
    put(LATERALVIEWJOIN, "LATERALVIEWJOIN");
    put(LATERALVIEWFORWARD, "LATERALVIEWFORWARD");
    put(JDBMDUMMY, "JDBMDUMMY");
    put(JDBMSINK, "JDBMSINK");
  }};
}
