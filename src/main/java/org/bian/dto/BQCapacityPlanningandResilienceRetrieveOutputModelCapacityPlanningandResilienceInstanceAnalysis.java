package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningandResilienceRetrieveOutputModelCapacityPlanningandResilienceInstanceAnalysis
 */
public class BQCapacityPlanningandResilienceRetrieveOutputModelCapacityPlanningandResilienceInstanceAnalysis   {
  private Object capacityPlanningandResilienceInstanceAnalysisRecord = null;

  private String capacityPlanningandResilienceInstanceAnalysisReportType = null;

  private String capacityPlanningandResilienceInstanceAnalysisParameters = null;

  private Object capacityPlanningandResilienceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return capacityPlanningandResilienceInstanceAnalysisRecord
  **/

  public Object getCapacityPlanningandResilienceInstanceAnalysisRecord() {
    return capacityPlanningandResilienceInstanceAnalysisRecord;
  }

  public void setCapacityPlanningandResilienceInstanceAnalysisRecord(Object capacityPlanningandResilienceInstanceAnalysisRecord) {
    this.capacityPlanningandResilienceInstanceAnalysisRecord = capacityPlanningandResilienceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return capacityPlanningandResilienceInstanceAnalysisReportType
  **/

  public String getCapacityPlanningandResilienceInstanceAnalysisReportType() {
    return capacityPlanningandResilienceInstanceAnalysisReportType;
  }

  public void setCapacityPlanningandResilienceInstanceAnalysisReportType(String capacityPlanningandResilienceInstanceAnalysisReportType) {
    this.capacityPlanningandResilienceInstanceAnalysisReportType = capacityPlanningandResilienceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return capacityPlanningandResilienceInstanceAnalysisParameters
  **/

  public String getCapacityPlanningandResilienceInstanceAnalysisParameters() {
    return capacityPlanningandResilienceInstanceAnalysisParameters;
  }

  public void setCapacityPlanningandResilienceInstanceAnalysisParameters(String capacityPlanningandResilienceInstanceAnalysisParameters) {
    this.capacityPlanningandResilienceInstanceAnalysisParameters = capacityPlanningandResilienceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return capacityPlanningandResilienceInstanceAnalysisReport
  **/

  public Object getCapacityPlanningandResilienceInstanceAnalysisReport() {
    return capacityPlanningandResilienceInstanceAnalysisReport;
  }

  public void setCapacityPlanningandResilienceInstanceAnalysisReport(Object capacityPlanningandResilienceInstanceAnalysisReport) {
    this.capacityPlanningandResilienceInstanceAnalysisReport = capacityPlanningandResilienceInstanceAnalysisReport;
  }


}

