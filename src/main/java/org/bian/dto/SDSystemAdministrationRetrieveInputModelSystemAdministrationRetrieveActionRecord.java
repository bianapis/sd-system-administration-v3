package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecordSystemAdministrationActivityAnalysis;
import org.bian.dto.SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecordSystemAdministrationPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecord
 */
public class SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecord   {
  private SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecordSystemAdministrationActivityAnalysis systemAdministrationActivityAnalysis = null;

  private SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecordSystemAdministrationPerformanceAnalysis systemAdministrationPerformanceAnalysis = null;

  private SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get systemAdministrationActivityAnalysis
   * @return systemAdministrationActivityAnalysis
  **/

  public SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecordSystemAdministrationActivityAnalysis getSystemAdministrationActivityAnalysis() {
    return systemAdministrationActivityAnalysis;
  }

  public void setSystemAdministrationActivityAnalysis(SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecordSystemAdministrationActivityAnalysis systemAdministrationActivityAnalysis) {
    this.systemAdministrationActivityAnalysis = systemAdministrationActivityAnalysis;
  }


  /**
   * Get systemAdministrationPerformanceAnalysis
   * @return systemAdministrationPerformanceAnalysis
  **/

  public SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecordSystemAdministrationPerformanceAnalysis getSystemAdministrationPerformanceAnalysis() {
    return systemAdministrationPerformanceAnalysis;
  }

  public void setSystemAdministrationPerformanceAnalysis(SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecordSystemAdministrationPerformanceAnalysis systemAdministrationPerformanceAnalysis) {
    this.systemAdministrationPerformanceAnalysis = systemAdministrationPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDSystemAdministrationRetrieveInputModelSystemAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

