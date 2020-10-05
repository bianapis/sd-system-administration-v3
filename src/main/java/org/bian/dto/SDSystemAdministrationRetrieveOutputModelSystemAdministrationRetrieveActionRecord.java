package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecordSystemAdministrationActivityAnalysis;
import org.bian.dto.SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecordSystemAdministrationPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecord
 */
public class SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecord   {
  private SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecordSystemAdministrationActivityAnalysis systemAdministrationActivityAnalysis = null;

  private SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecordSystemAdministrationPerformanceAnalysis systemAdministrationPerformanceAnalysis = null;

  private SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get systemAdministrationActivityAnalysis
   * @return systemAdministrationActivityAnalysis
  **/

  public SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecordSystemAdministrationActivityAnalysis getSystemAdministrationActivityAnalysis() {
    return systemAdministrationActivityAnalysis;
  }

  public void setSystemAdministrationActivityAnalysis(SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecordSystemAdministrationActivityAnalysis systemAdministrationActivityAnalysis) {
    this.systemAdministrationActivityAnalysis = systemAdministrationActivityAnalysis;
  }


  /**
   * Get systemAdministrationPerformanceAnalysis
   * @return systemAdministrationPerformanceAnalysis
  **/

  public SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecordSystemAdministrationPerformanceAnalysis getSystemAdministrationPerformanceAnalysis() {
    return systemAdministrationPerformanceAnalysis;
  }

  public void setSystemAdministrationPerformanceAnalysis(SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecordSystemAdministrationPerformanceAnalysis systemAdministrationPerformanceAnalysis) {
    this.systemAdministrationPerformanceAnalysis = systemAdministrationPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDSystemAdministrationRetrieveOutputModelSystemAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

