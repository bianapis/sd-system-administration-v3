package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInventoryRetrieveOutputModelInventoryInstanceAnalysis;
import org.bian.dto.BQInventoryRetrieveOutputModelInventoryInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInventoryRetrieveOutputModel
 */
public class BQInventoryRetrieveOutputModel   {
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

  private String inventoryRetrieveActionTaskReference = null;

  private Object inventoryRetrieveActionTaskRecord = null;

  private String inventoryRetrieveActionResponse = null;

  private BQInventoryRetrieveOutputModelInventoryInstanceReport inventoryInstanceReport = null;

  private BQInventoryRetrieveOutputModelInventoryInstanceAnalysis inventoryInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Inventory instance retrieve service call 
   * @return inventoryRetrieveActionTaskReference
  **/

  public String getInventoryRetrieveActionTaskReference() {
    return inventoryRetrieveActionTaskReference;
  }

  public void setInventoryRetrieveActionTaskReference(String inventoryRetrieveActionTaskReference) {
    this.inventoryRetrieveActionTaskReference = inventoryRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return inventoryRetrieveActionTaskRecord
  **/

  public Object getInventoryRetrieveActionTaskRecord() {
    return inventoryRetrieveActionTaskRecord;
  }

  public void setInventoryRetrieveActionTaskRecord(Object inventoryRetrieveActionTaskRecord) {
    this.inventoryRetrieveActionTaskRecord = inventoryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return inventoryRetrieveActionResponse
  **/

  public String getInventoryRetrieveActionResponse() {
    return inventoryRetrieveActionResponse;
  }

  public void setInventoryRetrieveActionResponse(String inventoryRetrieveActionResponse) {
    this.inventoryRetrieveActionResponse = inventoryRetrieveActionResponse;
  }


  /**
   * Get inventoryInstanceReport
   * @return inventoryInstanceReport
  **/

  public BQInventoryRetrieveOutputModelInventoryInstanceReport getInventoryInstanceReport() {
    return inventoryInstanceReport;
  }

  public void setInventoryInstanceReport(BQInventoryRetrieveOutputModelInventoryInstanceReport inventoryInstanceReport) {
    this.inventoryInstanceReport = inventoryInstanceReport;
  }


  /**
   * Get inventoryInstanceAnalysis
   * @return inventoryInstanceAnalysis
  **/

  public BQInventoryRetrieveOutputModelInventoryInstanceAnalysis getInventoryInstanceAnalysis() {
    return inventoryInstanceAnalysis;
  }

  public void setInventoryInstanceAnalysis(BQInventoryRetrieveOutputModelInventoryInstanceAnalysis inventoryInstanceAnalysis) {
    this.inventoryInstanceAnalysis = inventoryInstanceAnalysis;
  }


}

