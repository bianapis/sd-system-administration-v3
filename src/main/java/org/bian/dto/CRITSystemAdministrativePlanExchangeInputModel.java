package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAdministrativePlanExchangeInputModelITSystemAdministrativePlanExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanExchangeInputModel
 */
public class CRITSystemAdministrativePlanExchangeInputModel   {
  private String systemAdministrationServicingSessionReference = null;

  private String itSystemAdministrativePlanInstanceReference = null;

  private String itSystemAdministrativePlanBudgetType = null;

  private String itSystemAdministrativePlanAssignment = null;

  private String itSystemAdministrativePlanPlan = null;

  private String itSystemAdministrativePlanReference = null;

  private Object itSystemAdministrativePlanExchangeActionTaskRecord = null;

  private CRITSystemAdministrativePlanExchangeInputModelITSystemAdministrativePlanExchangeActionRequest itSystemAdministrativePlanExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return systemAdministrationServicingSessionReference
  **/

  public String getSystemAdministrationServicingSessionReference() {
    return systemAdministrationServicingSessionReference;
  }

  public void setSystemAdministrationServicingSessionReference(String systemAdministrationServicingSessionReference) {
    this.systemAdministrationServicingSessionReference = systemAdministrationServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Party who is involved in ITSystem Administrative Plan 
   * @return itSystemAdministrativePlanReference
  **/

  public String getItSystemAdministrativePlanReference() {
    return itSystemAdministrativePlanReference;
  }

  public void setItSystemAdministrativePlanReference(String itSystemAdministrativePlanReference) {
    this.itSystemAdministrativePlanReference = itSystemAdministrativePlanReference;
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
   * Get itSystemAdministrativePlanExchangeActionRequest
   * @return itSystemAdministrativePlanExchangeActionRequest
  **/

  public CRITSystemAdministrativePlanExchangeInputModelITSystemAdministrativePlanExchangeActionRequest getItSystemAdministrativePlanExchangeActionRequest() {
    return itSystemAdministrativePlanExchangeActionRequest;
  }

  public void setItSystemAdministrativePlanExchangeActionRequest(CRITSystemAdministrativePlanExchangeInputModelITSystemAdministrativePlanExchangeActionRequest itSystemAdministrativePlanExchangeActionRequest) {
    this.itSystemAdministrativePlanExchangeActionRequest = itSystemAdministrativePlanExchangeActionRequest;
  }


}

