package com.acme.eventbus.client;

import com.google.gwt.event.shared.EventHandler;

public interface ClearEventHandler extends EventHandler {
	void clear(ClearEvent event);
}
