package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInventoryRequestOutputModel
 */
public class BQInventoryRequestOutputModel   {
  private String inventoryPreconditions = null;

  private String inventoryBusinessUnitEmployeeReference = null;

  private String inventoryWorkSchedule = null;

  private String businessService = null;

  private String inventoryPostconditions = null;

  private String inventoryServiceType = null;

  private String inventoryServiceDescription = null;

  private String inventoryServiceInputsandOuputs = null;

  private String inventoryServiceWorkProduct = null;

  private String inventoryServiceName = null;

  private String inventoryRequestActionTaskReference = null;

  private Object inventoryRequestActionTaskRecord = null;

  private String inventoryRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return inventoryPreconditions
  **/

  public String getInventoryPreconditions() {
    return inventoryPreconditions;
  }

  public void setInventoryPreconditions(String inventoryPreconditions) {
    this.inventoryPreconditions = inventoryPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return inventoryBusinessUnitEmployeeReference
  **/

  public String getInventoryBusinessUnitEmployeeReference() {
    return inventoryBusinessUnitEmployeeReference;
  }

  public void setInventoryBusinessUnitEmployeeReference(String inventoryBusinessUnitEmployeeReference) {
    this.inventoryBusinessUnitEmployeeReference = inventoryBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return inventoryWorkSchedule
  **/

  public String getInventoryWorkSchedule() {
    return inventoryWorkSchedule;
  }

  public void setInventoryWorkSchedule(String inventoryWorkSchedule) {
    this.inventoryWorkSchedule = inventoryWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The ITSystem Administrative Plan specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return inventoryPostconditions
  **/

  public String getInventoryPostconditions() {
    return inventoryPostconditions;
  }

  public void setInventoryPostconditions(String inventoryPostconditions) {
    this.inventoryPostconditions = inventoryPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return inventoryServiceType
  **/

  public String getInventoryServiceType() {
    return inventoryServiceType;
  }

  public void setInventoryServiceType(String inventoryServiceType) {
    this.inventoryServiceType = inventoryServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return inventoryServiceDescription
  **/

  public String getInventoryServiceDescription() {
    return inventoryServiceDescription;
  }

  public void setInventoryServiceDescription(String inventoryServiceDescription) {
    this.inventoryServiceDescription = inventoryServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return inventoryServiceInputsandOuputs
  **/

  public String getInventoryServiceInputsandOuputs() {
    return inventoryServiceInputsandOuputs;
  }

  public void setInventoryServiceInputsandOuputs(String inventoryServiceInputsandOuputs) {
    this.inventoryServiceInputsandOuputs = inventoryServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return inventoryServiceWorkProduct
  **/

  public String getInventoryServiceWorkProduct() {
    return inventoryServiceWorkProduct;
  }

  public void setInventoryServiceWorkProduct(String inventoryServiceWorkProduct) {
    this.inventoryServiceWorkProduct = inventoryServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: 
   * @return inventoryServiceName
  **/

  public String getInventoryServiceName() {
    return inventoryServiceName;
  }

  public void setInventoryServiceName(String inventoryServiceName) {
    this.inventoryServiceName = inventoryServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Inventory instance request service call 
   * @return inventoryRequestActionTaskReference
  **/

  public String getInventoryRequestActionTaskReference() {
    return inventoryRequestActionTaskReference;
  }

  public void setInventoryRequestActionTaskReference(String inventoryRequestActionTaskReference) {
    this.inventoryRequestActionTaskReference = inventoryRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return inventoryRequestActionTaskRecord
  **/

  public Object getInventoryRequestActionTaskRecord() {
    return inventoryRequestActionTaskRecord;
  }

  public void setInventoryRequestActionTaskRecord(Object inventoryRequestActionTaskRecord) {
    this.inventoryRequestActionTaskRecord = inventoryRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Inventory service request record 
   * @return inventoryRequestRecordReference
  **/

  public String getInventoryRequestRecordReference() {
    return inventoryRequestRecordReference;
  }

  public void setInventoryRequestRecordReference(String inventoryRequestRecordReference) {
    this.inventoryRequestRecordReference = inventoryRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

