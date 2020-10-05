package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningandResilienceUpdateInputModel
 */
public class BQCapacityPlanningandResilienceUpdateInputModel   {
  private String itSystemAdministrativePlanInstanceReference = null;

  private String capacityPlanningandResilienceInstanceReference = null;

  private String capacityPlanningandResiliencePreconditions = null;

  private String capacityPlanningandResilienceBusinessUnitEmployeeReference = null;

  private String capacityPlanningandResilienceWorkSchedule = null;

  private String capacityPlanningandResilience = null;

  private String capacityPlanningandResiliencePostconditions = null;

  private String capacityPlanningandResilienceCapacityPlanningandResilienceServiceType = null;

  private String capacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription = null;

  private String capacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs = null;

  private String capacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct = null;

  private Object capacityPlanningandResilienceUpdateActionTaskRecord = null;

  private String capacityPlanningandResilienceUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent ITSystem Administrative Plan instance 
   * @return itSystemAdministrativePlanInstanceReference
  **/

  public String getItSystemAdministrativePlanInstanceReference() {
    return itSystemAdministrativePlanInstanceReference;
  }

  public void setItSystemAdministrativePlanInstanceReference(String itSystemAdministrativePlanInstanceReference) {
    this.itSystemAdministrativePlanInstanceReference = itSystemAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Capacity Planning and Resilience instance 
   * @return capacityPlanningandResilienceInstanceReference
  **/

  public String getCapacityPlanningandResilienceInstanceReference() {
    return capacityPlanningandResilienceInstanceReference;
  }

  public void setCapacityPlanningandResilienceInstanceReference(String capacityPlanningandResilienceInstanceReference) {
    this.capacityPlanningandResilienceInstanceReference = capacityPlanningandResilienceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return capacityPlanningandResiliencePreconditions
  **/

  public String getCapacityPlanningandResiliencePreconditions() {
    return capacityPlanningandResiliencePreconditions;
  }

  public void setCapacityPlanningandResiliencePreconditions(String capacityPlanningandResiliencePreconditions) {
    this.capacityPlanningandResiliencePreconditions = capacityPlanningandResiliencePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return capacityPlanningandResilienceBusinessUnitEmployeeReference
  **/

  public String getCapacityPlanningandResilienceBusinessUnitEmployeeReference() {
    return capacityPlanningandResilienceBusinessUnitEmployeeReference;
  }

  public void setCapacityPlanningandResilienceBusinessUnitEmployeeReference(String capacityPlanningandResilienceBusinessUnitEmployeeReference) {
    this.capacityPlanningandResilienceBusinessUnitEmployeeReference = capacityPlanningandResilienceBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return capacityPlanningandResilienceWorkSchedule
  **/

  public String getCapacityPlanningandResilienceWorkSchedule() {
    return capacityPlanningandResilienceWorkSchedule;
  }

  public void setCapacityPlanningandResilienceWorkSchedule(String capacityPlanningandResilienceWorkSchedule) {
    this.capacityPlanningandResilienceWorkSchedule = capacityPlanningandResilienceWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The ITSystem Administrative Plan specific Business Service 
   * @return capacityPlanningandResilience
  **/

  public String getCapacityPlanningandResilience() {
    return capacityPlanningandResilience;
  }

  public void setCapacityPlanningandResilience(String capacityPlanningandResilience) {
    this.capacityPlanningandResilience = capacityPlanningandResilience;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return capacityPlanningandResiliencePostconditions
  **/

  public String getCapacityPlanningandResiliencePostconditions() {
    return capacityPlanningandResiliencePostconditions;
  }

  public void setCapacityPlanningandResiliencePostconditions(String capacityPlanningandResiliencePostconditions) {
    this.capacityPlanningandResiliencePostconditions = capacityPlanningandResiliencePostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return capacityPlanningandResilienceCapacityPlanningandResilienceServiceType
  **/

  public String getCapacityPlanningandResilienceCapacityPlanningandResilienceServiceType() {
    return capacityPlanningandResilienceCapacityPlanningandResilienceServiceType;
  }

  public void setCapacityPlanningandResilienceCapacityPlanningandResilienceServiceType(String capacityPlanningandResilienceCapacityPlanningandResilienceServiceType) {
    this.capacityPlanningandResilienceCapacityPlanningandResilienceServiceType = capacityPlanningandResilienceCapacityPlanningandResilienceServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return capacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription
  **/

  public String getCapacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription() {
    return capacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription;
  }

  public void setCapacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription(String capacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription) {
    this.capacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription = capacityPlanningandResilienceCapacityPlanningandResilienceServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return capacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs
  **/

  public String getCapacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs() {
    return capacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs;
  }

  public void setCapacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs(String capacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs) {
    this.capacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs = capacityPlanningandResilienceCapacityPlanningandResilienceServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return capacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct
  **/

  public String getCapacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct() {
    return capacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct;
  }

  public void setCapacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct(String capacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct) {
    this.capacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct = capacityPlanningandResilienceCapacityPlanningandResilienceServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return capacityPlanningandResilienceUpdateActionTaskRecord
  **/

  public Object getCapacityPlanningandResilienceUpdateActionTaskRecord() {
    return capacityPlanningandResilienceUpdateActionTaskRecord;
  }

  public void setCapacityPlanningandResilienceUpdateActionTaskRecord(Object capacityPlanningandResilienceUpdateActionTaskRecord) {
    this.capacityPlanningandResilienceUpdateActionTaskRecord = capacityPlanningandResilienceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return capacityPlanningandResilienceUpdateActionRequest
  **/

  public String getCapacityPlanningandResilienceUpdateActionRequest() {
    return capacityPlanningandResilienceUpdateActionRequest;
  }

  public void setCapacityPlanningandResilienceUpdateActionRequest(String capacityPlanningandResilienceUpdateActionRequest) {
    this.capacityPlanningandResilienceUpdateActionRequest = capacityPlanningandResilienceUpdateActionRequest;
  }


}

