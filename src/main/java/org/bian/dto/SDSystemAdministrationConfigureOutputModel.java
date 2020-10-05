package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationConfigureOutputModelSystemAdministrationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationConfigureOutputModel
 */
public class SDSystemAdministrationConfigureOutputModel   {
  private String systemAdministrationConfigurationActionTaskReference = null;

  private Object systemAdministrationConfigurationActionTaskRecord = null;

  private SDSystemAdministrationConfigureOutputModelSystemAdministrationServiceConfigurationRecord systemAdministrationServiceConfigurationRecord = null;

  private String systemAdministrationServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return systemAdministrationConfigurationActionTaskReference
  **/

  public String getSystemAdministrationConfigurationActionTaskReference() {
    return systemAdministrationConfigurationActionTaskReference;
  }

  public void setSystemAdministrationConfigurationActionTaskReference(String systemAdministrationConfigurationActionTaskReference) {
    this.systemAdministrationConfigurationActionTaskReference = systemAdministrationConfigurationActionTaskReference;
  }


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
   * Get systemAdministrationServiceConfigurationRecord
   * @return systemAdministrationServiceConfigurationRecord
  **/

  public SDSystemAdministrationConfigureOutputModelSystemAdministrationServiceConfigurationRecord getSystemAdministrationServiceConfigurationRecord() {
    return systemAdministrationServiceConfigurationRecord;
  }

  public void setSystemAdministrationServiceConfigurationRecord(SDSystemAdministrationConfigureOutputModelSystemAdministrationServiceConfigurationRecord systemAdministrationServiceConfigurationRecord) {
    this.systemAdministrationServiceConfigurationRecord = systemAdministrationServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return systemAdministrationServicingSessionStatus
  **/

  public String getSystemAdministrationServicingSessionStatus() {
    return systemAdministrationServicingSessionStatus;
  }

  public void setSystemAdministrationServicingSessionStatus(String systemAdministrationServicingSessionStatus) {
    this.systemAdministrationServicingSessionStatus = systemAdministrationServicingSessionStatus;
  }


}

