package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQConfigurationRetrieveOutputModelConfigurationInstanceAnalysis
 */
public class BQConfigurationRetrieveOutputModelConfigurationInstanceAnalysis   {
  private Object configurationInstanceAnalysisRecord = null;

  private String configurationInstanceAnalysisReportType = null;

  private String configurationInstanceAnalysisParameters = null;

  private Object configurationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return configurationInstanceAnalysisRecord
  **/

  public Object getConfigurationInstanceAnalysisRecord() {
    return configurationInstanceAnalysisRecord;
  }

  public void setConfigurationInstanceAnalysisRecord(Object configurationInstanceAnalysisRecord) {
    this.configurationInstanceAnalysisRecord = configurationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return configurationInstanceAnalysisReportType
  **/

  public String getConfigurationInstanceAnalysisReportType() {
    return configurationInstanceAnalysisReportType;
  }

  public void setConfigurationInstanceAnalysisReportType(String configurationInstanceAnalysisReportType) {
    this.configurationInstanceAnalysisReportType = configurationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return configurationInstanceAnalysisParameters
  **/

  public String getConfigurationInstanceAnalysisParameters() {
    return configurationInstanceAnalysisParameters;
  }

  public void setConfigurationInstanceAnalysisParameters(String configurationInstanceAnalysisParameters) {
    this.configurationInstanceAnalysisParameters = configurationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return configurationInstanceAnalysisReport
  **/

  public Object getConfigurationInstanceAnalysisReport() {
    return configurationInstanceAnalysisReport;
  }

  public void setConfigurationInstanceAnalysisReport(Object configurationInstanceAnalysisReport) {
    this.configurationInstanceAnalysisReport = configurationInstanceAnalysisReport;
  }


}

