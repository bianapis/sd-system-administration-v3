package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceAgreement;
import org.bian.dto.SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup;
import org.bian.dto.SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationConfigureOutputModelSystemAdministrationServiceConfigurationRecord
 */
public class SDSystemAdministrationConfigureOutputModelSystemAdministrationServiceConfigurationRecord   {
  private String systemAdministrationServiceConfigurationSettingDescription = null;

  private SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup systemAdministrationServiceConfigurationSetup = null;

  private SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceSubscription systemAdministrationServiceSubscription = null;

  private SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceAgreement systemAdministrationServiceAgreement = null;

  private String systemAdministrationServiceStatus = null;


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

  public SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup getSystemAdministrationServiceConfigurationSetup() {
    return systemAdministrationServiceConfigurationSetup;
  }

  public void setSystemAdministrationServiceConfigurationSetup(SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup systemAdministrationServiceConfigurationSetup) {
    this.systemAdministrationServiceConfigurationSetup = systemAdministrationServiceConfigurationSetup;
  }


  /**
   * Get systemAdministrationServiceSubscription
   * @return systemAdministrationServiceSubscription
  **/

  public SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceSubscription getSystemAdministrationServiceSubscription() {
    return systemAdministrationServiceSubscription;
  }

  public void setSystemAdministrationServiceSubscription(SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceSubscription systemAdministrationServiceSubscription) {
    this.systemAdministrationServiceSubscription = systemAdministrationServiceSubscription;
  }


  /**
   * Get systemAdministrationServiceAgreement
   * @return systemAdministrationServiceAgreement
  **/

  public SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceAgreement getSystemAdministrationServiceAgreement() {
    return systemAdministrationServiceAgreement;
  }

  public void setSystemAdministrationServiceAgreement(SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceAgreement systemAdministrationServiceAgreement) {
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

