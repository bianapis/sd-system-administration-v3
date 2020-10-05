package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanControlOutputModel
 */
public class CRITSystemAdministrativePlanControlOutputModel   {
  private String itSystemAdministrativePlanBudgetType = null;

  private String itSystemAdministrativePlanAssignment = null;

  private String itSystemAdministrativePlanPlan = null;

  private String itSystemAdministrativePlanControlActionTaskReference = null;

  private Object itSystemAdministrativePlanControlActionTaskRecord = null;

  private String itSystemAdministrativePlanControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Budgets within ITSystem Administrative Plan according to the type of resource and/or activity that is budgetted 
   * @return itSystemAdministrativePlanBudgetType
  **/

  public String getItSystemAdministrativePlanBudgetType() {
    return itSystemAdministrativePlanBudgetType;
  }

  public void setItSystemAdministrativePlanBudgetType(String itSystemAdministrativePlanBudgetType) {
    this.itSystemAdministrativePlanBudgetType = itSystemAdministrativePlanBudgetType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allocation of someone or something which is specified for ITSystem Administrative Plan 
   * @return itSystemAdministrativePlanAssignment
  **/

  public String getItSystemAdministrativePlanAssignment() {
    return itSystemAdministrativePlanAssignment;
  }

  public void setItSystemAdministrativePlanAssignment(String itSystemAdministrativePlanAssignment) {
    this.itSystemAdministrativePlanAssignment = itSystemAdministrativePlanAssignment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A plan that defines clerical support for ITSystem 
   * @return itSystemAdministrativePlanPlan
  **/

  public String getItSystemAdministrativePlanPlan() {
    return itSystemAdministrativePlanPlan;
  }

  public void setItSystemAdministrativePlanPlan(String itSystemAdministrativePlanPlan) {
    this.itSystemAdministrativePlanPlan = itSystemAdministrativePlanPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ITSystem Administrative Plan instance control processing service call 
   * @return itSystemAdministrativePlanControlActionTaskReference
  **/

  public String getItSystemAdministrativePlanControlActionTaskReference() {
    return itSystemAdministrativePlanControlActionTaskReference;
  }

  public void setItSystemAdministrativePlanControlActionTaskReference(String itSystemAdministrativePlanControlActionTaskReference) {
    this.itSystemAdministrativePlanControlActionTaskReference = itSystemAdministrativePlanControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return itSystemAdministrativePlanControlActionTaskRecord
  **/

  public Object getItSystemAdministrativePlanControlActionTaskRecord() {
    return itSystemAdministrativePlanControlActionTaskRecord;
  }

  public void setItSystemAdministrativePlanControlActionTaskRecord(Object itSystemAdministrativePlanControlActionTaskRecord) {
    this.itSystemAdministrativePlanControlActionTaskRecord = itSystemAdministrativePlanControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return itSystemAdministrativePlanControlActionResponse
  **/

  public String getItSystemAdministrativePlanControlActionResponse() {
    return itSystemAdministrativePlanControlActionResponse;
  }

  public void setItSystemAdministrativePlanControlActionResponse(String itSystemAdministrativePlanControlActionResponse) {
    this.itSystemAdministrativePlanControlActionResponse = itSystemAdministrativePlanControlActionResponse;
  }


}

