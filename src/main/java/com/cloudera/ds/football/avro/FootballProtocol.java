/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.cloudera.ds.football.avro;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface FootballProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"FootballProtocol\",\"namespace\":\"com.cloudera.ds.football.avro\",\"types\":[{\"type\":\"record\",\"name\":\"StatSummary\",\"fields\":[{\"name\":\"mean\",\"type\":\"double\"},{\"name\":\"variance\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"StatsByYear\",\"fields\":[{\"name\":\"year\",\"type\":\"int\"},{\"name\":\"totalGamesPlayed\",\"type\":\"int\"},{\"name\":\"passingStats\",\"type\":\"StatSummary\"},{\"name\":\"receivingStats\",\"type\":\"StatSummary\"},{\"name\":\"rushingStats\",\"type\":\"StatSummary\"},{\"name\":\"totalStats\",\"type\":\"StatSummary\"}]},{\"type\":\"record\",\"name\":\"PlayerYearlyStats\",\"fields\":[{\"name\":\"playerId\",\"type\":\"string\"},{\"name\":\"statsByYear\",\"type\":{\"type\":\"array\",\"items\":\"StatsByYear\"}}]},{\"type\":\"record\",\"name\":\"RosterStats\",\"fields\":[{\"name\":\"qb\",\"type\":\"string\"},{\"name\":\"rb1\",\"type\":\"string\"},{\"name\":\"rb2\",\"type\":\"string\"},{\"name\":\"wr1\",\"type\":\"string\"},{\"name\":\"wr2\",\"type\":\"string\"},{\"name\":\"te\",\"type\":\"string\"},{\"name\":\"k\",\"type\":\"string\"},{\"name\":\"flex\",\"type\":\"string\"},{\"name\":\"def\",\"type\":\"string\"},{\"name\":\"meanTotal\",\"type\":\"double\"},{\"name\":\"varianceTotal\",\"type\":\"double\"}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  public interface Callback extends FootballProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = com.cloudera.ds.football.avro.FootballProtocol.PROTOCOL;
  }
}