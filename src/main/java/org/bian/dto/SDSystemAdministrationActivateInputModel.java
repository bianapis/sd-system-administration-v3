package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationActivateInputModel
 */
public class SDSystemAdministrationActivateInputModel   {
  private Object systemAdministrationActivationActionTaskRecord = null;

  private String systemAdministrationCenterReference = null;

  private String systemAdministrationServiceReference = null;

  private SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecord systemAdministrationServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return systemAdministrationCenterReference
  **/

  public String getSystemAdministrationCenterReference() {
    return systemAdministrationCenterReference;
  }

  public void setSystemAdministrationCenterReference(String systemAdministrationCenterReference) {
    this.systemAdministrationCenterReference = systemAdministrationCenterReference;
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

  public SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecord getSystemAdministrationServiceConfigurationRecord() {
    return systemAdministrationServiceConfigurationRecord;
  }

  public void setSystemAdministrationServiceConfigurationRecord(SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecord systemAdministrationServiceConfigurationRecord) {
    this.systemAdministrationServiceConfigurationRecord = systemAdministrationServiceConfigurationRecord;
  }


}

