package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemAdministrativePlanRetrieveInputModelITSystemAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRITSystemAdministrativePlanRetrieveInputModelITSystemAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanRetrieveInputModel
 */
public class CRITSystemAdministrativePlanRetrieveInputModel   {
  private Object itSystemAdministrativePlanRetrieveActionTaskRecord = null;

  private String itSystemAdministrativePlanRetrieveActionRequest = null;

  private CRITSystemAdministrativePlanRetrieveInputModelITSystemAdministrativePlanInstanceReportRecord itSystemAdministrativePlanInstanceReportRecord = null;

  private CRITSystemAdministrativePlanRetrieveInputModelITSystemAdministrativePlanInstanceAnalysis itSystemAdministrativePlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return itSystemAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getItSystemAdministrativePlanRetrieveActionTaskRecord() {
    return itSystemAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setItSystemAdministrativePlanRetrieveActionTaskRecord(Object itSystemAdministrativePlanRetrieveActionTaskRecord) {
    this.itSystemAdministrativePlanRetrieveActionTaskRecord = itSystemAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return itSystemAdministrativePlanRetrieveActionRequest
  **/

  public String getItSystemAdministrativePlanRetrieveActionRequest() {
    return itSystemAdministrativePlanRetrieveActionRequest;
  }

  public void setItSystemAdministrativePlanRetrieveActionRequest(String itSystemAdministrativePlanRetrieveActionRequest) {
    this.itSystemAdministrativePlanRetrieveActionRequest = itSystemAdministrativePlanRetrieveActionRequest;
  }


  /**
   * Get itSystemAdministrativePlanInstanceReportRecord
   * @return itSystemAdministrativePlanInstanceReportRecord
  **/

  public CRITSystemAdministrativePlanRetrieveInputModelITSystemAdministrativePlanInstanceReportRecord getItSystemAdministrativePlanInstanceReportRecord() {
    return itSystemAdministrativePlanInstanceReportRecord;
  }

  public void setItSystemAdministrativePlanInstanceReportRecord(CRITSystemAdministrativePlanRetrieveInputModelITSystemAdministrativePlanInstanceReportRecord itSystemAdministrativePlanInstanceReportRecord) {
    this.itSystemAdministrativePlanInstanceReportRecord = itSystemAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get itSystemAdministrativePlanInstanceAnalysis
   * @return itSystemAdministrativePlanInstanceAnalysis
  **/

  public CRITSystemAdministrativePlanRetrieveInputModelITSystemAdministrativePlanInstanceAnalysis getItSystemAdministrativePlanInstanceAnalysis() {
    return itSystemAdministrativePlanInstanceAnalysis;
  }

  public void setItSystemAdministrativePlanInstanceAnalysis(CRITSystemAdministrativePlanRetrieveInputModelITSystemAdministrativePlanInstanceAnalysis itSystemAdministrativePlanInstanceAnalysis) {
    this.itSystemAdministrativePlanInstanceAnalysis = itSystemAdministrativePlanInstanceAnalysis;
  }


}

