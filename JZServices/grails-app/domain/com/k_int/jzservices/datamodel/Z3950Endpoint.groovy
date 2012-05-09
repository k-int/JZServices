package com.k_int.jzservices.datamodel

class Z3950Endpoint extends Endpoint {

  int port

  // Z3950 Endpoint - Modes. 0=Explicit : Databases must be manually added and configured
  //                         1=Dynamic : Add a database for each datasource configured
  int mode = 0;

  static hasMany = [ databases : Z3950EndpointDatabase ]

  static constraints = {
  }
}
