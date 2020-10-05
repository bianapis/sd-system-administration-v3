package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanExchangeOutputModel
 */
public class CRITSystemAdministrativePlanExchangeOutputModel   {
  private String itSystemAdministrativePlanBudgetType = null;

  private String itSystemAdministrativePlanAssignment = null;

  private String itSystemAdministrativePlanPlan = null;

  private String itSystemAdministrativePlanExchangeActionTaskReference = null;

  private Object itSystemAdministrativePlanExchangeActionTaskRecord = null;

  private String itSystemAdministrativePlanExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ITSystem Administrative Plan instance exchange service call 
   * @return itSystemAdministrativePlanExchangeActionTaskReference
  **/

  public String getItSystemAdministrativePlanExchangeActionTaskReference() {
    return itSystemAdministrativePlanExchangeActionTaskReference;
  }

  public void setItSystemAdministrativePlanExchangeActionTaskReference(String itSystemAdministrativePlanExchangeActionTaskReference) {
    this.itSystemAdministrativePlanExchangeActionTaskReference = itSystemAdministrativePlanExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return itSystemAdministrativePlanExchangeActionTaskRecord
  **/

  public Object getItSystemAdministrativePlanExchangeActionTaskRecord() {
    return itSystemAdministrativePlanExchangeActionTaskRecord;
  }

  public void setItSystemAdministrativePlanExchangeActionTaskRecord(Object itSystemAdministrativePlanExchangeActionTaskRecord) {
    this.itSystemAdministrativePlanExchangeActionTaskRecord = itSystemAdministrativePlanExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return itSystemAdministrativePlanExchangeActionResponse
  **/

  public String getItSystemAdministrativePlanExchangeActionResponse() {
    return itSystemAdministrativePlanExchangeActionResponse;
  }

  public void setItSystemAdministrativePlanExchangeActionResponse(String itSystemAdministrativePlanExchangeActionResponse) {
    this.itSystemAdministrativePlanExchangeActionResponse = itSystemAdministrativePlanExchangeActionResponse;
  }


}

