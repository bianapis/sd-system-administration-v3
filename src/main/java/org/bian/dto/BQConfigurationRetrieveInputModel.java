package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQConfigurationRetrieveInputModelConfigurationInstanceAnalysis;
import org.bian.dto.BQConfigurationRetrieveInputModelConfigurationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQConfigurationRetrieveInputModel
 */
public class BQConfigurationRetrieveInputModel   {
  private Object configurationRetrieveActionTaskRecord = null;

  private String configurationRetrieveActionRequest = null;

  private BQConfigurationRetrieveInputModelConfigurationInstanceReport configurationInstanceReport = null;

  private BQConfigurationRetrieveInputModelConfigurationInstanceAnalysis configurationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return configurationRetrieveActionTaskRecord
  **/

  public Object getConfigurationRetrieveActionTaskRecord() {
    return configurationRetrieveActionTaskRecord;
  }

  public void setConfigurationRetrieveActionTaskRecord(Object configurationRetrieveActionTaskRecord) {
    this.configurationRetrieveActionTaskRecord = configurationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return configurationRetrieveActionRequest
  **/

  public String getConfigurationRetrieveActionRequest() {
    return configurationRetrieveActionRequest;
  }

  public void setConfigurationRetrieveActionRequest(String configurationRetrieveActionRequest) {
    this.configurationRetrieveActionRequest = configurationRetrieveActionRequest;
  }


  /**
   * Get configurationInstanceReport
   * @return configurationInstanceReport
  **/

  public BQConfigurationRetrieveInputModelConfigurationInstanceReport getConfigurationInstanceReport() {
    return configurationInstanceReport;
  }

  public void setConfigurationInstanceReport(BQConfigurationRetrieveInputModelConfigurationInstanceReport configurationInstanceReport) {
    this.configurationInstanceReport = configurationInstanceReport;
  }


  /**
   * Get configurationInstanceAnalysis
   * @return configurationInstanceAnalysis
  **/

  public BQConfigurationRetrieveInputModelConfigurationInstanceAnalysis getConfigurationInstanceAnalysis() {
    return configurationInstanceAnalysis;
  }

  public void setConfigurationInstanceAnalysis(BQConfigurationRetrieveInputModelConfigurationInstanceAnalysis configurationInstanceAnalysis) {
    this.configurationInstanceAnalysis = configurationInstanceAnalysis;
  }


}

