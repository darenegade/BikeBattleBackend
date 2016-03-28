package edu.hm.cs.bikebattle.event;

import edu.hm.cs.bikebattle.domain.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by GAIA.
 */

/**
 * This event-listener allows a RouteEventService to implement logic before and after Events.
 */
@Component
public class Route_EventListener extends AbstractRepositoryEventListener<Route> {
	@Autowired
	Route_EventListener service;
	
	@Override
	protected void onAfterCreate(Route entity) {
		service.onAfterCreate(entity);
	}
	@Override
	protected void onBeforeCreate(Route entity) {
		service.onBeforeCreate(entity);
	}
	@Override
	protected void onBeforeSave(Route entity) {
		service.onBeforeSave(entity);
	}
	@Override
	protected void onAfterSave(Route entity) {
		service.onAfterSave(entity);
	}
	@Override
	protected void onBeforeLinkSave(Route parent, Object linked) {
		service.onBeforeLinkSave(parent, linked);
	}
	@Override
	protected void onAfterLinkSave(Route parent, Object linked) {
		service.onAfterLinkSave(parent, linked);
	}
	@Override
	protected void onBeforeLinkDelete(Route parent, Object linked) {
		service.onBeforeLinkDelete(parent, linked);
	}
	@Override
	protected void onBeforeDelete(Route entity) {
		service.onBeforeDelete(entity);
	}
	@Override
	protected void onAfterDelete(Route entity) {
		service.onAfterDelete(entity);
	}
	@Override
	protected void onAfterLinkDelete(Route parent, Object linked) {
		service.onAfterLinkDelete(parent, linked);
	}
}
