package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedService;
import org.bian.dto.SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationRetrieveOutputModel
 */
public class SDSystemAdministrationRetrieveOutputModel   {
  private String systemAdministrationRetrieveActionTaskReference = null;

  private Object systemAdministrationRetrieveActionTaskRecord = null;

  private String systemAdministrationRetrieveActionResponse = null;

  private SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecord systemAdministrationRetrieveActionRecord = null;

  private SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedService systemAdministrationOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return systemAdministrationRetrieveActionTaskReference
  **/

  public String getSystemAdministrationRetrieveActionTaskReference() {
    return systemAdministrationRetrieveActionTaskReference;
  }

  public void setSystemAdministrationRetrieveActionTaskReference(String systemAdministrationRetrieveActionTaskReference) {
    this.systemAdministrationRetrieveActionTaskReference = systemAdministrationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return systemAdministrationRetrieveActionTaskRecord
  **/

  public Object getSystemAdministrationRetrieveActionTaskRecord() {
    return systemAdministrationRetrieveActionTaskRecord;
  }

  public void setSystemAdministrationRetrieveActionTaskRecord(Object systemAdministrationRetrieveActionTaskRecord) {
    this.systemAdministrationRetrieveActionTaskRecord = systemAdministrationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return systemAdministrationRetrieveActionResponse
  **/

  public String getSystemAdministrationRetrieveActionResponse() {
    return systemAdministrationRetrieveActionResponse;
  }

  public void setSystemAdministrationRetrieveActionResponse(String systemAdministrationRetrieveActionResponse) {
    this.systemAdministrationRetrieveActionResponse = systemAdministrationRetrieveActionResponse;
  }


  /**
   * Get systemAdministrationRetrieveActionRecord
   * @return systemAdministrationRetrieveActionRecord
  **/

  public SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecord getSystemAdministrationRetrieveActionRecord() {
    return systemAdministrationRetrieveActionRecord;
  }

  public void setSystemAdministrationRetrieveActionRecord(SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecord systemAdministrationRetrieveActionRecord) {
    this.systemAdministrationRetrieveActionRecord = systemAdministrationRetrieveActionRecord;
  }


  /**
   * Get systemAdministrationOfferedService
   * @return systemAdministrationOfferedService
  **/

  public SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedService getSystemAdministrationOfferedService() {
    return systemAdministrationOfferedService;
  }

  public void setSystemAdministrationOfferedService(SDSystemAdministrationRetrieveOutputModelSystemAdministrationOfferedService systemAdministrationOfferedService) {
    this.systemAdministrationOfferedService = systemAdministrationOfferedService;
  }


}

