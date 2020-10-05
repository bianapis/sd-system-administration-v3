package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup;
import org.bian.dto.SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceAgreement;
import org.bian.dto.SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecord
 */
public class SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecord   {
  private String systemAdministrationServiceConfigurationSettingReference = null;

  private String systemAdministrationServiceConfigurationSettingDescription = null;

  private SDSystemAdministrationActivateInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup systemAdministrationServiceConfigurationSetup = null;

  private SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceSubscription systemAdministrationServiceSubscription = null;

  private SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceAgreement systemAdministrationServiceAgreement = null;

  private String systemAdministrationServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return systemAdministrationServiceConfigurationSettingDescription
  **/

  public String getSystemAdministrationServiceConfigurationSettingDescription() {
    return systemAdministrationServiceConfigurationSettingDescription;
  }

  public void setSystemAdministrationServiceConfigurationSettingDescription(String systemAdministrationServiceConfigurationSettingDescription) {
    this.systemAdministrationServiceConfigurationSettingDescription = systemAdministrationServiceConfigurationSettingDescription;
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


  /**
   * Get systemAdministrationServiceSubscription
   * @return systemAdministrationServiceSubscription
  **/

  public SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceSubscription getSystemAdministrationServiceSubscription() {
    return systemAdministrationServiceSubscription;
  }

  public void setSystemAdministrationServiceSubscription(SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceSubscription systemAdministrationServiceSubscription) {
    this.systemAdministrationServiceSubscription = systemAdministrationServiceSubscription;
  }


  /**
   * Get systemAdministrationServiceAgreement
   * @return systemAdministrationServiceAgreement
  **/

  public SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceAgreement getSystemAdministrationServiceAgreement() {
    return systemAdministrationServiceAgreement;
  }

  public void setSystemAdministrationServiceAgreement(SDSystemAdministrationActivateOutputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceAgreement systemAdministrationServiceAgreement) {
    this.systemAdministrationServiceAgreement = systemAdministrationServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return systemAdministrationServiceStatus
  **/

  public String getSystemAdministrationServiceStatus() {
    return systemAdministrationServiceStatus;
  }

  public void setSystemAdministrationServiceStatus(String systemAdministrationServiceStatus) {
    this.systemAdministrationServiceStatus = systemAdministrationServiceStatus;
  }


}

