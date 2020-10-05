package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanUpdateOutputModel
 */
public class CRITSystemAdministrativePlanUpdateOutputModel   {
  private String itSystemAdministrativePlanBudgetType = null;

  private String itSystemAdministrativePlanAssignment = null;

  private String itSystemAdministrativePlanPlan = null;

  private String itSystemAdministrativePlanUpdateActionTaskReference = null;

  private Object itSystemAdministrativePlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return itSystemAdministrativePlanUpdateActionTaskReference
  **/

  public String getItSystemAdministrativePlanUpdateActionTaskReference() {
    return itSystemAdministrativePlanUpdateActionTaskReference;
  }

  public void setItSystemAdministrativePlanUpdateActionTaskReference(String itSystemAdministrativePlanUpdateActionTaskReference) {
    this.itSystemAdministrativePlanUpdateActionTaskReference = itSystemAdministrativePlanUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return itSystemAdministrativePlanUpdateActionTaskRecord
  **/

  public Object getItSystemAdministrativePlanUpdateActionTaskRecord() {
    return itSystemAdministrativePlanUpdateActionTaskRecord;
  }

  public void setItSystemAdministrativePlanUpdateActionTaskRecord(Object itSystemAdministrativePlanUpdateActionTaskRecord) {
    this.itSystemAdministrativePlanUpdateActionTaskRecord = itSystemAdministrativePlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

