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
 * SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecord
 */
public class SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecord   {
  private String systemAdministrationServiceConfigurationSettingReference = null;

  private String systemAdministrationServiceConfigurationSettingType = null;

  private SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceConfigurationSetup systemAdministrationServiceConfigurationSetup = null;

  private SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceSubscription systemAdministrationServiceSubscription = null;

  private SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceAgreement systemAdministrationServiceAgreement = null;


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


}

