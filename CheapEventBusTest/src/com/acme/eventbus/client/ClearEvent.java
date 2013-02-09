package com.acme.eventbus.client;

import com.google.gwt.event.shared.GwtEvent;

public class ClearEvent extends GwtEvent<ClearEventHandler> {
	
	public static final Type<ClearEventHandler> TYPE = new Type<ClearEventHandler>();

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<ClearEventHandler> getAssociatedType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	protected void dispatch(ClearEventHandler handler) {
		handler.clear(this);
	}

}
