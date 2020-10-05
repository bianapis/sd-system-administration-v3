package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAdministrativePlanRetrieveOutputModelITSystemAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRITSystemAdministrativePlanRetrieveOutputModelITSystemAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanRetrieveOutputModel
 */
public class CRITSystemAdministrativePlanRetrieveOutputModel   {
  private String itSystemAdministrativePlanBudgetType = null;

  private String itSystemAdministrativePlanAssignment = null;

  private String itSystemAdministrativePlanPlan = null;

  private String itSystemAdministrativePlanReference = null;

  private String itSystemAdministrativePlanRetrieveActionTaskReference = null;

  private Object itSystemAdministrativePlanRetrieveActionTaskRecord = null;

  private String itSystemAdministrativePlanRetrieveActionResponse = null;

  private CRITSystemAdministrativePlanRetrieveOutputModelITSystemAdministrativePlanInstanceReportRecord itSystemAdministrativePlanInstanceReportRecord = null;

  private CRITSystemAdministrativePlanRetrieveOutputModelITSystemAdministrativePlanInstanceAnalysis itSystemAdministrativePlanInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ITSystem Administrative Plan instance retrieve service call 
   * @return itSystemAdministrativePlanRetrieveActionTaskReference
  **/

  public String getItSystemAdministrativePlanRetrieveActionTaskReference() {
    return itSystemAdministrativePlanRetrieveActionTaskReference;
  }

  public void setItSystemAdministrativePlanRetrieveActionTaskReference(String itSystemAdministrativePlanRetrieveActionTaskReference) {
    this.itSystemAdministrativePlanRetrieveActionTaskReference = itSystemAdministrativePlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return itSystemAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getItSystemAdministrativePlanRetrieveActionTaskRecord() {
    return itSystemAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setItSystemAdministrativePlanRetrieveActionTaskRecord(Object itSystemAdministrativePlanRetrieveActionTaskRecord) {
    this.itSystemAdministrativePlanRetrieveActionTaskRecord = itSystemAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return itSystemAdministrativePlanRetrieveActionResponse
  **/

  public String getItSystemAdministrativePlanRetrieveActionResponse() {
    return itSystemAdministrativePlanRetrieveActionResponse;
  }

  public void setItSystemAdministrativePlanRetrieveActionResponse(String itSystemAdministrativePlanRetrieveActionResponse) {
    this.itSystemAdministrativePlanRetrieveActionResponse = itSystemAdministrativePlanRetrieveActionResponse;
  }


  /**
   * Get itSystemAdministrativePlanInstanceReportRecord
   * @return itSystemAdministrativePlanInstanceReportRecord
  **/

  public CRITSystemAdministrativePlanRetrieveOutputModelITSystemAdministrativePlanInstanceReportRecord getItSystemAdministrativePlanInstanceReportRecord() {
    return itSystemAdministrativePlanInstanceReportRecord;
  }

  public void setItSystemAdministrativePlanInstanceReportRecord(CRITSystemAdministrativePlanRetrieveOutputModelITSystemAdministrativePlanInstanceReportRecord itSystemAdministrativePlanInstanceReportRecord) {
    this.itSystemAdministrativePlanInstanceReportRecord = itSystemAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get itSystemAdministrativePlanInstanceAnalysis
   * @return itSystemAdministrativePlanInstanceAnalysis
  **/

  public CRITSystemAdministrativePlanRetrieveOutputModelITSystemAdministrativePlanInstanceAnalysis getItSystemAdministrativePlanInstanceAnalysis() {
    return itSystemAdministrativePlanInstanceAnalysis;
  }

  public void setItSystemAdministrativePlanInstanceAnalysis(CRITSystemAdministrativePlanRetrieveOutputModelITSystemAdministrativePlanInstanceAnalysis itSystemAdministrativePlanInstanceAnalysis) {
    this.itSystemAdministrativePlanInstanceAnalysis = itSystemAdministrativePlanInstanceAnalysis;
  }


}

