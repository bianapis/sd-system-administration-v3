package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQConfigurationRequestOutputModel
 */
public class BQConfigurationRequestOutputModel   {
  private String configurationPreconditions = null;

  private String configurationBusinessUnitEmployeeReference = null;

  private String configurationWorkSchedule = null;

  private String systemsConfigurationAdministration = null;

  private String configurationPostconditions = null;

  private String configurationSystemsConfigurationAdministrationServiceType = null;

  private String configurationSystemsConfigurationAdministrationServiceDescription = null;

  private String configurationSystemsConfigurationAdministrationServiceInputsandOuputs = null;

  private String configurationSystemsConfigurationAdministrationServiceWorkProduct = null;

  private String configurationSystemsConfigurationAdministrationServiceName = null;

  private String configurationRequestActionTaskReference = null;

  private Object configurationRequestActionTaskRecord = null;

  private String configurationRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return configurationPreconditions
  **/

  public String getConfigurationPreconditions() {
    return configurationPreconditions;
  }

  public void setConfigurationPreconditions(String configurationPreconditions) {
    this.configurationPreconditions = configurationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return configurationBusinessUnitEmployeeReference
  **/

  public String getConfigurationBusinessUnitEmployeeReference() {
    return configurationBusinessUnitEmployeeReference;
  }

  public void setConfigurationBusinessUnitEmployeeReference(String configurationBusinessUnitEmployeeReference) {
    this.configurationBusinessUnitEmployeeReference = configurationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return configurationWorkSchedule
  **/

  public String getConfigurationWorkSchedule() {
    return configurationWorkSchedule;
  }

  public void setConfigurationWorkSchedule(String configurationWorkSchedule) {
    this.configurationWorkSchedule = configurationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The ITSystem Administrative Plan specific Business Service 
   * @return systemsConfigurationAdministration
  **/

  public String getSystemsConfigurationAdministration() {
    return systemsConfigurationAdministration;
  }

  public void setSystemsConfigurationAdministration(String systemsConfigurationAdministration) {
    this.systemsConfigurationAdministration = systemsConfigurationAdministration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return configurationPostconditions
  **/

  public String getConfigurationPostconditions() {
    return configurationPostconditions;
  }

  public void setConfigurationPostconditions(String configurationPostconditions) {
    this.configurationPostconditions = configurationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return configurationSystemsConfigurationAdministrationServiceType
  **/

  public String getConfigurationSystemsConfigurationAdministrationServiceType() {
    return configurationSystemsConfigurationAdministrationServiceType;
  }

  public void setConfigurationSystemsConfigurationAdministrationServiceType(String configurationSystemsConfigurationAdministrationServiceType) {
    this.configurationSystemsConfigurationAdministrationServiceType = configurationSystemsConfigurationAdministrationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return configurationSystemsConfigurationAdministrationServiceDescription
  **/

  public String getConfigurationSystemsConfigurationAdministrationServiceDescription() {
    return configurationSystemsConfigurationAdministrationServiceDescription;
  }

  public void setConfigurationSystemsConfigurationAdministrationServiceDescription(String configurationSystemsConfigurationAdministrationServiceDescription) {
    this.configurationSystemsConfigurationAdministrationServiceDescription = configurationSystemsConfigurationAdministrationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return configurationSystemsConfigurationAdministrationServiceInputsandOuputs
  **/

  public String getConfigurationSystemsConfigurationAdministrationServiceInputsandOuputs() {
    return configurationSystemsConfigurationAdministrationServiceInputsandOuputs;
  }

  public void setConfigurationSystemsConfigurationAdministrationServiceInputsandOuputs(String configurationSystemsConfigurationAdministrationServiceInputsandOuputs) {
    this.configurationSystemsConfigurationAdministrationServiceInputsandOuputs = configurationSystemsConfigurationAdministrationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return configurationSystemsConfigurationAdministrationServiceWorkProduct
  **/

  public String getConfigurationSystemsConfigurationAdministrationServiceWorkProduct() {
    return configurationSystemsConfigurationAdministrationServiceWorkProduct;
  }

  public void setConfigurationSystemsConfigurationAdministrationServiceWorkProduct(String configurationSystemsConfigurationAdministrationServiceWorkProduct) {
    this.configurationSystemsConfigurationAdministrationServiceWorkProduct = configurationSystemsConfigurationAdministrationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: 
   * @return configurationSystemsConfigurationAdministrationServiceName
  **/

  public String getConfigurationSystemsConfigurationAdministrationServiceName() {
    return configurationSystemsConfigurationAdministrationServiceName;
  }

  public void setConfigurationSystemsConfigurationAdministrationServiceName(String configurationSystemsConfigurationAdministrationServiceName) {
    this.configurationSystemsConfigurationAdministrationServiceName = configurationSystemsConfigurationAdministrationServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Configuration instance request service call 
   * @return configurationRequestActionTaskReference
  **/

  public String getConfigurationRequestActionTaskReference() {
    return configurationRequestActionTaskReference;
  }

  public void setConfigurationRequestActionTaskReference(String configurationRequestActionTaskReference) {
    this.configurationRequestActionTaskReference = configurationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return configurationRequestActionTaskRecord
  **/

  public Object getConfigurationRequestActionTaskRecord() {
    return configurationRequestActionTaskRecord;
  }

  public void setConfigurationRequestActionTaskRecord(Object configurationRequestActionTaskRecord) {
    this.configurationRequestActionTaskRecord = configurationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Configuration service request record 
   * @return configurationRequestRecordReference
  **/

  public String getConfigurationRequestRecordReference() {
    return configurationRequestRecordReference;
  }

  public void setConfigurationRequestRecordReference(String configurationRequestRecordReference) {
    this.configurationRequestRecordReference = configurationRequestRecordReference;
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

