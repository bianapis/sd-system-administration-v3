package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCapacityPlanningandResilienceRetrieveInputModelCapacityPlanningandResilienceInstanceAnalysis;
import org.bian.dto.BQCapacityPlanningandResilienceRetrieveInputModelCapacityPlanningandResilienceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningandResilienceRetrieveInputModel
 */
public class BQCapacityPlanningandResilienceRetrieveInputModel   {
  private Object capacityPlanningandResilienceRetrieveActionTaskRecord = null;

  private String capacityPlanningandResilienceRetrieveActionRequest = null;

  private BQCapacityPlanningandResilienceRetrieveInputModelCapacityPlanningandResilienceInstanceReport capacityPlanningandResilienceInstanceReport = null;

  private BQCapacityPlanningandResilienceRetrieveInputModelCapacityPlanningandResilienceInstanceAnalysis capacityPlanningandResilienceInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return capacityPlanningandResilienceRetrieveActionTaskRecord
  **/

  public Object getCapacityPlanningandResilienceRetrieveActionTaskRecord() {
    return capacityPlanningandResilienceRetrieveActionTaskRecord;
  }

  public void setCapacityPlanningandResilienceRetrieveActionTaskRecord(Object capacityPlanningandResilienceRetrieveActionTaskRecord) {
    this.capacityPlanningandResilienceRetrieveActionTaskRecord = capacityPlanningandResilienceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return capacityPlanningandResilienceRetrieveActionRequest
  **/

  public String getCapacityPlanningandResilienceRetrieveActionRequest() {
    return capacityPlanningandResilienceRetrieveActionRequest;
  }

  public void setCapacityPlanningandResilienceRetrieveActionRequest(String capacityPlanningandResilienceRetrieveActionRequest) {
    this.capacityPlanningandResilienceRetrieveActionRequest = capacityPlanningandResilienceRetrieveActionRequest;
  }


  /**
   * Get capacityPlanningandResilienceInstanceReport
   * @return capacityPlanningandResilienceInstanceReport
  **/

  public BQCapacityPlanningandResilienceRetrieveInputModelCapacityPlanningandResilienceInstanceReport getCapacityPlanningandResilienceInstanceReport() {
    return capacityPlanningandResilienceInstanceReport;
  }

  public void setCapacityPlanningandResilienceInstanceReport(BQCapacityPlanningandResilienceRetrieveInputModelCapacityPlanningandResilienceInstanceReport capacityPlanningandResilienceInstanceReport) {
    this.capacityPlanningandResilienceInstanceReport = capacityPlanningandResilienceInstanceReport;
  }


  /**
   * Get capacityPlanningandResilienceInstanceAnalysis
   * @return capacityPlanningandResilienceInstanceAnalysis
  **/

  public BQCapacityPlanningandResilienceRetrieveInputModelCapacityPlanningandResilienceInstanceAnalysis getCapacityPlanningandResilienceInstanceAnalysis() {
    return capacityPlanningandResilienceInstanceAnalysis;
  }

  public void setCapacityPlanningandResilienceInstanceAnalysis(BQCapacityPlanningandResilienceRetrieveInputModelCapacityPlanningandResilienceInstanceAnalysis capacityPlanningandResilienceInstanceAnalysis) {
    this.capacityPlanningandResilienceInstanceAnalysis = capacityPlanningandResilienceInstanceAnalysis;
  }


}

