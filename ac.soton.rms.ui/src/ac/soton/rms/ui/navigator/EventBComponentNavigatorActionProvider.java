/**
 * Copyright (c) 2014 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.rms.ui.navigator;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.navigator.CommonActionProvider;

import ac.soton.rms.ui.actions.DeleteEventBComponentAction;

/**
 * Action to delete Event-B Component from the Machine.
 * 
 * @author vitaly
 *
 */
public class EventBComponentNavigatorActionProvider extends
		CommonActionProvider {

	@Override
	public void fillContextMenu(IMenuManager menu) {
		super.fillContextMenu(menu);
		menu.appendToGroup(IWorkbenchActionConstants.MB_ADDITIONS, new DeleteEventBComponentAction(getActionSite()));
	}

	@Override
	public void fillActionBars(IActionBars actionBars) {
		super.fillActionBars(actionBars);
        // forwards pressing the delete key to deleteAction
        actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), new DeleteEventBComponentAction(getActionSite()));
	}
}
