package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationRetrieveInputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecord
 */
public class SDSystemAdministrationRetrieveInputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecord   {
  private String systemAdministrationServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return systemAdministrationServiceVersion
  **/

  public String getSystemAdministrationServiceVersion() {
    return systemAdministrationServiceVersion;
  }

  public void setSystemAdministrationServiceVersion(String systemAdministrationServiceVersion) {
    this.systemAdministrationServiceVersion = systemAdministrationServiceVersion;
  }


}

