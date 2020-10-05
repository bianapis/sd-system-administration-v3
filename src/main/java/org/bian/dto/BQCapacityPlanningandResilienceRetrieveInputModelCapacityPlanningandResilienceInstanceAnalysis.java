package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningandResilienceRetrieveInputModelCapacityPlanningandResilienceInstanceAnalysis
 */
public class BQCapacityPlanningandResilienceRetrieveInputModelCapacityPlanningandResilienceInstanceAnalysis   {
  private String capacityPlanningandResilienceInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return capacityPlanningandResilienceInstanceAnalysisReference
  **/

  public String getCapacityPlanningandResilienceInstanceAnalysisReference() {
    return capacityPlanningandResilienceInstanceAnalysisReference;
  }

  public void setCapacityPlanningandResilienceInstanceAnalysisReference(String capacityPlanningandResilienceInstanceAnalysisReference) {
    this.capacityPlanningandResilienceInstanceAnalysisReference = capacityPlanningandResilienceInstanceAnalysisReference;
  }


}

