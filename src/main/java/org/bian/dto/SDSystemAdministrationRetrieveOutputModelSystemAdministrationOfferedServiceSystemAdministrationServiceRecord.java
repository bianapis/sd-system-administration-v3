package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecordSystemAdministrationServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecord
 */
public class SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecord   {
  private String systemAdministrationServiceType = null;

  private String systemAdministrationServiceVersion = null;

  private String systemAdministrationServiceDescription = null;

  private SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecordSystemAdministrationServicePoliciesandGuidelines systemAdministrationServicePoliciesandGuidelines = null;

  private String systemAdministrationServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return systemAdministrationServiceType
  **/

  public String getSystemAdministrationServiceType() {
    return systemAdministrationServiceType;
  }

  public void setSystemAdministrationServiceType(String systemAdministrationServiceType) {
    this.systemAdministrationServiceType = systemAdministrationServiceType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service 
   * @return systemAdministrationServiceDescription
  **/

  public String getSystemAdministrationServiceDescription() {
    return systemAdministrationServiceDescription;
  }

  public void setSystemAdministrationServiceDescription(String systemAdministrationServiceDescription) {
    this.systemAdministrationServiceDescription = systemAdministrationServiceDescription;
  }


  /**
   * Get systemAdministrationServicePoliciesandGuidelines
   * @return systemAdministrationServicePoliciesandGuidelines
  **/

  public SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecordSystemAdministrationServicePoliciesandGuidelines getSystemAdministrationServicePoliciesandGuidelines() {
    return systemAdministrationServicePoliciesandGuidelines;
  }

  public void setSystemAdministrationServicePoliciesandGuidelines(SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecordSystemAdministrationServicePoliciesandGuidelines systemAdministrationServicePoliciesandGuidelines) {
    this.systemAdministrationServicePoliciesandGuidelines = systemAdministrationServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return systemAdministrationServiceSchedule
  **/

  public String getSystemAdministrationServiceSchedule() {
    return systemAdministrationServiceSchedule;
  }

  public void setSystemAdministrationServiceSchedule(String systemAdministrationServiceSchedule) {
    this.systemAdministrationServiceSchedule = systemAdministrationServiceSchedule;
  }


}

