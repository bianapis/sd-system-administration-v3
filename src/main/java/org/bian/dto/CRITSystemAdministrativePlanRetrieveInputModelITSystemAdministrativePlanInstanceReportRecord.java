package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanRetrieveInputModelITSystemAdministrativePlanInstanceReportRecord
 */
public class CRITSystemAdministrativePlanRetrieveInputModelITSystemAdministrativePlanInstanceReportRecord   {
  private String itSystemAdministrativePlanInstanceReportReference = null;

  private String itSystemAdministrativePlanInstanceReportType = null;

  private String itSystemAdministrativePlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return itSystemAdministrativePlanInstanceReportReference
  **/

  public String getItSystemAdministrativePlanInstanceReportReference() {
    return itSystemAdministrativePlanInstanceReportReference;
  }

  public void setItSystemAdministrativePlanInstanceReportReference(String itSystemAdministrativePlanInstanceReportReference) {
    this.itSystemAdministrativePlanInstanceReportReference = itSystemAdministrativePlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return itSystemAdministrativePlanInstanceReportType
  **/

  public String getItSystemAdministrativePlanInstanceReportType() {
    return itSystemAdministrativePlanInstanceReportType;
  }

  public void setItSystemAdministrativePlanInstanceReportType(String itSystemAdministrativePlanInstanceReportType) {
    this.itSystemAdministrativePlanInstanceReportType = itSystemAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return itSystemAdministrativePlanInstanceReportParameters
  **/

  public String getItSystemAdministrativePlanInstanceReportParameters() {
    return itSystemAdministrativePlanInstanceReportParameters;
  }

  public void setItSystemAdministrativePlanInstanceReportParameters(String itSystemAdministrativePlanInstanceReportParameters) {
    this.itSystemAdministrativePlanInstanceReportParameters = itSystemAdministrativePlanInstanceReportParameters;
  }


}

