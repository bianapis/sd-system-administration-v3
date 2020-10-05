package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanRetrieveOutputModelITSystemAdministrativePlanInstanceAnalysis
 */
public class CRITSystemAdministrativePlanRetrieveOutputModelITSystemAdministrativePlanInstanceAnalysis   {
  private String itSystemAdministrativePlanInstanceAnalysisData = null;

  private String itSystemAdministrativePlanInstanceAnalysisReportType = null;

  private Object itSystemAdministrativePlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return itSystemAdministrativePlanInstanceAnalysisData
  **/

  public String getItSystemAdministrativePlanInstanceAnalysisData() {
    return itSystemAdministrativePlanInstanceAnalysisData;
  }

  public void setItSystemAdministrativePlanInstanceAnalysisData(String itSystemAdministrativePlanInstanceAnalysisData) {
    this.itSystemAdministrativePlanInstanceAnalysisData = itSystemAdministrativePlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return itSystemAdministrativePlanInstanceAnalysisReport
  **/

  public Object getItSystemAdministrativePlanInstanceAnalysisReport() {
    return itSystemAdministrativePlanInstanceAnalysisReport;
  }

  public void setItSystemAdministrativePlanInstanceAnalysisReport(Object itSystemAdministrativePlanInstanceAnalysisReport) {
    this.itSystemAdministrativePlanInstanceAnalysisReport = itSystemAdministrativePlanInstanceAnalysisReport;
  }


}

