/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class SystemAdministrationApiServiceImpl implements SystemAdministrationApiService {

	public SDSystemAdministrationActivateOutputModel activate(SDSystemAdministrationActivateInputModel request){
		return JsonReader.read("activate-SDSystemAdministrationActivateOutputModel.json",new TypeReference<SDSystemAdministrationActivateOutputModel>(){});
	}
	
	public BQAssuranceCaptureOutputModel captureAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssuranceCaptureInputModel request){
		return JsonReader.read("capture-BQAssuranceCaptureOutputModel.json",new TypeReference<BQAssuranceCaptureOutputModel>(){});
	}
	
	public BQCapacityPlanningandResilienceCaptureOutputModel captureCapacityplanningandresilience(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningandResilienceCaptureInputModel request){
		return JsonReader.read("capture-BQCapacityPlanningandResilienceCaptureOutputModel.json",new TypeReference<BQCapacityPlanningandResilienceCaptureOutputModel>(){});
	}
	
	public BQConfigurationCaptureOutputModel captureConfiguration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConfigurationCaptureInputModel request){
		return JsonReader.read("capture-BQConfigurationCaptureOutputModel.json",new TypeReference<BQConfigurationCaptureOutputModel>(){});
	}
	
	public BQInventoryCaptureOutputModel captureInventory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryCaptureInputModel request){
		return JsonReader.read("capture-BQInventoryCaptureOutputModel.json",new TypeReference<BQInventoryCaptureOutputModel>(){});
	}
	
	public CRITSystemAdministrativePlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRITSystemAdministrativePlanCaptureInputModel request){
		return JsonReader.read("capture-CRITSystemAdministrativePlanCaptureOutputModel.json",new TypeReference<CRITSystemAdministrativePlanCaptureOutputModel>(){});
	}
	
	public SDSystemAdministrationConfigureOutputModel configure(String sdReferenceId, SDSystemAdministrationConfigureInputModel request){
		return JsonReader.read("configure-SDSystemAdministrationConfigureOutputModel.json",new TypeReference<SDSystemAdministrationConfigureOutputModel>(){});
	}
	
	public CRITSystemAdministrativePlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRITSystemAdministrativePlanControlInputModel request){
		return JsonReader.read("control-CRITSystemAdministrativePlanControlOutputModel.json",new TypeReference<CRITSystemAdministrativePlanControlOutputModel>(){});
	}
	
	public CRITSystemAdministrativePlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRITSystemAdministrativePlanExchangeInputModel request){
		return JsonReader.read("exchange-CRITSystemAdministrativePlanExchangeOutputModel.json",new TypeReference<CRITSystemAdministrativePlanExchangeOutputModel>(){});
	}
	
	public SDSystemAdministrationFeedbackOutputModel feedback(String sdReferenceId, SDSystemAdministrationFeedbackInputModel request){
		return JsonReader.read("feedback-SDSystemAdministrationFeedbackOutputModel.json",new TypeReference<SDSystemAdministrationFeedbackOutputModel>(){});
	}
	
	public CRITSystemAdministrativePlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRITSystemAdministrativePlanGrantInputModel request){
		return JsonReader.read("grant-CRITSystemAdministrativePlanGrantOutputModel.json",new TypeReference<CRITSystemAdministrativePlanGrantOutputModel>(){});
	}
	
	public CRITSystemAdministrativePlanInitiateOutputModel initiate(String sdReferenceId, CRITSystemAdministrativePlanInitiateInputModel request){
		return JsonReader.read("initiate-CRITSystemAdministrativePlanInitiateOutputModel.json",new TypeReference<CRITSystemAdministrativePlanInitiateOutputModel>(){});
	}
	
	public BQAssuranceRequestOutputModel requestAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssuranceRequestInputModel request){
		return JsonReader.read("request-BQAssuranceRequestOutputModel.json",new TypeReference<BQAssuranceRequestOutputModel>(){});
	}
	
	public BQCapacityPlanningandResilienceRequestOutputModel requestCapacityplanningandresilience(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningandResilienceRequestInputModel request){
		return JsonReader.read("request-BQCapacityPlanningandResilienceRequestOutputModel.json",new TypeReference<BQCapacityPlanningandResilienceRequestOutputModel>(){});
	}
	
	public BQConfigurationRequestOutputModel requestConfiguration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConfigurationRequestInputModel request){
		return JsonReader.read("request-BQConfigurationRequestOutputModel.json",new TypeReference<BQConfigurationRequestOutputModel>(){});
	}
	
	public BQInventoryRequestOutputModel requestInventory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryRequestInputModel request){
		return JsonReader.read("request-BQInventoryRequestOutputModel.json",new TypeReference<BQInventoryRequestOutputModel>(){});
	}
	
	public CRITSystemAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRITSystemAdministrativePlanRequestInputModel request){
		return JsonReader.read("request-CRITSystemAdministrativePlanRequestOutputModel.json",new TypeReference<CRITSystemAdministrativePlanRequestOutputModel>(){});
	}
	
	public BQAssuranceRetrieveOutputModel retrieveAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssuranceRetrieveOutputModel.json",new TypeReference<BQAssuranceRetrieveOutputModel>(){});
	}
	
	public BQCapacityPlanningandResilienceRetrieveOutputModel retrieveCapacityplanningandresilience(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCapacityPlanningandResilienceRetrieveOutputModel.json",new TypeReference<BQCapacityPlanningandResilienceRetrieveOutputModel>(){});
	}
	
	public BQConfigurationRetrieveOutputModel retrieveConfiguration(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQConfigurationRetrieveOutputModel.json",new TypeReference<BQConfigurationRetrieveOutputModel>(){});
	}
	
	public BQInventoryRetrieveOutputModel retrieveInventory(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInventoryRetrieveOutputModel.json",new TypeReference<BQInventoryRetrieveOutputModel>(){});
	}
	
	public SDSystemAdministrationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDSystemAdministrationRetrieveOutputModel.json",new TypeReference<SDSystemAdministrationRetrieveOutputModel>(){});
	}
	
	public CRITSystemAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRITSystemAdministrativePlanRetrieveOutputModel.json",new TypeReference<CRITSystemAdministrativePlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CRITSystemAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRITSystemAdministrativePlanUpdateInputModel request){
		return JsonReader.read("update-CRITSystemAdministrativePlanUpdateOutputModel.json",new TypeReference<CRITSystemAdministrativePlanUpdateOutputModel>(){});
	}
	
	public BQAssuranceUpdateOutputModel updateAssurance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssuranceUpdateInputModel request){
		return JsonReader.read("update-BQAssuranceUpdateOutputModel.json",new TypeReference<BQAssuranceUpdateOutputModel>(){});
	}
	
	public BQCapacityPlanningandResilienceUpdateOutputModel updateCapacityplanningandresilience(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningandResilienceUpdateInputModel request){
		return JsonReader.read("update-BQCapacityPlanningandResilienceUpdateOutputModel.json",new TypeReference<BQCapacityPlanningandResilienceUpdateOutputModel>(){});
	}
	
	public BQConfigurationUpdateOutputModel updateConfiguration(String sdReferenceId, String crReferenceId, String bqReferenceId, BQConfigurationUpdateInputModel request){
		return JsonReader.read("update-BQConfigurationUpdateOutputModel.json",new TypeReference<BQConfigurationUpdateOutputModel>(){});
	}
	
	public BQInventoryUpdateOutputModel updateInventory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInventoryUpdateInputModel request){
		return JsonReader.read("update-BQInventoryUpdateOutputModel.json",new TypeReference<BQInventoryUpdateOutputModel>(){});
	}
	
}
