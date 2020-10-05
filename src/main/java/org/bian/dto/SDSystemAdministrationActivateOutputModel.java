package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationActivateOutputModel
 */
public class SDSystemAdministrationActivateOutputModel   {
  private String systemAdministrationActivationActionTaskReference = null;

  private Object systemAdministrationActivationActionTaskRecord = null;

  private String systemAdministrationServicingSessionReference = null;

  private Object systemAdministrationServicingSessionRecord = null;

  private SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecord systemAdministrationServiceConfigurationRecord = null;

  private String systemAdministrationServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return systemAdministrationActivationActionTaskReference
  **/

  public String getSystemAdministrationActivationActionTaskReference() {
    return systemAdministrationActivationActionTaskReference;
  }

  public void setSystemAdministrationActivationActionTaskReference(String systemAdministrationActivationActionTaskReference) {
    this.systemAdministrationActivationActionTaskReference = systemAdministrationActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return systemAdministrationActivationActionTaskRecord
  **/

  public Object getSystemAdministrationActivationActionTaskRecord() {
    return systemAdministrationActivationActionTaskRecord;
  }

  public void setSystemAdministrationActivationActionTaskRecord(Object systemAdministrationActivationActionTaskRecord) {
    this.systemAdministrationActivationActionTaskRecord = systemAdministrationActivationActionTaskRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return systemAdministrationServicingSessionRecord
  **/

  public Object getSystemAdministrationServicingSessionRecord() {
    return systemAdministrationServicingSessionRecord;
  }

  public void setSystemAdministrationServicingSessionRecord(Object systemAdministrationServicingSessionRecord) {
    this.systemAdministrationServicingSessionRecord = systemAdministrationServicingSessionRecord;
  }


  /**
   * Get systemAdministrationServiceConfigurationRecord
   * @return systemAdministrationServiceConfigurationRecord
  **/

  public SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecord getSystemAdministrationServiceConfigurationRecord() {
    return systemAdministrationServiceConfigurationRecord;
  }

  public void setSystemAdministrationServiceConfigurationRecord(SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecord systemAdministrationServiceConfigurationRecord) {
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

