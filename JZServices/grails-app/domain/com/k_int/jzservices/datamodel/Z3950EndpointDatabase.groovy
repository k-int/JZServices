package com.k_int.jzservices.datamodel

class Z3950EndpointDatabase {

  String databaseName

  static belongsTo = [ owner : Z3950Endpoint ]

    static constraints = {
    }


}
