package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQConfigurationRetrieveInputModelConfigurationInstanceAnalysis
 */
public class BQConfigurationRetrieveInputModelConfigurationInstanceAnalysis   {
  private String configurationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return configurationInstanceAnalysisReference
  **/

  public String getConfigurationInstanceAnalysisReference() {
    return configurationInstanceAnalysisReference;
  }

  public void setConfigurationInstanceAnalysisReference(String configurationInstanceAnalysisReference) {
    this.configurationInstanceAnalysisReference = configurationInstanceAnalysisReference;
  }


}

