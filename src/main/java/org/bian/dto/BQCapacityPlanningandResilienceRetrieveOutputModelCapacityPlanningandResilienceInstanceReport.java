package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningandResilienceRetrieveOutputModelCapacityPlanningandResilienceInstanceReport
 */
public class BQCapacityPlanningandResilienceRetrieveOutputModelCapacityPlanningandResilienceInstanceReport   {
  private Object capacityPlanningandResilienceInstanceReportRecord = null;

  private String capacityPlanningandResilienceInstanceReportType = null;

  private String capacityPlanningandResilienceInstanceReportParameters = null;

  private Object capacityPlanningandResilienceInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return capacityPlanningandResilienceInstanceReportRecord
  **/

  public Object getCapacityPlanningandResilienceInstanceReportRecord() {
    return capacityPlanningandResilienceInstanceReportRecord;
  }

  public void setCapacityPlanningandResilienceInstanceReportRecord(Object capacityPlanningandResilienceInstanceReportRecord) {
    this.capacityPlanningandResilienceInstanceReportRecord = capacityPlanningandResilienceInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return capacityPlanningandResilienceInstanceReportType
  **/

  public String getCapacityPlanningandResilienceInstanceReportType() {
    return capacityPlanningandResilienceInstanceReportType;
  }

  public void setCapacityPlanningandResilienceInstanceReportType(String capacityPlanningandResilienceInstanceReportType) {
    this.capacityPlanningandResilienceInstanceReportType = capacityPlanningandResilienceInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return capacityPlanningandResilienceInstanceReportParameters
  **/

  public String getCapacityPlanningandResilienceInstanceReportParameters() {
    return capacityPlanningandResilienceInstanceReportParameters;
  }

  public void setCapacityPlanningandResilienceInstanceReportParameters(String capacityPlanningandResilienceInstanceReportParameters) {
    this.capacityPlanningandResilienceInstanceReportParameters = capacityPlanningandResilienceInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return capacityPlanningandResilienceInstanceReport
  **/

  public Object getCapacityPlanningandResilienceInstanceReport() {
    return capacityPlanningandResilienceInstanceReport;
  }

  public void setCapacityPlanningandResilienceInstanceReport(Object capacityPlanningandResilienceInstanceReport) {
    this.capacityPlanningandResilienceInstanceReport = capacityPlanningandResilienceInstanceReport;
  }


}

