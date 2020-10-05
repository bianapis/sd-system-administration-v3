/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface SystemAdministrationApiService {

	SDSystemAdministrationActivateOutputModel activate(SDSystemAdministrationActivateInputModel request);
	
	BQAssuranceCaptureOutputModel captureAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssuranceCaptureInputModel request);
	
	BQCapacityPlanningandResilienceCaptureOutputModel captureCapacityplanningandresilience(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningandResilienceCaptureInputModel request);
	
	BQConfigurationCaptureOutputModel captureConfiguration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConfigurationCaptureInputModel request);
	
	BQInventoryCaptureOutputModel captureInventory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryCaptureInputModel request);
	
	CRITSystemAdministrativePlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRITSystemAdministrativePlanCaptureInputModel request);
	
	SDSystemAdministrationConfigureOutputModel configure(String sdReferenceId, SDSystemAdministrationConfigureInputModel request);
	
	CRITSystemAdministrativePlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRITSystemAdministrativePlanControlInputModel request);
	
	CRITSystemAdministrativePlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRITSystemAdministrativePlanExchangeInputModel request);
	
	SDSystemAdministrationFeedbackOutputModel feedback(String sdReferenceId, SDSystemAdministrationFeedbackInputModel request);
	
	CRITSystemAdministrativePlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRITSystemAdministrativePlanGrantInputModel request);
	
	CRITSystemAdministrativePlanInitiateOutputModel initiate(String sdReferenceId, CRITSystemAdministrativePlanInitiateInputModel request);
	
	BQAssuranceRequestOutputModel requestAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssuranceRequestInputModel request);
	
	BQCapacityPlanningandResilienceRequestOutputModel requestCapacityplanningandresilience(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningandResilienceRequestInputModel request);
	
	BQConfigurationRequestOutputModel requestConfiguration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConfigurationRequestInputModel request);
	
	BQInventoryRequestOutputModel requestInventory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryRequestInputModel request);
	
	CRITSystemAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRITSystemAdministrativePlanRequestInputModel request);
	
	BQAssuranceRetrieveOutputModel retrieveAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCapacityPlanningandResilienceRetrieveOutputModel retrieveCapacityplanningandresilience(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQConfigurationRetrieveOutputModel retrieveConfiguration(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInventoryRetrieveOutputModel retrieveInventory(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDSystemAdministrationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRITSystemAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	CRITSystemAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRITSystemAdministrativePlanUpdateInputModel request);
	
	BQAssuranceUpdateOutputModel updateAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssuranceUpdateInputModel request);
	
	BQCapacityPlanningandResilienceUpdateOutputModel updateCapacityplanningandresilience(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningandResilienceUpdateInputModel request);
	
	BQConfigurationUpdateOutputModel updateConfiguration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConfigurationUpdateInputModel request);
	
	BQInventoryUpdateOutputModel updateInventory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryUpdateInputModel request);
	
}
