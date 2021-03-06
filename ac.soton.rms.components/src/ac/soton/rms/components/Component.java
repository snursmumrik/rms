/**
 * Copyright (c) 2014 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * $Id$
 */
package ac.soton.rms.components;

import ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.rms.components.Component#getInputs <em>Inputs</em>}</li>
 *   <li>{@link ac.soton.rms.components.Component#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link ac.soton.rms.components.Component#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.rms.components.ComponentsPackage#getComponent()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Component extends EventBLabeled {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2014 University of Southampton.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html";

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.rms.components.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see ac.soton.rms.components.ComponentsPackage#getComponent_Inputs()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Port> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.rms.components.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see ac.soton.rms.components.ComponentsPackage#getComponent_Outputs()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Port> getOutputs();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.rms.components.AbstractVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ac.soton.rms.components.ComponentsPackage#getComponent_Variables()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<AbstractVariable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ac.soton.rms.components.IStatus"
	 * @generated
	 */
	IStatus instantiate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ac.soton.rms.components.IStatus"
	 * @generated
	 */
	IStatus initialise(double tStart, double tStop);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ac.soton.rms.components.IStatus"
	 * @generated
	 */
	IStatus readInputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ac.soton.rms.components.IStatus"
	 * @generated
	 */
	IStatus writeOutputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ac.soton.rms.components.IStatus"
	 * @generated
	 */
	IStatus doStep(double time, double step);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ac.soton.rms.components.IStatus"
	 * @generated
	 */
	IStatus terminate();

} // Component
