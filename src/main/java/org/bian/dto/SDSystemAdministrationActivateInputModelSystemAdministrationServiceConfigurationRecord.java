package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecord
 */
public class SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecord   {
  private String systemAdministrationServiceConfigurationSettingReference = null;

  private String systemAdministrationServiceConfigurationSettingType = null;

  private SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup systemAdministrationServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return systemAdministrationServiceConfigurationSettingReference
  **/

  public String getSystemAdministrationServiceConfigurationSettingReference() {
    return systemAdministrationServiceConfigurationSettingReference;
  }

  public void setSystemAdministrationServiceConfigurationSettingReference(String systemAdministrationServiceConfigurationSettingReference) {
    this.systemAdministrationServiceConfigurationSettingReference = systemAdministrationServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return systemAdministrationServiceConfigurationSettingType
  **/

  public String getSystemAdministrationServiceConfigurationSettingType() {
    return systemAdministrationServiceConfigurationSettingType;
  }

  public void setSystemAdministrationServiceConfigurationSettingType(String systemAdministrationServiceConfigurationSettingType) {
    this.systemAdministrationServiceConfigurationSettingType = systemAdministrationServiceConfigurationSettingType;
  }


  /**
   * Get systemAdministrationServiceConfigurationSetup
   * @return systemAdministrationServiceConfigurationSetup
  **/

  public SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup getSystemAdministrationServiceConfigurationSetup() {
    return systemAdministrationServiceConfigurationSetup;
  }

  public void setSystemAdministrationServiceConfigurationSetup(SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup systemAdministrationServiceConfigurationSetup) {
    this.systemAdministrationServiceConfigurationSetup = systemAdministrationServiceConfigurationSetup;
  }


}

