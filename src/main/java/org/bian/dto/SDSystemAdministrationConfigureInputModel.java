package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationConfigureInputModel
 */
public class SDSystemAdministrationConfigureInputModel   {
  private Object systemAdministrationConfigurationActionTaskRecord = null;

  private String systemAdministrationServicingSessionReference = null;

  private String systemAdministrationServiceReference = null;

  private SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecord systemAdministrationServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return systemAdministrationConfigurationActionTaskRecord
  **/

  public Object getSystemAdministrationConfigurationActionTaskRecord() {
    return systemAdministrationConfigurationActionTaskRecord;
  }

  public void setSystemAdministrationConfigurationActionTaskRecord(Object systemAdministrationConfigurationActionTaskRecord) {
    this.systemAdministrationConfigurationActionTaskRecord = systemAdministrationConfigurationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return systemAdministrationServicingSessionReference
  **/

  public String getSystemAdministrationServicingSessionReference() {
    return systemAdministrationServicingSessionReference;
  }

  public void setSystemAdministrationServicingSessionReference(String systemAdministrationServicingSessionReference) {
    this.systemAdministrationServicingSessionReference = systemAdministrationServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return systemAdministrationServiceReference
  **/

  public String getSystemAdministrationServiceReference() {
    return systemAdministrationServiceReference;
  }

  public void setSystemAdministrationServiceReference(String systemAdministrationServiceReference) {
    this.systemAdministrationServiceReference = systemAdministrationServiceReference;
  }


  /**
   * Get systemAdministrationServiceConfigurationRecord
   * @return systemAdministrationServiceConfigurationRecord
  **/

  public SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecord getSystemAdministrationServiceConfigurationRecord() {
    return systemAdministrationServiceConfigurationRecord;
  }

  public void setSystemAdministrationServiceConfigurationRecord(SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecord systemAdministrationServiceConfigurationRecord) {
    this.systemAdministrationServiceConfigurationRecord = systemAdministrationServiceConfigurationRecord;
  }


}

