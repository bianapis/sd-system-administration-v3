package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationFeedbackInputModelSystemAdministrationFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationFeedbackInputModel
 */
public class SDSystemAdministrationFeedbackInputModel   {
  private Object systemAdministrationFeedbackActionTaskRecord = null;

  private SDSystemAdministrationFeedbackInputModelSystemAdministrationFeedbackActionRecord systemAdministrationFeedbackActionRecord = null;


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

  public SDSystemAdministrationFeedbackInputModelSystemAdministrationFeedbackActionRecord getSystemAdministrationFeedbackActionRecord() {
    return systemAdministrationFeedbackActionRecord;
  }

  public void setSystemAdministrationFeedbackActionRecord(SDSystemAdministrationFeedbackInputModelSystemAdministrationFeedbackActionRecord systemAdministrationFeedbackActionRecord) {
    this.systemAdministrationFeedbackActionRecord = systemAdministrationFeedbackActionRecord;
  }


}

