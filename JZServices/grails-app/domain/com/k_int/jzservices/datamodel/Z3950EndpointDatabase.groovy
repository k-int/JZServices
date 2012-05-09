package com.k_int.jzservices.datamodel

import com.k_int.jzservices.datamodel.DataSource 

class Z3950EndpointDatabase {

  String databaseName

  static belongsTo = [ owner : Z3950Endpoint ]

  // The datasource this database maps on to
  DataSource mapsOnto
  

    static constraints = {
    }


}
