package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceAgreement
 */
public class SDSystemAdministrationConfigureInputModelSystemAdministrationServiceConfigurationRecordSystemAdministrationServiceAgreement   {
  private String systemAdministrationServiceAgreementReference = null;

  private String systemAdministrationServiceUserReference = null;

  private String systemAdministrationServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return systemAdministrationServiceAgreementReference
  **/

  public String getSystemAdministrationServiceAgreementReference() {
    return systemAdministrationServiceAgreementReference;
  }

  public void setSystemAdministrationServiceAgreementReference(String systemAdministrationServiceAgreementReference) {
    this.systemAdministrationServiceAgreementReference = systemAdministrationServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return systemAdministrationServiceUserReference
  **/

  public String getSystemAdministrationServiceUserReference() {
    return systemAdministrationServiceUserReference;
  }

  public void setSystemAdministrationServiceUserReference(String systemAdministrationServiceUserReference) {
    this.systemAdministrationServiceUserReference = systemAdministrationServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return systemAdministrationServiceAgreementTermsandConditions
  **/

  public String getSystemAdministrationServiceAgreementTermsandConditions() {
    return systemAdministrationServiceAgreementTermsandConditions;
  }

  public void setSystemAdministrationServiceAgreementTermsandConditions(String systemAdministrationServiceAgreementTermsandConditions) {
    this.systemAdministrationServiceAgreementTermsandConditions = systemAdministrationServiceAgreementTermsandConditions;
  }


}

