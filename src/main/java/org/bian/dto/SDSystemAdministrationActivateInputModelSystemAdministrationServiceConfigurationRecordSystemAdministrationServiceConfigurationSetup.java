package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup
 */
public class SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup   {
  private String systemAdministrationServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter 
   * @return systemAdministrationServiceConfigurationParameter
  **/

  public String getSystemAdministrationServiceConfigurationParameter() {
    return systemAdministrationServiceConfigurationParameter;
  }

  public void setSystemAdministrationServiceConfigurationParameter(String systemAdministrationServiceConfigurationParameter) {
    this.systemAdministrationServiceConfigurationParameter = systemAdministrationServiceConfigurationParameter;
  }


}

