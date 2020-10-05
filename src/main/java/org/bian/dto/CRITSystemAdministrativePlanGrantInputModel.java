package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAdministrativePlanGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanGrantInputModel
 */
public class CRITSystemAdministrativePlanGrantInputModel   {
  private String systemAdministrationServicingSessionReference = null;

  private String itSystemAdministrativePlanInstanceReference = null;

  private String itSystemAdministrativePlanBudgetType = null;

  private String itSystemAdministrativePlanAssignment = null;

  private String itSystemAdministrativePlanPlan = null;

  private String itSystemAdministrativePlanReference = null;

  private Object itSystemAdministrativePlanGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRITSystemAdministrativePlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return itSystemAdministrativePlanGrantActionTaskRecord
  **/

  public Object getItSystemAdministrativePlanGrantActionTaskRecord() {
    return itSystemAdministrativePlanGrantActionTaskRecord;
  }

  public void setItSystemAdministrativePlanGrantActionTaskRecord(Object itSystemAdministrativePlanGrantActionTaskRecord) {
    this.itSystemAdministrativePlanGrantActionTaskRecord = itSystemAdministrativePlanGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRITSystemAdministrativePlanGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRITSystemAdministrativePlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

