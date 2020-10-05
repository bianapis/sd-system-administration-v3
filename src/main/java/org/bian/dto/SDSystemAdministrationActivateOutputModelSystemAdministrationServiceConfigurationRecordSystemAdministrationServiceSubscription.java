package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceSubscription
 */
public class SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceSubscription   {
  private String systemAdministrationServiceSubscriberReference = null;

  private String systemAdministrationServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return systemAdministrationServiceSubscriberReference
  **/

  public String getSystemAdministrationServiceSubscriberReference() {
    return systemAdministrationServiceSubscriberReference;
  }

  public void setSystemAdministrationServiceSubscriberReference(String systemAdministrationServiceSubscriberReference) {
    this.systemAdministrationServiceSubscriberReference = systemAdministrationServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return systemAdministrationServiceSubscriberAccessProfile
  **/

  public String getSystemAdministrationServiceSubscriberAccessProfile() {
    return systemAdministrationServiceSubscriberAccessProfile;
  }

  public void setSystemAdministrationServiceSubscriberAccessProfile(String systemAdministrationServiceSubscriberAccessProfile) {
    this.systemAdministrationServiceSubscriberAccessProfile = systemAdministrationServiceSubscriberAccessProfile;
  }


}

