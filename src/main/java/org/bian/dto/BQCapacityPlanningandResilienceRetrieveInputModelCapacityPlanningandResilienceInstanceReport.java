package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningandResilienceRetrieveInputModelCapacityPlanningandResilienceInstanceReport
 */
public class BQCapacityPlanningandResilienceRetrieveInputModelCapacityPlanningandResilienceInstanceReport   {
  private String capacityPlanningandResilienceInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return capacityPlanningandResilienceInstanceReportReference
  **/

  public String getCapacityPlanningandResilienceInstanceReportReference() {
    return capacityPlanningandResilienceInstanceReportReference;
  }

  public void setCapacityPlanningandResilienceInstanceReportReference(String capacityPlanningandResilienceInstanceReportReference) {
    this.capacityPlanningandResilienceInstanceReportReference = capacityPlanningandResilienceInstanceReportReference;
  }


}

