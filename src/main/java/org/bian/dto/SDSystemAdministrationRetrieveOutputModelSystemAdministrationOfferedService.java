package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecord;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedService
 */
public class SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedService   {
  private String systemAdministrationServiceReference = null;

  private SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecord systemAdministrationServiceRecord = null;


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
   * Get systemAdministrationServiceRecord
   * @return systemAdministrationServiceRecord
  **/

  public SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecord getSystemAdministrationServiceRecord() {
    return systemAdministrationServiceRecord;
  }

  public void setSystemAdministrationServiceRecord(SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecord systemAdministrationServiceRecord) {
    this.systemAdministrationServiceRecord = systemAdministrationServiceRecord;
  }


}

