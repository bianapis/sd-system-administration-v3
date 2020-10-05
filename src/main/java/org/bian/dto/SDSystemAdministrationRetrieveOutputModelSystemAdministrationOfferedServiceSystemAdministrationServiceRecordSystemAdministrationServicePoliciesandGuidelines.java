package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecordSystemAdministrationServicePoliciesandGuidelines
 */
public class SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedServiceSystemAdministrationServiceRecordSystemAdministrationServicePoliciesandGuidelines   {
  private String systemAdministrationServiceEligibility = null;

  private String systemAdministrationServiceIntendedUses = null;

  private String systemAdministrationServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return systemAdministrationServiceEligibility
  **/

  public String getSystemAdministrationServiceEligibility() {
    return systemAdministrationServiceEligibility;
  }

  public void setSystemAdministrationServiceEligibility(String systemAdministrationServiceEligibility) {
    this.systemAdministrationServiceEligibility = systemAdministrationServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return systemAdministrationServiceIntendedUses
  **/

  public String getSystemAdministrationServiceIntendedUses() {
    return systemAdministrationServiceIntendedUses;
  }

  public void setSystemAdministrationServiceIntendedUses(String systemAdministrationServiceIntendedUses) {
    this.systemAdministrationServiceIntendedUses = systemAdministrationServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return systemAdministrationServicePricingandTerms
  **/

  public String getSystemAdministrationServicePricingandTerms() {
    return systemAdministrationServicePricingandTerms;
  }

  public void setSystemAdministrationServicePricingandTerms(String systemAdministrationServicePricingandTerms) {
    this.systemAdministrationServicePricingandTerms = systemAdministrationServicePricingandTerms;
  }


}

