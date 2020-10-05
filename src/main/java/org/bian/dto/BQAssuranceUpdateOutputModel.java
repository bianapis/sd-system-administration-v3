package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssuranceUpdateOutputModel
 */
public class BQAssuranceUpdateOutputModel   {
  private String assurancePreconditions = null;

  private String assuranceBusinessUnitEmployeeReference = null;

  private String assuranceWorkSchedule = null;

  private String collateralItemAssurance = null;

  private String assurancePostconditions = null;

  private String assuranceCollateralItemAssuranceServiceType = null;

  private String assuranceCollateralItemAssuranceServiceDescription = null;

  private String assuranceCollateralItemAssuranceServiceInputsandOuputs = null;

  private String assuranceCollateralItemAssuranceServiceWorkProduct = null;

  private String assuranceCollateralItemAssuranceServiceName = null;

  private String assuranceUpdateActionTaskReference = null;

  private Object assuranceUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return assurancePreconditions
  **/

  public String getAssurancePreconditions() {
    return assurancePreconditions;
  }

  public void setAssurancePreconditions(String assurancePreconditions) {
    this.assurancePreconditions = assurancePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return assuranceBusinessUnitEmployeeReference
  **/

  public String getAssuranceBusinessUnitEmployeeReference() {
    return assuranceBusinessUnitEmployeeReference;
  }

  public void setAssuranceBusinessUnitEmployeeReference(String assuranceBusinessUnitEmployeeReference) {
    this.assuranceBusinessUnitEmployeeReference = assuranceBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return assuranceWorkSchedule
  **/

  public String getAssuranceWorkSchedule() {
    return assuranceWorkSchedule;
  }

  public void setAssuranceWorkSchedule(String assuranceWorkSchedule) {
    this.assuranceWorkSchedule = assuranceWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The ITSystem Administrative Plan specific Business Service 
   * @return collateralItemAssurance
  **/

  public String getCollateralItemAssurance() {
    return collateralItemAssurance;
  }

  public void setCollateralItemAssurance(String collateralItemAssurance) {
    this.collateralItemAssurance = collateralItemAssurance;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return assurancePostconditions
  **/

  public String getAssurancePostconditions() {
    return assurancePostconditions;
  }

  public void setAssurancePostconditions(String assurancePostconditions) {
    this.assurancePostconditions = assurancePostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return assuranceCollateralItemAssuranceServiceType
  **/

  public String getAssuranceCollateralItemAssuranceServiceType() {
    return assuranceCollateralItemAssuranceServiceType;
  }

  public void setAssuranceCollateralItemAssuranceServiceType(String assuranceCollateralItemAssuranceServiceType) {
    this.assuranceCollateralItemAssuranceServiceType = assuranceCollateralItemAssuranceServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return assuranceCollateralItemAssuranceServiceDescription
  **/

  public String getAssuranceCollateralItemAssuranceServiceDescription() {
    return assuranceCollateralItemAssuranceServiceDescription;
  }

  public void setAssuranceCollateralItemAssuranceServiceDescription(String assuranceCollateralItemAssuranceServiceDescription) {
    this.assuranceCollateralItemAssuranceServiceDescription = assuranceCollateralItemAssuranceServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return assuranceCollateralItemAssuranceServiceInputsandOuputs
  **/

  public String getAssuranceCollateralItemAssuranceServiceInputsandOuputs() {
    return assuranceCollateralItemAssuranceServiceInputsandOuputs;
  }

  public void setAssuranceCollateralItemAssuranceServiceInputsandOuputs(String assuranceCollateralItemAssuranceServiceInputsandOuputs) {
    this.assuranceCollateralItemAssuranceServiceInputsandOuputs = assuranceCollateralItemAssuranceServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return assuranceCollateralItemAssuranceServiceWorkProduct
  **/

  public String getAssuranceCollateralItemAssuranceServiceWorkProduct() {
    return assuranceCollateralItemAssuranceServiceWorkProduct;
  }

  public void setAssuranceCollateralItemAssuranceServiceWorkProduct(String assuranceCollateralItemAssuranceServiceWorkProduct) {
    this.assuranceCollateralItemAssuranceServiceWorkProduct = assuranceCollateralItemAssuranceServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: 
   * @return assuranceCollateralItemAssuranceServiceName
  **/

  public String getAssuranceCollateralItemAssuranceServiceName() {
    return assuranceCollateralItemAssuranceServiceName;
  }

  public void setAssuranceCollateralItemAssuranceServiceName(String assuranceCollateralItemAssuranceServiceName) {
    this.assuranceCollateralItemAssuranceServiceName = assuranceCollateralItemAssuranceServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return assuranceUpdateActionTaskReference
  **/

  public String getAssuranceUpdateActionTaskReference() {
    return assuranceUpdateActionTaskReference;
  }

  public void setAssuranceUpdateActionTaskReference(String assuranceUpdateActionTaskReference) {
    this.assuranceUpdateActionTaskReference = assuranceUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return assuranceUpdateActionTaskRecord
  **/

  public Object getAssuranceUpdateActionTaskRecord() {
    return assuranceUpdateActionTaskRecord;
  }

  public void setAssuranceUpdateActionTaskRecord(Object assuranceUpdateActionTaskRecord) {
    this.assuranceUpdateActionTaskRecord = assuranceUpdateActionTaskRecord;
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

