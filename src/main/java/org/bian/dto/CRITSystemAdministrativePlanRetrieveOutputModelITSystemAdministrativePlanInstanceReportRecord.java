package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemAdministrativePlanRetrieveOutputModelITSystemAdministrativePlanInstanceReportRecord
 */
public class CRITSystemAdministrativePlanRetrieveOutputModelITSystemAdministrativePlanInstanceReportRecord   {
  private String itSystemAdministrativePlanInstanceReportData = null;

  private String itSystemAdministrativePlanInstanceReportType = null;

  private Object itSystemAdministrativePlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return itSystemAdministrativePlanInstanceReportData
  **/

  public String getItSystemAdministrativePlanInstanceReportData() {
    return itSystemAdministrativePlanInstanceReportData;
  }

  public void setItSystemAdministrativePlanInstanceReportData(String itSystemAdministrativePlanInstanceReportData) {
    this.itSystemAdministrativePlanInstanceReportData = itSystemAdministrativePlanInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return itSystemAdministrativePlanInstanceReportType
  **/

  public String getItSystemAdministrativePlanInstanceReportType() {
    return itSystemAdministrativePlanInstanceReportType;
  }

  public void setItSystemAdministrativePlanInstanceReportType(String itSystemAdministrativePlanInstanceReportType) {
    this.itSystemAdministrativePlanInstanceReportType = itSystemAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return itSystemAdministrativePlanInstanceReport
  **/

  public Object getItSystemAdministrativePlanInstanceReport() {
    return itSystemAdministrativePlanInstanceReport;
  }

  public void setItSystemAdministrativePlanInstanceReport(Object itSystemAdministrativePlanInstanceReport) {
    this.itSystemAdministrativePlanInstanceReport = itSystemAdministrativePlanInstanceReport;
  }


}

