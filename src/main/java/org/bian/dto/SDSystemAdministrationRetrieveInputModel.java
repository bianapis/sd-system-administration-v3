package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationRetrieveInputModelSystemAdministrationOfferedService;
import org.bian.dto.SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationRetrieveInputModel
 */
public class SDSystemAdministrationRetrieveInputModel   {
  private Object systemAdministrationRetrieveActionTaskRecord = null;

  private String systemAdministrationRetrieveActionRequest = null;

  private SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecord systemAdministrationRetrieveActionRecord = null;

  private SDSystemAdministrationRetrieveInputModelSystemAdministrationOfferedService systemAdministrationOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return systemAdministrationRetrieveActionRequest
  **/

  public String getSystemAdministrationRetrieveActionRequest() {
    return systemAdministrationRetrieveActionRequest;
  }

  public void setSystemAdministrationRetrieveActionRequest(String systemAdministrationRetrieveActionRequest) {
    this.systemAdministrationRetrieveActionRequest = systemAdministrationRetrieveActionRequest;
  }


  /**
   * Get systemAdministrationRetrieveActionRecord
   * @return systemAdministrationRetrieveActionRecord
  **/

  public SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecord getSystemAdministrationRetrieveActionRecord() {
    return systemAdministrationRetrieveActionRecord;
  }

  public void setSystemAdministrationRetrieveActionRecord(SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecord systemAdministrationRetrieveActionRecord) {
    this.systemAdministrationRetrieveActionRecord = systemAdministrationRetrieveActionRecord;
  }


  /**
   * Get systemAdministrationOfferedService
   * @return systemAdministrationOfferedService
  **/

  public SDSystemAdministrationRetrieveInputModelSystemAdministrationOfferedService getSystemAdministrationOfferedService() {
    return systemAdministrationOfferedService;
  }

  public void setSystemAdministrationOfferedService(SDSystemAdministrationRetrieveInputModelSystemAdministrationOfferedService systemAdministrationOfferedService) {
    this.systemAdministrationOfferedService = systemAdministrationOfferedService;
  }


}

