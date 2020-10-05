package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanInitiateOutputModel
 */
public class CRITSystemAdministrativePlanInitiateOutputModel   {
  private String itSystemAdministrativePlanInstanceReference = null;

  private String itSystemAdministrativePlanInitiateActionReference = null;

  private Object itSystemAdministrativePlanInitiateActionRecord = null;

  private String itSystemAdministrativePlanInstanceStatus = null;

  private String itSystemAdministrativePlanBudgetType = null;

  private String itSystemAdministrativePlanAssignment = null;

  private String itSystemAdministrativePlanPlan = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the ITSystem Administrative Plan instance 
   * @return itSystemAdministrativePlanInstanceReference
  **/

  public String getItSystemAdministrativePlanInstanceReference() {
    return itSystemAdministrativePlanInstanceReference;
  }

  public void setItSystemAdministrativePlanInstanceReference(String itSystemAdministrativePlanInstanceReference) {
    this.itSystemAdministrativePlanInstanceReference = itSystemAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return itSystemAdministrativePlanInitiateActionReference
  **/

  public String getItSystemAdministrativePlanInitiateActionReference() {
    return itSystemAdministrativePlanInitiateActionReference;
  }

  public void setItSystemAdministrativePlanInitiateActionReference(String itSystemAdministrativePlanInitiateActionReference) {
    this.itSystemAdministrativePlanInitiateActionReference = itSystemAdministrativePlanInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return itSystemAdministrativePlanInitiateActionRecord
  **/

  public Object getItSystemAdministrativePlanInitiateActionRecord() {
    return itSystemAdministrativePlanInitiateActionRecord;
  }

  public void setItSystemAdministrativePlanInitiateActionRecord(Object itSystemAdministrativePlanInitiateActionRecord) {
    this.itSystemAdministrativePlanInitiateActionRecord = itSystemAdministrativePlanInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the ITSystem Administrative Plan instance (e.g. initialised, pending, active) 
   * @return itSystemAdministrativePlanInstanceStatus
  **/

  public String getItSystemAdministrativePlanInstanceStatus() {
    return itSystemAdministrativePlanInstanceStatus;
  }

  public void setItSystemAdministrativePlanInstanceStatus(String itSystemAdministrativePlanInstanceStatus) {
    this.itSystemAdministrativePlanInstanceStatus = itSystemAdministrativePlanInstanceStatus;
  }


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


}

