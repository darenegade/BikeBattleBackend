package edu.hm.cs.bikebattle.event;

import edu.hm.cs.bikebattle.domain.Measurement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by GAIA.
 */

/**
 * This event-listener allows a MeasurementEventService to implement logic before and after Events.
 */
@Component
public class Measurement_EventListener extends AbstractRepositoryEventListener<Measurement> {
	@Autowired
	Measurement_EventListener service;
	
	@Override
	protected void onAfterCreate(Measurement entity) {
		service.onAfterCreate(entity);
	}
	@Override
	protected void onBeforeCreate(Measurement entity) {
		service.onBeforeCreate(entity);
	}
	@Override
	protected void onBeforeSave(Measurement entity) {
		service.onBeforeSave(entity);
	}
	@Override
	protected void onAfterSave(Measurement entity) {
		service.onAfterSave(entity);
	}
	@Override
	protected void onBeforeLinkSave(Measurement parent, Object linked) {
		service.onBeforeLinkSave(parent, linked);
	}
	@Override
	protected void onAfterLinkSave(Measurement parent, Object linked) {
		service.onAfterLinkSave(parent, linked);
	}
	@Override
	protected void onBeforeLinkDelete(Measurement parent, Object linked) {
		service.onBeforeLinkDelete(parent, linked);
	}
	@Override
	protected void onBeforeDelete(Measurement entity) {
		service.onBeforeDelete(entity);
	}
	@Override
	protected void onAfterDelete(Measurement entity) {
		service.onAfterDelete(entity);
	}
	@Override
	protected void onAfterLinkDelete(Measurement parent, Object linked) {
		service.onAfterLinkDelete(parent, linked);
	}
}
