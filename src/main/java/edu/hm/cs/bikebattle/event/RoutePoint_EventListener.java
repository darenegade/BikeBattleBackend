package edu.hm.cs.bikebattle.event;

import edu.hm.cs.bikebattle.domain.RoutePoint;
import edu.hm.cs.bikebattle.services.RoutePoint_EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

/*
 * This file will be overwritten on every change of the model!
 * This file was automatically generated by GAIA.
 */

/**
 * This event-listener allows a RoutePointEventService to implement logic before and after Events.
 */
@Component
public class RoutePoint_EventListener extends AbstractRepositoryEventListener<RoutePoint> {
	@Autowired
	RoutePoint_EventService service;
	
	@Override
	protected void onAfterCreate(RoutePoint entity) {
		service.onAfterCreate(entity);
	}
	@Override
	protected void onBeforeCreate(RoutePoint entity) {
		service.onBeforeCreate(entity);
	}
	@Override
	protected void onBeforeSave(RoutePoint entity) {
		service.onBeforeSave(entity);
	}
	@Override
	protected void onAfterSave(RoutePoint entity) {
		service.onAfterSave(entity);
	}
	@Override
	protected void onBeforeLinkSave(RoutePoint parent, Object linked) {
		service.onBeforeLinkSave(parent, linked);
	}
	@Override
	protected void onAfterLinkSave(RoutePoint parent, Object linked) {
		service.onAfterLinkSave(parent, linked);
	}
	@Override
	protected void onBeforeLinkDelete(RoutePoint parent, Object linked) {
		service.onBeforeLinkDelete(parent, linked);
	}
	@Override
	protected void onBeforeDelete(RoutePoint entity) {
		service.onBeforeDelete(entity);
	}
	@Override
	protected void onAfterDelete(RoutePoint entity) {
		service.onAfterDelete(entity);
	}
	@Override
	protected void onAfterLinkDelete(RoutePoint parent, Object linked) {
		service.onAfterLinkDelete(parent, linked);
	}
}