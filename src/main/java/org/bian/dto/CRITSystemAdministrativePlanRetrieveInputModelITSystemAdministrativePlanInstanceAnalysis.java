package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanRetrieveInputModelITSystemAdministrativePlanInstanceAnalysis
 */
public class CRITSystemAdministrativePlanRetrieveInputModelITSystemAdministrativePlanInstanceAnalysis   {
  private String itSystemAdministrativePlanInstanceAnalysisReference = null;

  private String itSystemAdministrativePlanInstanceAnalysisReportType = null;

  private String itSystemAdministrativePlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return itSystemAdministrativePlanInstanceAnalysisReference
  **/

  public String getItSystemAdministrativePlanInstanceAnalysisReference() {
    return itSystemAdministrativePlanInstanceAnalysisReference;
  }

  public void setItSystemAdministrativePlanInstanceAnalysisReference(String itSystemAdministrativePlanInstanceAnalysisReference) {
    this.itSystemAdministrativePlanInstanceAnalysisReference = itSystemAdministrativePlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return itSystemAdministrativePlanInstanceAnalysisReportType
  **/

  public String getItSystemAdministrativePlanInstanceAnalysisReportType() {
    return itSystemAdministrativePlanInstanceAnalysisReportType;
  }

  public void setItSystemAdministrativePlanInstanceAnalysisReportType(String itSystemAdministrativePlanInstanceAnalysisReportType) {
    this.itSystemAdministrativePlanInstanceAnalysisReportType = itSystemAdministrativePlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return itSystemAdministrativePlanInstanceAnalysisParameters
  **/

  public String getItSystemAdministrativePlanInstanceAnalysisParameters() {
    return itSystemAdministrativePlanInstanceAnalysisParameters;
  }

  public void setItSystemAdministrativePlanInstanceAnalysisParameters(String itSystemAdministrativePlanInstanceAnalysisParameters) {
    this.itSystemAdministrativePlanInstanceAnalysisParameters = itSystemAdministrativePlanInstanceAnalysisParameters;
  }


}

