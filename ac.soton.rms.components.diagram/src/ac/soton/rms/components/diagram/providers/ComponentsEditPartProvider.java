/*
 * Copyright (c) 2014 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.rms.components.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import ac.soton.rms.components.diagram.edit.parts.ComponentDiagramEditPart;
import ac.soton.rms.components.diagram.edit.parts.ComponentsEditPartFactory;
import ac.soton.rms.components.diagram.part.ComponentsVisualIDRegistry;

/**
 * @generated
 */
public class ComponentsEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public ComponentsEditPartProvider() {
		super(new ComponentsEditPartFactory(),
				ComponentsVisualIDRegistry.TYPED_INSTANCE,
				ComponentDiagramEditPart.MODEL_ID);
	}

}
