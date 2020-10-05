package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAdministrativePlanGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanGrantOutputModel
 */
public class CRITSystemAdministrativePlanGrantOutputModel   {
  private String itSystemAdministrativePlanAssignment = null;

  private String itSystemAdministrativePlanPlan = null;

  private String itSystemAdministrativePlanGrantActionTaskReference = null;

  private Object itSystemAdministrativePlanGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRITSystemAdministrativePlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ITSystem Administrative Plan instance grant service call 
   * @return itSystemAdministrativePlanGrantActionTaskReference
  **/

  public String getItSystemAdministrativePlanGrantActionTaskReference() {
    return itSystemAdministrativePlanGrantActionTaskReference;
  }

  public void setItSystemAdministrativePlanGrantActionTaskReference(String itSystemAdministrativePlanGrantActionTaskReference) {
    this.itSystemAdministrativePlanGrantActionTaskReference = itSystemAdministrativePlanGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRITSystemAdministrativePlanGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRITSystemAdministrativePlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

