/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class SystemAdministrationApiController {

	@Autowired
	SystemAdministrationApiService service;
	
	@Administer.Activate
	public BianResponse<SDSystemAdministrationActivateOutputModel> activate(@RequestBody BianRequest<SDSystemAdministrationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("assurance")
	@Administer.Capture
	public BianResponse<BQAssuranceCaptureOutputModel> captureAssurance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssuranceCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureAssurance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("capacityplanningandresilience")
	@Administer.Capture
	public BianResponse<BQCapacityPlanningandResilienceCaptureOutputModel> captureCapacityplanningandresilience(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCapacityPlanningandResilienceCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureCapacityplanningandresilience(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("configuration")
	@Administer.Capture
	public BianResponse<BQConfigurationCaptureOutputModel> captureConfiguration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQConfigurationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureConfiguration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventory")
	@Administer.Capture
	public BianResponse<BQInventoryCaptureOutputModel> captureInventory(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureInventory(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Capture
	public BianResponse<CRITSystemAdministrativePlanCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRITSystemAdministrativePlanCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Configure
	public BianResponse<SDSystemAdministrationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSystemAdministrationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Administer.Control
	public BianResponse<CRITSystemAdministrativePlanControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRITSystemAdministrativePlanControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Exchange
	public BianResponse<CRITSystemAdministrativePlanExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRITSystemAdministrativePlanExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Feedback
	public BianResponse<SDSystemAdministrationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSystemAdministrationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Administer.Grant
	public BianResponse<CRITSystemAdministrativePlanGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRITSystemAdministrativePlanGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Initiate
	public BianResponse<CRITSystemAdministrativePlanInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRITSystemAdministrativePlanInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("assurance")
	@Administer.Request
	public BianResponse<BQAssuranceRequestOutputModel> requestAssurance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssuranceRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestAssurance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("capacityplanningandresilience")
	@Administer.Request
	public BianResponse<BQCapacityPlanningandResilienceRequestOutputModel> requestCapacityplanningandresilience(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCapacityPlanningandResilienceRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestCapacityplanningandresilience(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("configuration")
	@Administer.Request
	public BianResponse<BQConfigurationRequestOutputModel> requestConfiguration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQConfigurationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestConfiguration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventory")
	@Administer.Request
	public BianResponse<BQInventoryRequestOutputModel> requestInventory(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestInventory(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Request
	public BianResponse<CRITSystemAdministrativePlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRITSystemAdministrativePlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assurance")
	@Administer.Retrieve
	public BianResponse<BQAssuranceRetrieveOutputModel> retrieveAssurance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssurance(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("capacityplanningandresilience")
	@Administer.Retrieve
	public BianResponse<BQCapacityPlanningandResilienceRetrieveOutputModel> retrieveCapacityplanningandresilience(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCapacityplanningandresilience(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("configuration")
	@Administer.Retrieve
	public BianResponse<BQConfigurationRetrieveOutputModel> retrieveConfiguration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveConfiguration(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("inventory")
	@Administer.Retrieve
	public BianResponse<BQInventoryRetrieveOutputModel> retrieveInventory(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInventory(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Administer.RetrieveSD
	public BianResponse<SDSystemAdministrationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Administer.Retrieve
	public BianResponse<CRITSystemAdministrativePlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Administer.Update
	public BianResponse<CRITSystemAdministrativePlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRITSystemAdministrativePlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assurance")
	@Administer.Update
	public BianResponse<BQAssuranceUpdateOutputModel> updateAssurance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssuranceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAssurance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("capacityplanningandresilience")
	@Administer.Update
	public BianResponse<BQCapacityPlanningandResilienceUpdateOutputModel> updateCapacityplanningandresilience(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCapacityPlanningandResilienceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCapacityplanningandresilience(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("configuration")
	@Administer.Update
	public BianResponse<BQConfigurationUpdateOutputModel> updateConfiguration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQConfigurationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateConfiguration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventory")
	@Administer.Update
	public BianResponse<BQInventoryUpdateOutputModel> updateInventory(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInventoryUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInventory(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
