/*
 * Copyright (c) 2014 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.rms.components.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eventb.emf.core.CorePackage;

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.rms.components.diagram.edit.parts.EventBComponentNameEditPart;
import ac.soton.rms.components.diagram.edit.parts.FMUComponentNameEditPart;
import ac.soton.rms.components.diagram.parsers.MessageFormatParser;
import ac.soton.rms.components.diagram.part.ComponentsVisualIDRegistry;

/**
 * @generated
 */
public class ComponentsParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser fMUComponentName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getFMUComponentName_5001Parser() {
		if (fMUComponentName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getEventBNamed_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fMUComponentName_5001Parser = parser;
		}
		return fMUComponentName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventBComponentLabel_5002Parser;

	/**
	 * @generated
	 */
	private IParser getEventBComponentLabel_5002Parser() {
		if (eventBComponentLabel_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CoreextensionPackage.eINSTANCE
					.getEventBLabeled_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventBComponentLabel_5002Parser = parser;
		}
		return eventBComponentLabel_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case FMUComponentNameEditPart.VISUAL_ID:
			return getFMUComponentName_5001Parser();
		case EventBComponentNameEditPart.VISUAL_ID:
			return getEventBComponentLabel_5002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ComponentsVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ComponentsVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ComponentsElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
