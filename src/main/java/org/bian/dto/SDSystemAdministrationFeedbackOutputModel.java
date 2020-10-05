package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationFeedbackOutputModelSystemAdministrationFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationFeedbackOutputModel
 */
public class SDSystemAdministrationFeedbackOutputModel   {
  private String systemAdministrationFeedbackActionTaskReference = null;

  private Object systemAdministrationFeedbackActionTaskRecord = null;

  private SDSystemAdministrationFeedbackOutputModelSystemAdministrationFeedbackActionRecord systemAdministrationFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return systemAdministrationFeedbackActionTaskReference
  **/

  public String getSystemAdministrationFeedbackActionTaskReference() {
    return systemAdministrationFeedbackActionTaskReference;
  }

  public void setSystemAdministrationFeedbackActionTaskReference(String systemAdministrationFeedbackActionTaskReference) {
    this.systemAdministrationFeedbackActionTaskReference = systemAdministrationFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return systemAdministrationFeedbackActionTaskRecord
  **/

  public Object getSystemAdministrationFeedbackActionTaskRecord() {
    return systemAdministrationFeedbackActionTaskRecord;
  }

  public void setSystemAdministrationFeedbackActionTaskRecord(Object systemAdministrationFeedbackActionTaskRecord) {
    this.systemAdministrationFeedbackActionTaskRecord = systemAdministrationFeedbackActionTaskRecord;
  }


  /**
   * Get systemAdministrationFeedbackActionRecord
   * @return systemAdministrationFeedbackActionRecord
  **/

  public SDSystemAdministrationFeedbackOutputModelSystemAdministrationFeedbackActionRecord getSystemAdministrationFeedbackActionRecord() {
    return systemAdministrationFeedbackActionRecord;
  }

  public void setSystemAdministrationFeedbackActionRecord(SDSystemAdministrationFeedbackOutputModelSystemAdministrationFeedbackActionRecord systemAdministrationFeedbackActionRecord) {
    this.systemAdministrationFeedbackActionRecord = systemAdministrationFeedbackActionRecord;
  }


}

